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

    private String Descripcion, Genero;
    private int IdPeliculas, cantidad;
    private boolean Estado;

    public Peliculas(String[] ObjectList) {
        this.Descripcion = ObjectList[0];
        this.IdPeliculas = Integer.parseInt(ObjectList[1]);
        this.cantidad = Integer.parseInt(ObjectList[2]);
        this.Genero = ObjectList[3];
        this.Estado = Boolean.parseBoolean(ObjectList[4]);
    }

    public Peliculas() {
        this.Descripcion = "";
        this.IdPeliculas = 0;
        this.cantidad = 0;
        this.Genero = "";
        this.Estado = false;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
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

    public boolean getEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

}
