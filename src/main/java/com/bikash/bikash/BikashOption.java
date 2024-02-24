package com.bikash.bikash;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class BikashOption implements Initializable {

    @FXML
    Label totalAmount;
    @FXML
    Label cashIn;
    @FXML
    Label cashOut;
    @FXML
    Label sendMoney;

    @FXML
    TextField sendMoneyAmount;
    @FXML
    TextField sendCashIn;
    @FXML
    TextField sendCashOut;
    @FXML
    TableView<OptionDetails>tableview;
    @FXML
    TableColumn<OptionDetails,Number>tablein;
    @FXML
    TableColumn<OptionDetails,Number >tableout;
    @FXML
    TableColumn<OptionDetails,Number>tablesend;

    ObservableList<OptionDetails>infobservableList;

    OptionDetails p;


    @FXML
    public void addTotalAmount() {
        int amount1= 500;
         p=new OptionDetails();

        p.setAmount(amount1);
        totalAmount.setText(String.valueOf(amount1));






    }


@FXML
    public void addsendmoney() {

        sendMoney.setText("Send Money \nSuccessfull");
      int ss = Integer.parseInt(sendMoneyAmount.getText());
        totalAmount.setText(" ");
       p.setSendMoneyAmount(ss);

        totalAmount.setText(String.valueOf(p.getAmount()-p.getSendMoneyAmount()-5));


    }


@FXML
    public void addCashOut() {

        cashOut.setText("Cash Out\nSuccessfull");
    int ss2 = Integer.parseInt((sendCashOut.getText()));
    totalAmount.setText(" ");
        p.setCashOutAmount(ss2);

        totalAmount.setText(String.valueOf(p.getAmount()-p.getSendMoneyAmount()-p.getCashOutAmount()-15));
    }
@FXML
    public void addCashIn(){
        cashIn.setText("Cash IN\nSuccessfull");
        int ss3= Integer.parseInt(sendCashIn.getText());
        totalAmount.setText(" ");
        p.setCashInAmount(ss3);
        totalAmount.setText(String.valueOf(p.getAmount()-p.getSendMoneyAmount()-p.getCashOutAmount()+p.getCashInAmount()-15));

    }
    @FXML
    public void others(ActionEvent actionEvent)throws IOException
    {

        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("AthurityInfo.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void backmenu(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("bikash.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void mobile(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("Mobile.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void paybill(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("PayBill.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void setting(ActionEvent actionEvent)throws IOException
    {
        Stage stage=HelloApplication.stage;
        Parent parent= FXMLLoader.load(getClass().getResource("Setting.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void history()
    {

        int k = parseInt(sendMoneyAmount.getText());
        int k1= parseInt(sendCashOut.getText());
        int k2= parseInt(sendCashIn.getText());
        p.setSendMoneyAmount(k);
        p.setCashInAmount(k1);
        p.setCashOutAmount(k2);
        infobservableList.add(p);
        System.out.println(p);


        try {

            RandomAccessFile rf = new RandomAccessFile("student.txt", "rw");
            rf.seek(rf.length());

            rf.writeBytes("Send money ="+p.getSendMoneyAmount()+ ", "+"Cash out ="+p.getCashOutAmount()+" , "+"Cash in="+p.getCashInAmount()+"\n");

        }
        catch (FileNotFoundException exception){
            System.out.println("file not fount");
        }
        catch (SecurityException exception){
            System.out.println("file not fount security");
        } catch (IOException exception) {
            System.out.println("file not fount security");

        }

 //save a database


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bkash", "root", "golam20178");

            Statement statement= connection.createStatement();
            String quiry="INSERT INTO details(sendmoney,cashout,cashin)VALUES("+k+","+k1+","+k2+");";

            boolean excuted=statement.execute(quiry);
            if(excuted)
            {
                System.out.println("success");
            }
            else
            {
                System.out.println("success");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("failed to connect database");
        }



    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        infobservableList=FXCollections.observableArrayList();

        tablesend.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getSendMoneyAmount()));
        tablein.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getCashInAmount()));
        tableout.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getCashOutAmount()));


        tableview.setItems(infobservableList);





    }



}
