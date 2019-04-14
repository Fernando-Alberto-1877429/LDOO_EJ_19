/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import FactoriaUsuarios.*;

/**
 *
 * @author Fernando
 */
public class Query extends Conection{
    public boolean authentication(String username, String password, Usuario user){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try{
            String query = null;
            if(user.getTipoUsuario().equals("Privilegiado")){
                query = "select * from privilegiado where username = ? and password = ?";
            }else if (user.getTipoUsuario().equals("Usuario Sin Privilegios")){
                query = "select * from sinprivilegio where username = ? and password = ?";
            }else {
                query = "select * from invitado where username = ? and password = ?";
            }
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
   
    public boolean registro(Usuario user){
        PreparedStatement pst = null;
        FactoriaDeUsuarios factory = FactoriaDeUsuarios.getFactoria();
        String tipo = user.getTipoUsuario();
        
        try{
            String query;
            if (tipo.equals("Privilegiado")){
                UsuarioPrivilegiado usuario= (UsuarioPrivilegiado)user;
                query = "insert into privilegiado (nombreUsuario, contraseña, fechaDeNacimiento, email, tipoUsuario, idUsuario, numeroEmpleado) values(?,?,?,?,?,?,?)";
                pst = getConection().prepareStatement(query);
                pst.setString(1, usuario.getNombreUsuario());
                pst.setString(2, usuario.getContraseña());
                pst.setString(3, usuario.getFechaDeNacimiento());
                pst.setString(4, usuario.getEmail());
                pst.setString(5, usuario.getTipoUsuario());
                pst.setInt(6, usuario.getIdUsuario());
                pst.setInt(7, usuario.getNumeroEmpleado());
            }else if(tipo.equals("Usuario Sin Privilegios")){
                UsuarioSinPrivilegio usuario= (UsuarioSinPrivilegio)user;
                query = "insert into privilegiado (nombreUsuario, contraseña, fechaDeNacimiento, email, tipoUsuario, idUsuario, nombre, suscripcion, domicilio) values(?,?,?,?,?,?,?,?,?)";
                pst = getConection().prepareStatement(query);
                pst.setString(1, usuario.getNombreUsuario());
                pst.setString(2, usuario.getContraseña());
                pst.setString(3, usuario.getFechaDeNacimiento());
                pst.setString(4, usuario.getEmail());
                pst.setString(5, usuario.getTipoUsuario());
                pst.setInt(6, usuario.getIdUsuario());
                pst.setString(7, usuario.getNombre());
                pst.setString(8, usuario.getSuscripcion());
                pst.setString(9, usuario.getDomicilio());
            }else {
                UsuarioInvitado usuario= (UsuarioInvitado)user;
                query = "insert into privilegiado (nombreUsuario, contraseña, fechaDeNacimiento, email, tipoUsuario, idUsuario, nombre, fechaDeRegistro) values(?,?,?,?,?,?,?,?)";
                pst = getConection().prepareStatement(query);
                pst.setString(1, usuario.getNombreUsuario());
                pst.setString(2, usuario.getContraseña());
                pst.setString(3, usuario.getFechaDeNacimiento());
                pst.setString(4, usuario.getEmail());
                pst.setString(5, usuario.getTipoUsuario());
                pst.setInt(6, usuario.getIdUsuario());
                pst.setString(7, usuario.getNombre());
                pst.setString(8, usuario.getFechaDeRegistro());
            }
         
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
    
   // public static void main(String [] args){
   //     Query qr = new Query();
   //     System.out.println(qr.registro("Alberto", "147"));
   //}
}
