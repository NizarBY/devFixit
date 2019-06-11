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
public class Localisation {
    private int id_loc;
    private String ville;
    private String delegation;
    private String adresse;
    private String coord_map_1;
    private String coord_map_2;

    public int getId_loc() {
        return id_loc;
    }

    public void setId_loc(int id_loc) {
        this.id_loc = id_loc;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCoord_map_1() {
        return coord_map_1;
    }

    public void setCoord_map_1(String coord_map_1) {
        this.coord_map_1 = coord_map_1;
    }

    public String getCoord_map_2() {
        return coord_map_2;
    }

    public void setCoord_map_2(String coord_map_2) {
        this.coord_map_2 = coord_map_2;
    }
    
}
