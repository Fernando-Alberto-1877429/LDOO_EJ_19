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
public class UsuarioSinPrivilegio extends Usuario{
    protected String nombre;
    protected String suscripcion;
    protected String domicilio;
    
    public UsuarioSinPrivilegio(){
    }
    
    public UsuarioSinPrivilegio(String nombreUsuario, String contraseña, String fechaDeNacimiento, String email, int idUsuario, String nombre, String suscripcion, String domicilio){
        setNombreUsuario(nombreUsuario);
        setContraseña(contraseña);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setIdUsuario(idUsuario);
        setTipoUsuario();
        setNombre(nombre);
        setSuscripcion(suscripcion);
        setDomicilio(domicilio);
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
     * @return the suscripcion
     */
    public String getSuscripcion() {
        return suscripcion;
    }

    /**
     * @param suscripcion the suscripcion to set
     */
    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Usuario Sin Privilegios";
    }
}
