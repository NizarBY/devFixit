package gui;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Who Am I
 */
public class RechercheServiceMain extends Application{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    

    @Override
    public void start(Stage stage) throws Exception {
     
     
      Parent root = FXMLLoader.load(getClass().getResource("RechercheService.fxml"));
      
        Scene scene = new Scene(root);
          scene.getStylesheets().add(getClass().getResource("bootstrap.css").toExternalForm());
          
        stage.setScene(scene);
        stage.setTitle("Recherche Service");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}


