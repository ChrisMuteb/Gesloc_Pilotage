package com.example.webflow.service;

import com.example.webflow.dao.PilotageDao;
import com.example.webflow.dto.Departement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
