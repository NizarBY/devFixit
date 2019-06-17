/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.fixit;


import entites.ServiceProvider;
import services.UserService;
import entites.User;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import services.RechercheProService;



/**
 *
 * @author Who Am I
 */
public class EjbFixit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserService us = new UserService();
        RechercheProService rps = new RechercheProService();
       User u2 = new User();
       u2.setPdw("admin");
       u2.setLogin("AymenJava");
       u2.setName("Nizar");
       u2.setlastName("ben younes");
       u2.setAdress("27 rue hadi jannen");
       u2.setAdress_mail("em@gmail.com");
       u2.setCin(01234567);
 Date d = Date.valueOf("2019-06-20") ; 

       List<ServiceProvider> lu = new ArrayList();
       lu = rps.listServiceProvider("test", "admin");
       
       for ( ServiceProvider u : lu){
           System.out.println(u.getName());
            System.out.println(u.getGovernorate());
       }
  
        
      
    }
    
}
