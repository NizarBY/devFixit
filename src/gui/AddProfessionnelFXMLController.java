/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entites.Professional;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import services.CrudProfessionnel;

/**
 * FXML Controller class
 *
 * @author chedly
 */
public class AddProfessionnelFXMLController implements Initializable {

    @FXML
    private Button btnAddPro;
    @FXML
    private Button btnCancel;
    @FXML
    private TextField txtDomain;
    @FXML
    private TextArea txtDescription;
    @FXML
    private TextField txtSpeciality;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        btnAddPro.setOnMousePressed(new EventHandler<Event>(){
            @Override
            public void handle(Event event) {
                
                CrudProfessionnel crudp = new CrudProfessionnel();
                Professional pro = new Professional();
                pro.setDescription(txtDescription.getText());
                pro.setDomain_p(txtDomain.getText());
               pro.setSpecialty(txtSpeciality.getText());
                crudp.addProfessionnel(pro);
            }
            
        });
        
        
        
        
    }    
    
}
