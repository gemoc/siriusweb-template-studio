package com.example.siriusweb_template_studio.template_studio_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.siriusweb_template_studio", "org.eclipse.sirius.web", "org.eclipse.sirius.components" })
public class TemplateStudioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateStudioAppApplication.class, args);
	}

}
