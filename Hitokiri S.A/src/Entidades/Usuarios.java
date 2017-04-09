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
    private int identificador, intentos;
    private boolean Bloqueado, Estado;

    public Usuarios(String[] ObjectList) {
        this.Usuario = ObjectList[0];
        this.Contraseña = ObjectList[1];
        this.FechaDeIngreso = ObjectList[2];
        this.identificador = Integer.parseInt(ObjectList[3]);
        this.Bloqueado = Boolean.parseBoolean(ObjectList[4]);
        this.Estado = Boolean.parseBoolean(ObjectList[5]);
        this.intentos = 0;
    }

    public Usuarios(String Usuario, String Contraseña, String FechaDeIngreso, int identificador, int intentos, boolean Bloqueado, boolean Estado) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.FechaDeIngreso = FechaDeIngreso;
        this.identificador = identificador;
        this.intentos = intentos;
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

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean getBloqueado() {
        return Bloqueado;
    }

    public void setBloqueado(boolean Bloqueado) {
        this.Bloqueado = Bloqueado;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

}
