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
//prestataire 
public class ServiceProvider extends User{
    private int cin_p; 
    //note de prestataire
    private int rating_p;
    //matricule fiscale 
    private String mf_p;
    //registre de commerce 
    private String rc_p;
    //description
     private String description;

    public int getCin_p() {
        return cin_p;
    }

    public void setCin_p(int cin_p) {
        this.cin_p = cin_p;
    }

    public int getRating_p() {
        return rating_p;
    }

    public void setRating_p(int rating_p) {
        this.rating_p = rating_p;
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
