/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class ReservaPeliculas {
    
    private int periodoReserva;
    private int costoAlquiler;
    private int multa;

    public ReservaPeliculas(int periodoReserva, int costoAlquiler, int multa) {
        this.periodoReserva = periodoReserva;
        this.costoAlquiler = costoAlquiler;
        this.multa = multa;
    }

    public ReservaPeliculas() {
        this.periodoReserva = 0;
        this.costoAlquiler = 0;
        this.multa = 0;
    }

    public int getPeriodoReserva() {
        return periodoReserva;
    }

    public void setPeriodoReserva(int periodoReserva) {
        this.periodoReserva = periodoReserva;
    }

    public int getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(int costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }
    
    
    
    
    
}
