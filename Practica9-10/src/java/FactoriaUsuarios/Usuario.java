/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoriaUsuarios;

/**
 *
 * @author fernanfloo
 */
public abstract class Usuario {
    protected String nombreUsuario;
    protected String contraseña;
    protected String fechaDeNacimiento;
    protected String email;
    protected int idUsuario;
    protected String tipoUsuario;
    
    public Usuario(){
    }
    
    public Usuario(String nombreUsuario, String contraseña, String fechaDeNacimiento, String email, int idUsuario){
        setNombreUsuario(nombreUsuario);
        setContraseña(contraseña);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setIdUsuario(idUsuario);
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public abstract void setTipoUsuario();
}
