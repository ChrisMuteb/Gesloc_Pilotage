package com.example.webflow.utils;

public final class RequetHelper {
    public static final String REQ_LIST_DEPARTMENT = "SELECT ccodep, dlidep from departement order by ccodep";
    public static final String REQ_LIST_COMMUNE_PAR_DEPT = "SELECT ccocom, d40com FROM commune WHERE ccodep=:ccodep order by ccocom";
    public static final String REQ_LIST_APPLICATION = "SELECT idapplication, libelleapplication FROM application order by idapplication";
    public static final String REQ_LIST_REQUETE_PAR_APP = "select idrequete, libellerequete from requete where application=:application order by idrequete";
}
