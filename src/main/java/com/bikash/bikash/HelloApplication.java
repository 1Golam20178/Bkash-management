package com.bikash.bikash;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bikash.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Bikash");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}