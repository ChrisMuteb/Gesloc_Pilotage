package com.example.webflow.service;

import com.example.webflow.dao.PilotageDao;
import com.example.webflow.dto.Application;
import com.example.webflow.dto.Commune;
import com.example.webflow.dto.Departement;
import com.example.webflow.dto.Requete;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PilotageServiceImpl implements PilotageService{

    private PilotageDao pilotageDao;

    public PilotageServiceImpl(PilotageDao pilotageDao) {
        this.pilotageDao = pilotageDao;
    }

    @Override
    public List<Departement> fetchDepartements() throws RuntimeException {
        List<Departement> resultsDep = new ArrayList<>();

        List<Object[]> results = this.pilotageDao.fetchDepartements();

        if(results.isEmpty()) return resultsDep;

        for(Object[] rs: results){
            Departement departement = new Departement();
            departement.setCode(rs[0].toString());
            departement.setLibelle(rs[1].toString());
            resultsDep.add(departement);
        }

        return resultsDep;
    }

    @Override
    public List<Commune> fetchCommunes(String dept) throws RuntimeException
    {
        List<Commune> resultCom = new ArrayList<>();

        List<Object[]> results = this.pilotageDao.fetchCommuneByDepartement(dept);

        if(results.isEmpty()) return resultCom;

        for(Object[] rs: results){
            Commune commune = new Commune();
            commune.setCode(rs[0].toString());
            commune.setLibelle(rs[1].toString());
            resultCom.add(commune);
        }

        return resultCom;
    }

    @Override
    public List<Application> fetchApplications() throws RuntimeException
    {
        List<Application> applications = new ArrayList<>();

        List<Object[]> results = this.pilotageDao.fetchApplications();

        for(Object[] element: results){
            Application application = new Application();
            application.setCode((String) element[0]);
            application.setLibelle((String) element[1]);
            applications.add(application);
        }
        return applications;
    }

    @Override
    public List<Requete> fetchRequetes(String app) {
        List<Requete> requetes = new ArrayList<>();

        List<Object[]> results = this.pilotageDao.fetchRequetes(app);
        for(Object[] element: results){
            Requete requete = new Requete();
            requete.setCode(element[0].toString());
            requete.setLibelle((String) element[1]);

            requetes.add(requete);
        }

        return requetes;
    }
}
