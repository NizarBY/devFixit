package gui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entites.User;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import services.UserService;
/**
 * FXML Controller class
 *
 * @author Who Am I
 */
public class GuiLoginController implements Initializable {

    @FXML
    private TextField txtLogin;
   
    @FXML
    private Button btnInscription;
    @FXML
    private Button btnCnx;

    private  UserService us ;
    @FXML
    private Label lblerreur;
    private static  User   u;

    public static User getU() {
        return u;
    }
    @FXML
    private PasswordField txtPassword;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        us = new UserService();
       
        btnCnx.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if((Tools.isEmpty(txtLogin)) && (Tools.isEmpty(txtPassword))) {
                    lblerreur.setText("identifint et mote de pass est vider voulez vous remplir ... !");
                }
                else   if(Tools.isEmpty(txtLogin)) {
                    lblerreur.setText(" login est vider vous voulez remplir ... !");
                }
                else if(Tools.isEmpty(txtPassword)) {
                    lblerreur.setText("password est vider vous voulez remplir  ... !");
                }
                else {
                    
                    
                    u= us.getCnxUser(txtLogin.getText(), txtPassword.getText());
                    
                    if( null == u.getLogin()){
                        
                        lblerreur.setText("identifint ou mote de pass est incorrecte ... !");
                        
                    } else {
                        try {
                            Switcher.switchWindows(new HomeMain(), (Stage)btnCnx.getScene().getWindow());
                            
                            
                        } catch (Exception ex) {
                            Logger.getLogger(GuiLoginController.class.getName()).log(Level.SEVERE, null, ex);
                        }   }
                }
            }
        });
        btnInscription.setOnMousePressed(new EventHandler<Event>(){
            @Override
            public void handle(Event event) {
                try {
                    Switcher.switchWindows(new RegistrationMain(),(Stage)btnInscription.getScene().getWindow() );
                } catch (Exception ex) {
                    Logger.getLogger(GuiLoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
                
        
    }     
 

    
}
