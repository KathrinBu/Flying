package com.example.flying;
import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) throws SQLException {
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Pa$$w0rd");
        System.out.println("it's ok!");
        String sql="SELECT * FROM city";
        Statement statement= connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            String id= resultSet.getString("District");
            System.out.println("---"+id);
        }

       // launch();
    }
}