package com.gestionrh.modeles;

public class Departement {
    private String nom;
    private int id;
    

    public Departement(int id,String nom) {
        this.nom = nom;
        this.id=id;
    }

    public String getNom() {
        return nom;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() { return id; }
    public void setNom(String nom) { this.nom = nom; }
}

