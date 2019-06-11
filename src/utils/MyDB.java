/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Who Am I
 */
public class MyDB {
    private final  String url = "jdbc:mysql://localhost:3306/bd_fixit";
   private final  String username = "root";
private final String password = "";
//String table ="user"; 
private Connection cnx;
private static MyDB instance;
  private  MyDB() {
        try {
            cnx=  DriverManager.getConnection(url,username,password);
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static MyDB getInstance(){
        if( instance == null){
            instance = new MyDB();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
    

    
}
