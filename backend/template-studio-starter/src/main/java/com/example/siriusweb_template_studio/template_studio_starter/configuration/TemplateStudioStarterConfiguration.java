package com.example.siriusweb_template_studio.template_studio_starter.configuration;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(basePackages = {         // Ensure that components from the project are scanned
        "com.example.siriusweb_template_studio" 
})
public class TemplateStudioStarterConfiguration {
}
