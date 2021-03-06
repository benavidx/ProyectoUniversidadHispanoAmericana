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

    private String Nombre, Apellido1, Apellido2, FechaDeIngreso,AreaDeTrabajo;
    private int Cedula, Identificador;
    private boolean Estado;

    public Empleado(String[] ObjectList) {
        this.Nombre = ObjectList[0];
        this.Apellido1 = ObjectList[1];
        this.Apellido2 = ObjectList[2];
        this.AreaDeTrabajo = ObjectList[3];
        this.FechaDeIngreso = ObjectList[4];
        this.Cedula = Integer.parseInt(ObjectList[5]);
        this.Identificador = Integer.parseInt(ObjectList[6]);
        this.Estado = Boolean.parseBoolean(ObjectList[7]);
    }

    public Empleado() {
        this.Nombre = "";
        this.Apellido1 = "";
        this.Apellido2 = "";
        this.AreaDeTrabajo="";
        this.FechaDeIngreso = "";
        this.Cedula = 0;
        this.Identificador = 0;
        this.Estado = false;
    }

    public Empleado(String Nombre, String Apellido1, String Apellido2, String FechaDeIngreso, String AreaDeTrabajo, int Cedula, int Identificador, boolean Estado) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.FechaDeIngreso = FechaDeIngreso;
        this.AreaDeTrabajo = AreaDeTrabajo;
        this.Cedula = Cedula;
        this.Identificador = Identificador;
        this.Estado = Estado;
    }
    
    

    public String getAreaDeTrabajo() {
        return AreaDeTrabajo;
    }

    public void setAreaDeTrabajo(String AreaDeTrabajo) {
        this.AreaDeTrabajo = AreaDeTrabajo;
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

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

}
