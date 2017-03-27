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
public class Vacaciones {
    private int IdVacaciones, CedulaEmpleado, CantidadDeDias;
    private String FechaSolicitud;

    
     public Vacaciones(int IdVacaciones, int CedulaEmpleado, int CantidadDeDias, String FechaSolicitud) {
        this.IdVacaciones = IdVacaciones;
        this.CedulaEmpleado = CedulaEmpleado;
        this.CantidadDeDias = CantidadDeDias;
        this.FechaSolicitud = FechaSolicitud;
    }

    public Vacaciones() {
        this.IdVacaciones = 0;
        this.CedulaEmpleado = 0;
        this.CantidadDeDias = 0;
        this.FechaSolicitud = "";
    }

    public int getIdVacaciones() {
        return IdVacaciones;
    }

    public void setIdVacaciones(int IdVacaciones) {
        this.IdVacaciones = IdVacaciones;
    }

    public int getCedulaEmpleado() {
        return CedulaEmpleado;
    }

    public void setCedulaEmpleado(int CedulaEmpleado) {
        this.CedulaEmpleado = CedulaEmpleado;
    }

    public int getCantidadDeDias() {
        return CantidadDeDias;
    }

    public void setCantidadDeDias(int CantidadDeDias) {
        this.CantidadDeDias = CantidadDeDias;
    }

    public String getFechaSolicitud() {
        return FechaSolicitud;
    }

    public void setFechaSolicitud(String FechaSolicitud) {
        this.FechaSolicitud = FechaSolicitud;
    }
    
    
    
    
}

