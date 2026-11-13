package com.example.webflow.service;

import com.example.webflow.dto.Application;
import com.example.webflow.dto.Commune;
import com.example.webflow.dto.Departement;
import com.example.webflow.dto.Requete;

import java.util.List;

public interface PilotageService {
    List<Departement> fetchDepartements();
    List<Commune> fetchCommunes(String dept);
    public List<Application> fetchApplications();
    public List<Requete> fetchRequetes(String app);
}
