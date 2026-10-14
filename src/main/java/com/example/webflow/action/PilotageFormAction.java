package com.example.webflow.action;

import com.example.webflow.dto.Departement;
import com.example.webflow.dto.PilotageForm;
import org.springframework.webflow.action.FormAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PilotageFormAction extends FormAction {

    @Override
    public Event setupForm(RequestContext requestContext) throws Exception {
        bind(requestContext);
        PilotageForm pilotageForm = new PilotageForm();

        List<Departement> departementList = new ArrayList<>();
        departementList.add(new Departement("999", "National"));
        HashMap<String,String> depart = new HashMap<String, String>();
        depart.put("92", "Haut-seine");
        depart.put("75", "Paris");
        depart.put("94", "Val-de-Marne");
        for(String i: depart.keySet())
        {
            Departement departement = new Departement();
            departement.setCode(i);
            departement.setLibelle(depart.get(i));
            departementList.add(departement);
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
