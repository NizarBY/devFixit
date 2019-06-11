/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Who Am I
 */
public class SujetForum {
   private  int id_sujet;
   private  String nom_sujet;

    public SujetForum(int id_sujet, String nom_sujet) {
        this.id_sujet = id_sujet;
        this.nom_sujet = nom_sujet;
    }

    public int getId_sujet() {
        return id_sujet;
    }

    public void setId_sujet(int id_sujet) {
        this.id_sujet = id_sujet;
    }

    public String getNom_sujet() {
        return nom_sujet;
    }

    public void setNom_sujet(String nom_sujet) {
        this.nom_sujet = nom_sujet;
    }
   
    
}
