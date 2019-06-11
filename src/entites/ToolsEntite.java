package entites;




import java.sql.Date;
import java.time.format.DateTimeFormatter;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Who Am I
 */
public class ToolsEntite {
    public static boolean isEmpty(TextField txtField){
        return txtField.getText().equals("");
    }
    public static void controleObjetEmpty(String msg , TextField txtField , Label lblerr){
        if(isEmpty(txtField)){
            lblerr.setText(msg);
        }
    }
    public static User addUser(TextField txtCin,TextField txtCoPo,TextField txtAdrs,TextField txtName,TextField txtPassword,TextField txtLogin, DatePicker txtDateN,TextField txtTel,TextField txtLasteName,TextField idPays,RadioButton btnRdFemme,TextField txtGrv){
        User u = new User();
                u.setCin(Integer.parseInt(txtCin.getText()));
                u.setCodePost(Integer.parseInt(txtCoPo.getText()));
                u.setAdress(txtAdrs.getText());
                u.setName(txtName.getText());
                u.setPdw(txtPassword.getText());
                u.setLogin(txtLogin.getText());
                Date d = Date.valueOf(txtDateN.getValue().format(DateTimeFormatter.ISO_DATE));                
                u.setDateNaissance(d);
                u.setlastName(txtLasteName.getText());
                u.setTelephoneU(Integer.parseInt(txtTel.getText()));
                u.setPays(idPays.getText());
                 //true femme false homme
                u.setGender(btnRdFemme.isSelected());
                u.setGovernorate(txtGrv.getText());
                return u;
    }
    public static User casteUser ( String typeUser , User u ){
        switch (typeUser) {
            case "Client":
                return (Client)u;
            case "Admin":
                return (Admin)u;
            case "Provider":
                return (Provider)u;
            case "User":
                return u;
            default:
                return (ServiceProvider)u;
        }
    }
   
}
