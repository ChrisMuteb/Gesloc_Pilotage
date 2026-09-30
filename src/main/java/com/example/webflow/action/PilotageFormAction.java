package com.example.webflow.action;

import org.springframework.webflow.action.FormAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class PilotageFormAction extends FormAction {

    @Override
    public Event setupForm(RequestContext requestContext) throws Exception {
//        bind(requestContext);

        return super.setupForm(requestContext);
    }

    public Event sumbmitDemande(RequestContext requestContext) throws Exception {
        bind(requestContext);

        return success();
    }
}
