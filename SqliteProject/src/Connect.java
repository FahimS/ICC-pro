/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.sql.*;
/**
 *
 * @author Fahim S
 */
public class Connect {
    Connection conn=null;
public static Connection ConnectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database1.sqlite");
        System.out.println("Connected");
        return conn;
    }
    catch(Exception e){
        System.out.println("Not connected");
    }
    return null;
  }
}
    
