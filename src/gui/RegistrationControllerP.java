/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entites.User;
import java.net.URL;
import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import services.UserService;

/**
 * FXML Controller class
 *
 * @author Who Am I
 */
public class RegistrationControllerP implements Initializable {
    
    @FXML
    private TextField txtAdrs;
    @FXML
    private TextField txtCin;
    @FXML
    private TextField idPays;
    @FXML
    private TextField txtTel;
    @FXML
    private TextField txtLasteName;
    @FXML
    private TextField txtName;
    private TextField txtCoPo;
    @FXML
    private DatePicker txtDateN;
    @FXML
    private Button btnAnnule;
    @FXML
    private Button btnVald;
    @FXML
    private Button btnCnx;
    @FXML
    private TextField txtLogin;
    @FXML
    private TextField txtPassword;
    @FXML
    private ImageView img;
    @FXML
    private TextField txtGrv;
  

    @FXML
    private RadioButton btnRdFemme;
    @FXML
    private Pane txtService;
    @FXML
    private RadioButton btnRdHomme;
    @FXML
    private ToggleGroup isGenre;
    @FXML
    private TextField txtGrv1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnVald.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
              User u;
                u = Tools.addUser(txtCin, txtCoPo, txtAdrs, txtName, txtPassword, txtLogin, txtDateN, txtTel, txtLasteName, idPays, btnRdFemme, txtGrv);
                UserService us = new UserService();
                us.addUser(u);
//               
                Switcher.switchWindows(new GuiLogin(), (Stage) btnCnx.getScene().getWindow());
//              

            }
            
        });
        
        btnCnx.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                try {
                    Switcher.switchWindows(new GuiLogin(), (Stage) btnCnx.getScene().getWindow());
                } catch (Exception ex) {
                    Logger.getLogger(RegistrationControllerP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        btnAnnule.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
               
            }
        });
    }    
    
}
