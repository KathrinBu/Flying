module com.example.flying {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.flying to javafx.fxml;
    exports com.example.flying;
}