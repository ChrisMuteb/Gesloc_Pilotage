package com.example.webflow.dao;

import java.util.List;

public interface PilotageDao {
    List<Object[]> fetchDepartements();
    List<Object[]> fetchCommuneByDepartement(String cdDept);
    List<Object[]> fetchApplications();
    List<Object[]> fetchRequetes(String app);
}
