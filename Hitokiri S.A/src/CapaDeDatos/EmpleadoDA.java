/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Empleado;
import Entidades.Vacaciones;

/**
 *
 * @author Antonio
 */
public class EmpleadoDA {
    
    public EmpleadoDA(){
    
    }
    
    
    public boolean IsOnVacation(int cedulaEmpleado){
        for(Vacaciones itemFind: CapaDeDatos.CargarTXTDA.ListVacaciones){
            if (itemFind.getCedulaEmpleado()==cedulaEmpleado) {
                return true;
            }
        }
        return false;
    }
    

    
}
