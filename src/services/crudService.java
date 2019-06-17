/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.Service;
import interfaces.IcrudServices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.MyDB;

/**
 *
 * @author chedly
 */
public class crudService implements IcrudServices{
   private Statement statement;
    private Connection con;
    private ResultSet resultat = null;

    public crudService() {
        try {
            statement = MyDB.getInstance().getCnx().createStatement();
            con = MyDB.getInstance().getCnx();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void addServices(Service s) {
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO service  (description , nomService , serviceID) VALUES(?,?,null);");
                    
        
            preparedStatement.setString(1, s.getDescription());
            preparedStatement.setString(2, s.getNameService());
            preparedStatement.setInt(3, s.getId());
           
 

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
