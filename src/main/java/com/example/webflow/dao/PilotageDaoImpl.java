package com.example.webflow.dao;

import com.example.webflow.utils.RequetHelper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("pilotageDao")
public class PilotageDaoImpl implements PilotageDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Object[]> fetchDepartements() {
        List<Object[]> result = null;
        try
        {
            Query query = entityManager.createNativeQuery(RequetHelper.REQ_LIST_DEPARTMENT);
            result = query.getResultList();
        }catch (Exception exception){
            throw new RuntimeException("Exception occured during Departement retrieval of data" + exception);
        }
        return result;
    }

    @Override
    public List<Object> fetchCommuneByDepartement(String cdDept) {
        return null;
    }
}
