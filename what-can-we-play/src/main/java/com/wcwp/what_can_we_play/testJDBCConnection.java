package com.wcwp.what_can_we_play;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testJDBCConnection {
     public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:sqlite:whatCanWePlay.db");
            Statement statement = connection.createStatement();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
