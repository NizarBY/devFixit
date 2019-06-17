/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import entites.ToolsEntite;
import entites.User;
import interfaces.IUserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import utils.MyDB;

/**
 *
 * @author Who Am I
 */
public class UserService implements IUserService {

    private Statement statement;
    private Connection con;
    private ResultSet resultat = null;

    public UserService() {
        try {
            statement = MyDB.getInstance().getCnx().createStatement();
            con = MyDB.getInstance().getCnx();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Override
    public void addUser(User u) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO user  "
                    + "(id,nom,prenom,login,password,tel,adress,pays,codeP,cin,dateNaissance,governorate,gender,type_u) VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(13, u.getClass().toString().substring(14));
            preparedStatement.setString(1, u.getName());
            preparedStatement.setString(2, u.getlastName());
            preparedStatement.setString(3, u.getLogin());
            preparedStatement.setString(4, u.getPdw());
            preparedStatement.setInt(5, u.getTelephoneU());
            preparedStatement.setString(6, u.getAdress());
            preparedStatement.setString(7, u.getPays());
            preparedStatement.setInt(8, u.getCodePost());
            preparedStatement.setInt(9, u.getCin());
            preparedStatement.setDate(10, u.getDateNaissance());
            preparedStatement.setString(11, u.getGovernorate());
            preparedStatement.setBoolean(12, u.getGender());
          
              
            

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void updaterUser(User u) {

    }

    @Override
    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();

        try {
            User u = new User() ;
            resultat = statement.executeQuery("SELECT * FROM user;");
            while (resultat.next()) {
               u.setName( resultat.getString("nom"));
                u.setlastName(resultat.getString("Prenom"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public User getCnxUser(String login, String password) {
        String rqt = "SELECT * FROM user where login = '" + login + "' AND password ='" + password + "'";
        User u = new User();
        try {
            resultat = statement.executeQuery(rqt);
            while (resultat.next()) {

                u.setName(resultat.getString("nom"));
                u.setlastName(resultat.getString("Prenom"));
                u.setPdw(resultat.getString("password"));
                u.setLogin(resultat.getString("login"));
                 u.setAdress(resultat.getString("Adress"));
                 u.setDateNaissance(resultat.getDate("dateNaissance"));
                 u.setCin(resultat.getInt("cin"));
                 u.setCodePost(resultat.getInt("codeP"));
                  u.setTelephoneU(resultat.getInt("tel"));
                  u.setPays(resultat.getString("pays"));
                 u.setGovernorate(resultat.getString("governorate"));
                 u.setGender(resultat.getBoolean("gender"));
                 u=ToolsEntite.casteUser(resultat.getString("type_u"), u);
                 

                System.out.println("voila " + u.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

}
