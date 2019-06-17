/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entites.ServiceProvider;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import services.RechercheProService;

/**
 * FXML Controller class
 *
 * @author Who Am I
 */
public class RechercheServiceController implements Initializable {

    @FXML
    private Button btn_deco;
    @FXML
    private TableColumn<entites.ServiceProvider, String> fullNameProvider;
    @FXML
    private Button btnCompte;
    @FXML
    private Button btnRecherche;
    @FXML
    private Button btnRechArticle;
    @FXML
    private Button btnRechArticle1;
    @FXML
    private Button btnQuR;
    @FXML
    private TableColumn<entites.ServiceProvider, String> service;
    @FXML
    private TableColumn<entites.ServiceProvider, String> gvrnt;
    @FXML
    private TableColumn<entites.ServiceProvider, String> tel;
    @FXML
    private TableColumn<entites.ServiceProvider, String> description;
    @FXML
    private ChoiceBox<String> gvrntProviderChoice;
    @FXML
    private ChoiceBox<String> serviceProviderChoice;
    private RechercheProService rps;
    private ObservableList<ServiceProvider> data;
    @FXML
    private TableView<ServiceProvider> tabViewServiceProvider;
    private ImageView imgReche;
    @FXML
    private Button btnRech;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btn_deco.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                try {
                    Switcher.switchWindows(new GuiLogin(), (Stage) btn_deco.getScene().getWindow());

                } catch (Exception ex) {
                    Logger.getLogger(RechercheServiceController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        btnRech.setOnMousePressed(new EventHandler<Event>() {
            @Override
            public void handle(Event event) {

                
                fullNameProvider.setCellValueFactory(new PropertyValueFactory<>("fullName"));
                description.setCellValueFactory(new PropertyValueFactory<>("description"));
                 gvrnt.setCellValueFactory(new PropertyValueFactory<>("governorate"));
                  
               
               
                      
                        ArrayList<ServiceProvider> listeServiceProviders;
                        rps =new RechercheProService();
                        listeServiceProviders= rps.listServiceProvider("test", "test");
                         data =FXCollections.observableArrayList(listeServiceProviders);
               
       tabViewServiceProvider.setItems(data);
                //tabViewServiceProvider.getColumns().addAll(description, gvrnt, service);
               // tabViewServiceProvider.setEditable(true);

                System.out.println(".handle()");

            }
        });

    }

}
