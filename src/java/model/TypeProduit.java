/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.Postgres;

/**
 *
 * @author MON ORDI
 */
public class TypeProduit extends Postgres{
    
    private int id;
    private String nom;
    private int propriete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPropriete() {
        return propriete;
    }

    public void setPropriete(int propriete) {
        this.propriete = propriete;
    }
    
    
}
