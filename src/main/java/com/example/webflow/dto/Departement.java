package com.example.webflow.dto;

import java.io.Serializable;

public class Departement extends CodeLibelle implements Serializable {
    public Departement() {
    }
    public Departement(String cd, String lib){
        this.code = cd;
        this.libelle = lib;
    }
}
