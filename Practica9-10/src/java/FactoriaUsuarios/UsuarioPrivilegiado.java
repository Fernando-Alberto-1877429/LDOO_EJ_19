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
public class UsuarioPrivilegiado extends Usuario{
    private int numeroEmpleado;
    
    public UsuarioPrivilegiado(){
    }
    
    public UsuarioPrivilegiado(String nombreUsuario, String contraseña, String fechaDeNacimiento, String email,int idUsuario, int numeroEmpleado){
        setNombreUsuario(nombreUsuario);
        setContraseña(contraseña);
        setFechaDeNacimiento(fechaDeNacimiento);
        setEmail(email);
        setIdUsuario(idUsuario);
        setTipoUsuario();
        setNumeroEmpleado(numeroEmpleado);
    }

    /**
     * @return the numeroEmpleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Privilegiado";
    }
}
