package com.example.webflow.dto;

import java.io.Serializable;
import java.util.List;

public class PilotageForm implements Serializable {
    private String cdDepartement;
    private String cdCommune;
    private String cdApplication;
    private String cdRequete;
    private String cdEmail;
    private List<String> departements;
    private List<String> communes;
    private List<String> application;
    private List<String> requetes;

    public String getCdDepartement() {
        return cdDepartement;
    }

    public void setCdDepartement(String cdDepartement) {
        this.cdDepartement = cdDepartement;
    }

    public String getCdCommune() {
        return cdCommune;
    }

    public void setCdCommune(String cdCommune) {
        this.cdCommune = cdCommune;
    }

    public String getCdApplication() {
        return cdApplication;
    }

    public void setCdApplication(String cdApplication) {
        this.cdApplication = cdApplication;
    }

    public String getCdRequete() {
        return cdRequete;
    }

    public void setCdRequete(String cdRequete) {
        this.cdRequete = cdRequete;
    }

    public String getCdEmail() {
        return cdEmail;
    }

    public void setCdEmail(String cdEmail) {
        this.cdEmail = cdEmail;
    }

    public List<String> getDepartements() {
        return departements;
    }

    public void setDepartements(List<String> departements) {
        this.departements = departements;
    }

    public List<String> getCommunes() {
        return communes;
    }

    public void setCommunes(List<String> communes) {
        this.communes = communes;
    }

    public List<String> getApplication() {
        return application;
    }

    public void setApplication(List<String> application) {
        this.application = application;
    }

    public List<String> getRequetes() {
        return requetes;
    }

    public void setRequetes(List<String> requetes) {
        this.requetes = requetes;
    }
}
