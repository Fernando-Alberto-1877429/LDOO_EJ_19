/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Fernando
 */
public class Query extends Conection{
    public boolean authentication(String username, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String query = "select * from usuarios where username = ? and password = ?";
            pst = getConection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConection() != null) getConection().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close(); 
            }catch(Exception e){
                System.err.println("Error" + e);
            }
        }
        return false; 
    }
   
    public boolean registro(String username, String password){
        PreparedStatement pst = null;
        
        try{
            String query = "insert into usuarios (username, password) values(?,?)";
            pst = getConection().prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
            
        }catch(Exception e){
            System.err.println("Error" + e);
        }finally{
            try{
                if(getConection() != null) getConection().close();
                if(pst != null) pst.close();
            }catch (Exception e){
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    
    //public static void main(String [] args){
    //     Query qr = new Query();
    //     System.out.println(qr.authentication("Fernando", "123"));
    //}
    
    //public static void main(String [] args){
    //    Query qr = new Query();
    //    System.out.println(qr.registro("Alberto", "147"));
    //}
}
