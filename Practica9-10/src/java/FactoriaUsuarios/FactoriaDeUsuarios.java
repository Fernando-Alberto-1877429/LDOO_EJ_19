/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriaUsuarios;

import java.util.HashMap;

/**
 *
 * @author ferna
 */
public class FactoriaDeUsuarios {
    private static FactoriaDeUsuarios factory;
    private HashMap<String, Usuario> poolUsuarios = new HashMap();
    
    private FactoriaDeUsuarios(){
    }
    
    public static FactoriaDeUsuarios getFactoria(){
        if (factory==null){
            factory = new FactoriaDeUsuarios();
        }
        return factory;
    }
    
    public static Usuario getUsuario(String tipo, String nombreUsuario, String contraseña, String fechaDeNacimiento,String email,int idUsuario, int numeroEmpleado, String nombre, String suscripcion, String domicilio, String fechaDeRegistro){
        if(tipo.equals("Privilegiado")){
            return new UsuarioPrivilegiado(nombreUsuario, contraseña, fechaDeNacimiento, email, idUsuario, numeroEmpleado);
        }else if (tipo.equals("Usuario sin Privilegios")){
            return new UsuarioSinPrivilegio(nombreUsuario, contraseña, fechaDeNacimiento, email, idUsuario, nombre, suscripcion, domicilio);
        }
        return new UsuarioInvitado(nombreUsuario, contraseña, fechaDeNacimiento, email, idUsuario, nombre, fechaDeRegistro);
    } 
    
    public void añadirUsuario(String tipo, String nombreUsuario, String contraseña, String fechaDeNacimiento,String email,int idUsuario, int numeroEmpleado, String nombre, String suscripcion, String domicilio, String fechaDeRegistro){
        poolUsuarios.put(nombreUsuario, getUsuario(tipo, nombreUsuario, contraseña, fechaDeNacimiento, email, idUsuario, numeroEmpleado, nombre, suscripcion, domicilio, fechaDeRegistro));
    }
    
    public Usuario sacarUsuario(String nombreUsuario){
        return poolUsuarios.get(nombreUsuario);
    }
}
