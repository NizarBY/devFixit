/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Who Am I
 */
public class User {

    private String name;
    private int idUser;
    private String lastName;
    private boolean gender;
    private int telephoneU;
    private Date dateNaissance;
    private String adress_mail;
    private String login;
    private String pdw;
    private String adress;
    private int codePost;
    private String pays;
    private int cin;
    private String governorate;

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getCodePost() {
        return codePost;
    }

    public void setCodePost(int codePost) {
        this.codePost = codePost;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    private ArrayList< Professional> professional;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date date_naissance) {
        this.dateNaissance = date_naissance;
    }

    public int getTelephoneU() {
        return telephoneU;
    }

    public void setTelephoneU(int telephoneU) {
        this.telephoneU = telephoneU;
    }

    public String getAdress_mail() {
        return adress_mail;
    }

    public void setAdress_mail(String adress_mail) {
        this.adress_mail = adress_mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPdw() {
        return pdw;
    }

    public void setPdw(String pdw) {
        this.pdw = pdw;
    }

    public String getGovernorate() {
        return governorate;
    }

    public void setGovernorate(String governorate) {
        this.governorate = governorate;
    }
 
    public ArrayList< Professional> getProfessional() {
        return professional;
    }

    public void setProfessional(ArrayList< Professional> professional) {
        this.professional = professional;
    }

}
