/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
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
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Who Am I
 */
public class HomeController implements Initializable {

    @FXML
    private Label lblName;
    @FXML
    private Label lblPrenom;
    @FXML
    private Label lblMail;
    @FXML
    private Label lblTel;
    @FXML
    private Button btn_deco;
    private User u;
   
    @FXML
    private Label lblpays;
    @FXML
    private Label lblGovernorate;
    @FXML
    private Label lblAdress;
    @FXML
    private Label lblCodeP;
    @FXML
    private Label lblCin;
    private SplitMenuButton rchSer;
    @FXML
    private Label lbl;
    @FXML
    private Button btnCompte;
    @FXML
    private Button btnRecherche;
    @FXML
    private Button btnRechArticle;
    @FXML
    private Button btnQuR;

   
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       btn_deco.setOnMousePressed((Event event) -> {
           try {
               Switcher.switchWindows(new GuiLogin(), (Stage)btn_deco.getScene().getWindow());
               
           } catch (Exception ex) {
               Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       });
     
      
       this.u=GuiLoginController.getU();
       lblName.setText(u.getName());
     lblPrenom.setText(u.getlastName());
      lblpays.setText(u.getPays());
      lblAdress.setText(u.getPays());
      lblCin.setText( String.valueOf(u.getCin()));
      lblGovernorate.setText(u.getGovernorate());
      lblCodeP.setText(String.valueOf(u.getCodePost()));
      lblTel.setText(String.valueOf(u.getTelephoneU()));
 
          btnRecherche.setOnMousePressed(new EventHandler<Event>(){
          @Override
          public void handle(Event event) {
                try {
               Switcher.switchWindows(new RechercheServiceMain(), (Stage)rchSer.getScene().getWindow());
               
           } catch (Exception ex) {
               Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
           }
          }
     });
     
                 }    
    
}
