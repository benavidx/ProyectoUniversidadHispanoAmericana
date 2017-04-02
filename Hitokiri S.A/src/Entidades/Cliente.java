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
public class Cliente {
    
    private String Nombre, Apellido1, Apellido2, FechaDeNacimiento, Direccion,Profesion;
    private int Cedula, Carnet;
    boolean Estado, Genero;

    public Cliente(String[] ObjList) {
        this.Nombre = ObjList[0];
        this.Apellido1 = ObjList[1];
        this.Apellido2 = ObjList[2];
        this.FechaDeNacimiento = ObjList[3];
        this.Direccion = ObjList[4];
        this.Profesion = ObjList[5];
        this.Cedula = Integer.parseInt(ObjList[6]);
        this.Carnet = Integer.parseInt(ObjList[7]);
        this.Estado = Boolean.parseBoolean(ObjList[8]);
        this.Genero = Boolean.parseBoolean(ObjList[9]);
    }

    public Cliente() {
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.FechaDeNacimiento = "";
        this.Direccion = "";
        this.Profesion = "";
        this.Cedula = 0;
        this.Carnet = 0;
        this.Estado = false;
        this.Genero = false;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean getGenero() {
        return Genero;
    }

    public void setGenero(boolean Genero) {
        this.Genero = Genero;
    }

  
}
