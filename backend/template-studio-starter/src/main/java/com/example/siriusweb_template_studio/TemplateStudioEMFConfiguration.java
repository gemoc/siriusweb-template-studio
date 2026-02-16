package com.example.siriusweb_template_studio;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.siriusweb_template_studio.sampleemfdomain.SampleemfdomainPackage;
import com.example.siriusweb_template_studio.sampleemfdomain.provider.SampleemfdomainItemProviderAdapterFactory;

@Configuration
public class TemplateStudioEMFConfiguration {

    // Add here as many EMF AdapterFactory and EPackage beans as you have domain models. 
    @Bean
    AdapterFactory sampleemfdomainAdapterFactory() {
        return new SampleemfdomainItemProviderAdapterFactory();
    }

    @Bean
    EPackage sampleemfdomainEPackage() {
        return SampleemfdomainPackage.eINSTANCE;
    }
}
