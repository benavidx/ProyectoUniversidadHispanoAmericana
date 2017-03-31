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
public class Empleado {
    private String Nombre, Apellido1, Apellido2,FechaDeIngreso;
    private int Cedula, Identificador;
    private boolean Estado;
    
      public Empleado(String[] ObjectList) {
        this.Nombre = ObjectList[0];
        this.Apellido1 = ObjectList[1];
        this.Apellido2 = ObjectList[2];
        this.FechaDeIngreso = ObjectList[3];
        this.Cedula = Integer.parseInt(ObjectList[4]);
        this.Identificador = Integer.parseInt(ObjectList[5]);
        this.Estado = Boolean.parseBoolean(ObjectList[6]);
    }

    public Empleado() {
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.FechaDeIngreso = "";
        this.Cedula = 0;
        this.Identificador = 0;
        this.Estado = false;
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

    public String getFechaDeIngreso() {
        return FechaDeIngreso;
    }

    public void setFechaDeIngreso(String FechaDeIngreso) {
        this.FechaDeIngreso = FechaDeIngreso;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}

