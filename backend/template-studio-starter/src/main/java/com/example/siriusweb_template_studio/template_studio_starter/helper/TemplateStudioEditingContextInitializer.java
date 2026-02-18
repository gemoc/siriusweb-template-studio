package com.example.siriusweb_template_studio.template_studio_starter.helper;


import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IEditingContextProcessor;
import org.eclipse.sirius.web.application.editingcontext.EditingContext;
import org.eclipse.sirius.web.domain.boundedcontexts.project.services.api.IProjectSearchService;
import org.eclipse.sirius.web.domain.boundedcontexts.projectsemanticdata.services.api.IProjectSemanticDataSearchService;
import org.springframework.stereotype.Service;

import com.example.siriusweb_template_studio.sampleemfdomain.SampleemfdomainPackage;

@Service
public class TemplateStudioEditingContextInitializer implements IEditingContextProcessor {
    
    private final IProjectSearchService projectSearchService;
    private final IProjectSemanticDataSearchService projectSemanticDataSearchService;

    public TemplateStudioEditingContextInitializer(IProjectSearchService projectSearchService, IProjectSemanticDataSearchService projectSemanticDataSearchService) {
        this.projectSearchService = projectSearchService;
     
        this.projectSemanticDataSearchService = projectSemanticDataSearchService;
    }


    @Override
    public void preProcess(IEditingContext editingContext) {
        // Here you can add any additional data to the editing context that you want to be available in the client side.
        // For example, you can add the list of projects and their semantic data to the editing context, so that they can be used in the client side to populate dropdowns or other UI elements.


        // optionally filter to apply only if the project is supposed to use the sampleemfdomain, for example by checking if the project contains a semantic data of type SampleemfdomainPackage.eINSTANCE.getYourRootClass()

        if (editingContext instanceof EditingContext emfEditingContext) {
            var packageRegistry = emfEditingContext.getDomain().getResourceSet().getPackageRegistry();
            packageRegistry.put(SampleemfdomainPackage.eNS_URI, SampleemfdomainPackage.eINSTANCE); // Register the EPackage in the editing context's resource set so that it can be used in the client side.


        }
        
    }
}
