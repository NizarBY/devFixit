/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.ServiceProvider;
import interfaces.IRechecheProService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ChoiceBox;
import utils.MyDB;

/**
 *
 * @author Who Am I
 */
public class RechercheProService implements IRechecheProService{
    private Statement statement;
    private Connection con;
    private ResultSet resultat = null;

    public RechercheProService() {
        try {
            statement = MyDB.getInstance().getCnx().createStatement();
            con = MyDB.getInstance().getCnx();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public ArrayList<ServiceProvider> listServiceProvider(String gvrntProviderChoice, String serviceProviderChoice) {
        ArrayList<ServiceProvider> users = new ArrayList<>();
        ServiceProvider sp = new ServiceProvider();
        String rqt = "select * from user where type_u = 'ServiceProvider' and governorate=' "+gvrntProviderChoice+"'"+"and "; 
        try {
            resultat = statement.executeQuery(rqt);
                      while (resultat.next()) {
                         
              sp.setName( resultat.getString("nom"));
               sp.setlastName(resultat.getString("prenom"));
               sp.setDescription(resultat.getString("description"));
               sp.setGovernorate(resultat.getString("governorate"));
               users.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users  ; 
    }

    


    
}
