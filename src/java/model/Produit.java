/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.Postgres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ITU
 */
public class Produit extends Postgres{
    private String id;
    String typeproduit;
    private String Nom;
    private float prix;
    private int fini;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    

    public int getFini() {
        return fini;
    }

    public void setFini(int fini) {
        this.fini = fini;
    }
    
    public float PrixRevient()
    {
        try {
        
            Statement stmt=this.getConnection().createStatement();
            String requete="select sum(prix) from qteingredientproduit where produit='"+this.getNom()+"'";
            ResultSet result=stmt.executeQuery(requete);
            float valiny=0;
            while(result.next())
            {
                valiny=result.getFloat(1);
            }
            stmt.close();
            result.close();
            return valiny;
        } catch (SQLException ex) {
            Logger.getLogger(Produit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
