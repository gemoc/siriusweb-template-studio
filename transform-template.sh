#!/usr/bin/env bash
set -e

########################################
# CONFIGURATION
########################################
# IMPORTANT :
# - order = from more specific to more generic/shorter (ex: "com.template.project.sub" before "com.template.project")
# - format: "old=new"

# java packages
PACKAGE_RENAMES=(
  "com.example.siriusweb_template_studio.template_studio_app=fr.inria.diverse.ecodico.ecodicostudio.app"
  "com.example.siriusweb_template_studio.template_studio_starter=fr.inria.diverse.ecodico.ecodicostudio.starter"
  "com.example.siriusweb_template_studio.sampleemfdomain=fr.inria.diverse.ecodico.ecodicoprocess.model"
)

# java classes (file names + content)
CLASS_RENAMES=(
  "TemplateStudio=EcodicoStudio"
  "Sampleemfdomain=EcodicoProcess"
)

# secific folder (file names + content)
FOLDER_RENAMES=(
  "sample-emf-domain=ecodicoprocess-model"
  "sample-emf-domain-edit=ecodicoprocess-model-edit"
  "template-studio-app=ecodicostudio-app"
  "template-studio-starter=ecodicostudio-starter"
  "template-studio-parent=ecodicostudio-parent"
)

# other replacements (artifactId, strings, etc.)
TEXT_RENAMES=(
  "siriusweb-template-studio=ecodicostudio"
)

########################################
# UTILS
########################################

replace_in_files() {
  local old="$1"
  local new="$2"

  # Get the current script name (to avoid self-modification)
  local script_name
  script_name=$(basename "$0")

  echo "→ Replace: $old -> $new"

  grep -rl  --exclude-dir=.git  \
            --exclude="$script_name" \
            "$old" . | while read file; do
      sed -i "s|$old|$new|g" "$file"
    done
}

remove_empty_parents() {
  local dir="$1"
  local stop_at="$2"

  echo "    try Removing empty directory $dir up to $stop_at "

  # Walk upward until stop_at, removing empty directories
  while [ "$dir" != "$stop_at" ] && [ -d "$dir" ]; do

    # Stop if directory is not empty
    if [ "$(ls -A "$dir" 2>/dev/null)" ]; then


      break
    fi

    echo "    → Removing empty directory $dir"
    rmdir "$dir"

    dir=$(dirname "$dir")
  done
}

########################################
# 1. GLOBAL TEXT REPLACEMENT (packages, classes, artifactId, etc.)
########################################

echo "=== Text replacement ==="

for rule in "${PACKAGE_RENAMES[@]}"; do
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  replace_in_files "$OLD" "$NEW"
done

for rule in "${CLASS_RENAMES[@]}"; do
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  replace_in_files "$OLD" "$NEW"
done

for rule in "${FOLDER_RENAMES[@]}"; do
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  replace_in_files "$OLD" "$NEW"
done

for rule in "${TEXT_RENAMES[@]}"; do
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  replace_in_files "$OLD" "$NEW"
done

########################################
# 2. PACKAGE STRUCTURE RENAMING
########################################

echo "=== Renaming package directories ==="

rename_package_dir() {
  local old_pkg="$1"
  local new_pkg="$2"

  # Convert Java package to filesystem path
  local old_path
  local new_path
  old_path=$(echo "$old_pkg" | tr '.' '/')
  new_path=$(echo "$new_pkg" | tr '.' '/')

  # Find all Java source roots in the project (multi-module safe)
  find . -type d \( -path "*/src/main/java" -o -path "*/src/test/java" \) | while read src_root; do

    local source_dir="$src_root/$old_path"
    local target_dir="$src_root/$new_path"

    if [ -d "$source_dir" ]; then
      echo "  → Move $source_dir → $target_dir"

      # Create target directory
      mkdir -p "$target_dir"

      # Move contents safely
      if [ "$(ls -A "$source_dir" 2>/dev/null)" ]; then
        mv "$source_dir"/* "$target_dir/" 2>/dev/null || true
      fi

      # Remove empty parent directories up to src root
      remove_empty_parents "$source_dir" "$src_root"

    fi

  done
}

for rule in "${PACKAGE_RENAMES[@]}"; do
  echo "→ Renaming package: $rule"
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  rename_package_dir "$OLD" "$NEW"
done

########################################
# 3. RENAMING CLASSES (file names)
########################################

echo "=== Renaming class files ==="
for rule in "${CLASS_RENAMES[@]}"; do
  OLD="${rule%%=*}"
  NEW="${rule#*=}"

  find . -name "*$OLD*.java" | while read file; do
    newfile=$(echo "$file" | sed "s|$OLD|$NEW|g")
    echo "→ Rename $file → $newfile"
    mv "$file" "$newfile"
  done
done

########################################
# 4. RENAMING FOLDERs
########################################

echo "=== Renaming folders ==="

rename_folder() {
  local old_folder="$1"
  local new_folder="$2"


  # Find all Java source roots in the project (multi-module safe)
  find . -type d \( -path "*" \) | while read src_root; do

    local source_dir="$src_root/$old_folder"
    local target_dir="$src_root/$new_folder"

    if [ -d "$source_dir" ]; then
      echo "  → Move $source_dir → $target_dir"

      # Create target directory
      mkdir -p "$target_dir"

      # Move contents safely
      if [ "$(ls -A "$source_dir" 2>/dev/null)" ]; then
        mv "$source_dir"/* "$target_dir/" 2>/dev/null || true
      fi

      # Remove empty old directory tree
      rm -rf "$source_dir"

    fi

  done
}

for rule in "${FOLDER_RENAMES[@]}"; do
  echo "→ Renaming folder: $rule"
  OLD="${rule%%=*}"
  NEW="${rule#*=}"
  rename_folder "$OLD" "$NEW"
done

echo "=== OK ==="
