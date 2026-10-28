package com.example.webflow.utils;

public final class RequetHelper {
    public static String REQ_LIST_DEPARTMENT = "SELECT ccodep, dlidep from departement order by ccodep";
    public static String REQ_LIST_COMMUNE_PAR_DEPT = "SELECT cdcom, comlib FROM commune WHERE cdcom=:cddept order by cdcom";
}
