package com.example.webflow.action;

import com.example.webflow.dto.Departement;
import com.example.webflow.dto.PilotageForm;
import com.example.webflow.service.PilotageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.webflow.action.FormAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PilotageFormAction extends FormAction {
    @Autowired
    private PilotageService pilotageService;


    @Override
    public Event setupForm(RequestContext requestContext) throws Exception {
        bind(requestContext);

        PilotageForm pilotageForm = new PilotageForm();
        List<Departement> departementList = new ArrayList<>();

        try {
            departementList = this.pilotageService.fetchDepartements();
        }catch (Exception e){
            requestContext.getFlowScope().put("Error", e);
        }


        pilotageForm.setDepartements(departementList);

        requestContext.getFlowScope().put("pilotageForm", pilotageForm);

        return super.setupForm(requestContext);
    }

    public Event sumbmitDemande(RequestContext requestContext) throws Exception {
        bind(requestContext);

        PilotageForm pilotageForm = (PilotageForm) requestContext.getFlowScope().get("pilotageForm"); // pilotageForm

        return success();
    }
}
