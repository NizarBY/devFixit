/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entites.Professional;
import entites.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import utils.MyDB;
import interfaces.IcrudProfessionnel;

/**
 *
 * @author chedly
 */
public class CrudProfessionnel implements IcrudProfessionnel{
   private Statement statement;
    private Connection con;
    private ResultSet resultat = null;

    public CrudProfessionnel() {
        try {
            statement = MyDB.getInstance().getCnx().createStatement();
            con = MyDB.getInstance().getCnx();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void addProfessionnel(Professional pro) {
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO professional  (idPro , domain , specialty , description) VALUES(null,?,?,?);");
                    
        
            preparedStatement.setString(1, pro.getDomain_p());
            preparedStatement.setString(2, pro.getSpecialty());
            preparedStatement.setString(3, pro.getDescription());
            
           
 

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
}
