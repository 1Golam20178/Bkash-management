module com.bikash.bikash {
    requires javafx.controls;
    requires javafx.fxml;
  requires java.sql;

    opens com.bikash.bikash to javafx.fxml;
    exports com.bikash.bikash;
}