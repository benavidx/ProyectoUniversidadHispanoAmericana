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
public class Peliculas {
    private String Descripcion;
    private int IdPeliculas, cantidad;
    private boolean Genero, Estado;

     public Peliculas(String Descripcion, int IdPeliculas, int cantidad, boolean Genero, boolean Estado) {
        this.Descripcion = Descripcion;
        this.IdPeliculas = IdPeliculas;
        this.cantidad = cantidad;
        this.Genero = Genero;
        this.Estado = Estado;
    }

    public Peliculas() {
         this.Descripcion = "";
        this.IdPeliculas = 0;
        this.cantidad = 0;
        this.Genero = false;
        this.Estado = false;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdPeliculas() {
        return IdPeliculas;
    }

    public void setIdPeliculas(int IdPeliculas) {
        this.IdPeliculas = IdPeliculas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isGenero() {
        return Genero;
    }

    public void setGenero(boolean Genero) {
        this.Genero = Genero;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}

