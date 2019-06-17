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

    public ServiceProvider(String description, String name, int telephoneU, String governorate) {
        super(name, telephoneU, governorate);
        this.description = description;
    }

    public ServiceProvider() {
    }
    

    //description
     private String description;
     //service proposé par prestataire 
     private Professional seviceProfessional ;

  


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professional getSeviceProfessional() {
        return seviceProfessional;
    }

    public void setSeviceProfessional(Professional seviceProfessional) {
        this.seviceProfessional = seviceProfessional;
    }

    
}
