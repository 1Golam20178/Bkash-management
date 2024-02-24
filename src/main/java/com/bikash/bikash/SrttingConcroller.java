package com.bikash.bikash;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SrttingConcroller {
    @FXML
    public void updates(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("Registation.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }
}
