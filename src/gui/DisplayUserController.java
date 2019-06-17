/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entites.ServiceProvider;
import entites.User;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import services.RechercheProService;
import services.UserService;

/**
 * FXML Controller class
 *
 * @author chedly
 */
public class DisplayUserController implements Initializable {

    @FXML
    private TableView<User> tableViewListUser;
    @FXML
    private TableColumn<User, String> clnFullName;
    @FXML
    private TableColumn<User, Integer> clnCin;
    @FXML
    private TableColumn<User, Integer> clnPays;
    @FXML
    private TableColumn<User, String> clnGovernerat;
    @FXML
    private TableColumn<User, String> clnAdresse;
    @FXML
    private TableColumn<User, Integer> clnTelephone;
     private ObservableList<User> data;  //retourner Liste binaire

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       UserService us = new UserService();
               ArrayList<User> listU = us.getAllUser();
                 clnFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
                clnAdresse.setCellValueFactory(new PropertyValueFactory<>("adress"));
                 clnGovernerat.setCellValueFactory(new PropertyValueFactory<>("governorate"));
                 
                  
               
               
                      
                    
                        
                         data =FXCollections.observableArrayList(listU);
               
       tableViewListUser.setItems(data); 
    }    
    
}
