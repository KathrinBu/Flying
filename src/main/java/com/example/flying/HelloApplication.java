package com.example.flying;
import java.sql.*;

import javafx.application.Application;
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
    //    String sql="SELECT * FROM city";
        Statement statement= connection.createStatement();
//        ResultSet resultSet=statement.executeQuery(sql);
//        while (resultSet.next()){
//            String idy = resultSet.getString("District");
//            System.out.println("---"+ idy);
//        }
//        String sql="CREATE TABLE books (" +
//                "id INT AUTO_INCREMENT PRIMARY KEY," +
//                "book_name VARCHAR(255) NOT NULL)";
//        statement.executeUpdate(sql);
//        System.out.println("Database has been created!");
        String insSql="INSERT books (book_name) VALUES('Inferno')";
        int rows= statement.executeUpdate(insSql);
        System.out.println("get in"+"\n"+rows);
        statement.close();
        connection.close();

       // launch();
    }
}