/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fernando
 */
public class Conection {
    private String username = "root";
    private String password = "";
    private String host = "localhost";
    private String port = "3306";
    private String database = "practica8";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
    private Connection con;
    
    public Conection (){
        try{
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("Error" + e);
        }
    }
    
    public Connection getConection(){
        return con;
    }
    
    //public static void main(String [] args){
    //    Conection con = new Conection();
    //}
    
}
