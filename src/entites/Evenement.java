/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Who Am I
 */
public class Evenement {
    private int id_Ev;
  private String type_Ev;
  private Date date_Ev ;
  private Time heure_Ev;
  private float prix_Ev;
 private  int  idPro ;
 private int idClient ;
 private int  idAdmin;

   
 

    public Evenement(int id_Ev, String type_Ev, Date date_Ev, Time heure_Ev, float prix_Ev, int idPro, int idClient, int idAdmin) {
        this.id_Ev = id_Ev;
        this.type_Ev = type_Ev;
        this.date_Ev = date_Ev;
        this.heure_Ev = heure_Ev;
        this.prix_Ev = prix_Ev;
        this.idPro = idPro;
        this.idClient = idClient;
        this.idAdmin = idAdmin;
    }

    public Evenement(String type_Ev, Date date_Ev, Time heure_Ev, float prix_Ev) {
        this.type_Ev = type_Ev;
        this.date_Ev = date_Ev;
        this.heure_Ev = heure_Ev;
        this.prix_Ev = prix_Ev;
    }

    public int getId_Ev() {
        return id_Ev;
    }

  

    public String getType_Ev() {
        return type_Ev;
    }

    public void setType_Ev(String type_Ev) {
        this.type_Ev = type_Ev;
    }

    public Date getDate_Ev() {
        return date_Ev;
    }

    public void setDate_Ev(Date date_Ev) {
        this.date_Ev = date_Ev;
    }

    public Time getHeure_Ev() {
        return heure_Ev;
    }

    public void setHeure_Ev(Time heure_Ev) {
        this.heure_Ev = heure_Ev;
    }

    public float getPrix_Ev() {
        return prix_Ev;
    }

    public void setPrix_Ev(float prix_Ev) {
        this.prix_Ev = prix_Ev;
    }
   public int getIdPro() {
        return idPro;
    }

    public void setIdPro(int idPro) {
        this.idPro = idPro;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
}
