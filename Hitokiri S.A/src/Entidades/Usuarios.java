/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Antonio
 */
public class Usuarios {
    private String Usuario, Contraseña, FechaDeIngreso;
    private int identificador;
    private boolean Bloqueado, Estado;

     public Usuarios(String Usuario, String Contraseña, String FechaDeIngreso, int identificador, boolean Bloqueado, boolean Estado) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.FechaDeIngreso = FechaDeIngreso;
        this.identificador = identificador;
        this.Bloqueado = Bloqueado;
        this.Estado = Estado;
    }

    public Usuarios() {
         this.Usuario = "";
        this.Contraseña = "";
        this.FechaDeIngreso = "";
        this.identificador = 0;
        this.Bloqueado = false;
        this.Estado = false;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public boolean isBloqueado() {
        return Bloqueado;
    }

    public void setBloqueado(boolean Bloqueado) {
        this.Bloqueado = Bloqueado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}

