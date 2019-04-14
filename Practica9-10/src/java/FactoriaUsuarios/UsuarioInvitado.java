/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriaUsuarios;

/**
 *
 * @author ferna
 */
public class UsuarioInvitado extends Usuario{
    protected String nombre;
    protected String fechaDeRegistro;
    
    public UsuarioInvitado(){
    }
    
    public UsuarioInvitado(String nombreUsuario, String contraseña, String fechaDeNacimiento, String email, int idUsuario, String nombre, String fechaDeRegistro){
        setNombreUsuario(nombreUsuario);
        setContraseña(contraseña);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setIdUsuario(idUsuario);
        setTipoUsuario();
        setNombre(nombre);
        setFechaDeRegistro(fechaDeRegistro);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaDeRegistro
     */
    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    /**
     * @param fechaDeRegistro the fechaDeRegistro to set
     */
    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Invitado";
    }
}
