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

public class PayBillController implements Initializable {

    @FXML
    TextField bankno;
    @FXML
    ChoiceBox<String> bank;
    ObservableList<String> choicelist;
    ObservableList<OparetorDetails> infobservableList;

    @FXML
    public void done() {
        String bank = bankno.getText();
        OparetorDetails d = new OparetorDetails(bank);
        infobservableList.add(d);


    }

    @FXML
    public void back(ActionEvent actionEvent) throws IOException {
        Stage stage = HelloApplication.stage;
        Parent parent = FXMLLoader.load(getClass().getResource("Option.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choicelist = FXCollections.observableArrayList();
        choicelist.add("Dutch Bangla");
        choicelist.add("Sonali Bank");
        choicelist.add("AB Bank Limited");
        choicelist.add("Specialized banks");
        choicelist.add("Pubali Bank Limited");
        bank.setItems(choicelist);


    }
}