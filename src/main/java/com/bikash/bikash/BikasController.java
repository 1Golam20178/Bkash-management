package com.bikash.bikash;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class   BikasController {
    @FXML
     TextField codemobile;
@FXML
    PasswordField codepassword1;
@FXML
    Label errorlever;
@FXML
    RegistationDetails  p;



    @FXML
    protected void onBikashController()throws IOException
    {
        Stage stage = HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("Registation.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void dologin()throws IOException
    {
        String mobileNumber1=codemobile.getText();
        String password1=codepassword1.getText();
//        if(codemobile.getText().equals(p.mobileNumber))
//        {
//            errorlever.setText("Login Successful");
//        }
//
//            else
//        {
//            Alert alert=new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("admin login");
//            alert.setHeaderText(null);
//            alert.setContentText("Invalid Login");
//            alert.showAndWait();
//
//        }

            Stage stage = HelloApplication.stage;
            Parent parent = FXMLLoader.load(getClass().getResource("Option.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();


   }

}
