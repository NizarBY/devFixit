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
//Fournisseur
public class Provider extends User {
    
    private int cin_p;
    //matricule fiscale 
    private String mf_p;
    //regestre de commerce 
    private String rc_p;

    public int getCin_p() {
        return cin_p;
    }

    public void setCin_p(int cin_p) {
        this.cin_p = cin_p;
    }

    public String getMf_p() {
        return mf_p;
    }

    public void setMf_p(String mf_p) {
        this.mf_p = mf_p;
    }

    public String getRc_p() {
        return rc_p;
    }

    public void setRc_p(String rc_p) {
        this.rc_p = rc_p;
    }
    
   
    
}
