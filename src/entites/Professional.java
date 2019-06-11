/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.ArrayList;

/**
 *
 * @author Nizar Ben Younes 
 */
//information sur les service 
public class Professional {
    private String domain_p;
    private String specialty;
    private String certfication;
    private ArrayList<User> listUser;

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public String getDomain_p() {
        return domain_p;
    }

    public void setDomain_p(String domain_p) {
        this.domain_p = domain_p;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getCertfication() {
        return certfication;
    }

    public void setCertfication(String certfication) {
        this.certfication = certfication;
    }
   
    
}
