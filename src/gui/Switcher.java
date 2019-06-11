package gui;
import javafx.application.Application;

import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Who Am I
 */
public class Switcher {
  
        
  public static  void switchWindows(Application app ,  Stage windows ) {
       try{ 
      app.start(windows);
      
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }
     public static  void switchWindows(Application app ,  Stage windows, HomeController hc )throws Exception  {
       try{ 
      app.start(windows);
      
       }
       catch(Exception ex){
           System.out.println(ex.getMessage());
       }
    }
    
  public void closeWindow (Stage windows){
     windows.close();
  }
    
}
