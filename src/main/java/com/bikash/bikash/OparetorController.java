package com.bikash.bikash;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OparetorController implements Initializable {

    @FXML
    TextField number;
    @FXML
    ChoiceBox<String>oparetor;
    ObservableList<String> choicelist;
    ObservableList<OparetorDetails>infobservableList;
@FXML
public void done()
{
    String choice =oparetor.getValue();
      OparetorDetails d =new OparetorDetails(choice);
      infobservableList.add(d);


}
    @FXML
    public void back(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("Option.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choicelist= FXCollections.observableArrayList();
        choicelist.add("Bangla Link");
        choicelist.add("Grameen");
        choicelist.add("Robi");
        choicelist.add("Artel");
        choicelist.add("Telitalk");
        oparetor.setItems(choicelist);



    }
}
