package com.cognizant.truyum.dao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler{
    public static Connection getConnection(){
        Connection con= null;
        try {
          /*  FileInputStream file = new FileInputStream("src/connection.properties");
            Properties prop = new Properties();
            prop.load(file);
            String driver = (String) prop.get("driver");
            String connUrl = (String) prop.get("connection-url");
            String uname = (String) prop.get("user");
            String pswd = (String) prop.get("password");

            Class.forName(driver);*/
            con=DriverManager.getConnection(  
            		"jdbc:mysql://localhost:3306/employee","root","123456");  
            
       
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

         return con;
    }
}
