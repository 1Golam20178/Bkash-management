package com.bikash.bikash;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class RegistationController {

    @FXML
    Label error;
    @FXML
    TextField codeFristName;
    @FXML
    TextField codelastname;
    @FXML
    TextField codemoble;
    @FXML
    TextField codeusernane;
    @FXML
    PasswordField codepassword;
    @FXML
    PasswordField codeconfrompassword;


  @FXML
    RegistationDetails  p;
    @FXML
    public void reg1()
    {
        String fristName =codeFristName.getText();
        String lastName =codelastname.getText();
        String mo=codemoble.getText();
        String userName =codeusernane.getText();
        String password4=codepassword.getText();
        String confromPassword =codeconfrompassword.getText();
        p=new RegistationDetails(fristName,lastName,mo,userName,password4,confromPassword);
        if(password4.equals(confromPassword)) {
            error.setText("Registation Successful");
        }
        else {
            codeconfrompassword.clear();
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("admin login");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Registation");
            alert.showAndWait();
        }



    }

    @FXML
    public void onBackClick(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("bikash.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }




}
