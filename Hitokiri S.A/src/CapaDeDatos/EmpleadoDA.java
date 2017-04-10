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

    public EmpleadoDA() {

    }

    public boolean IsOnVacation(int cedulaEmpleado) {
        for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {
            if (itemFind.getCedulaEmpleado() == cedulaEmpleado) {
                return true;
            }
        }
        return false;
    }

    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel
        if (filtrado) {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre Completo", "Cedula", "Estado(Activo)"});//Cargo los encabezados de la tabla
        } else {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre", "Primer Apellido", "Segundo Apellido", "Cedula", "Identificador", "Fecha de Ingreso", "Estado"});//Cargo los encabezados de la tabla
        }

        if (CapaDeDatos.CargarTXTDA.ListEmpleados != null) {//Pregunto si la lista se encuentra vacia
            for (Empleado itemFind : CapaDeDatos.CargarTXTDA.ListEmpleados) {
                if (filtrado) {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                itemFind.getNombre() + " " + itemFind.getApellido1() + " " + itemFind.getApellido2(), itemFind.getCedula(), itemFind.getFechaDeIngreso(),getEstadoWithBoolean(itemFind.getEstado())
                            });
                } else {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                itemFind.getNombre(), itemFind.getApellido1(), itemFind.getApellido2(),itemFind.getCedula(), itemFind.getIdentificador(),  itemFind.getFechaDeIngreso(),getEstadoWithBoolean(itemFind.getEstado())

                            });
                }
            }
        }
        return Model;
    }

    public javax.swing.table.DefaultTableModel addEmpleado(Empleado Empleado) {

        if (Empleado != null) {
            CapaDeDatos.CargarTXTDA.ListEmpleados.add(Empleado);
            return getModelDataTable(false);
        }
        return null;
    }

    public javax.swing.table.DefaultTableModel editItem(Empleado Empleado, int id) {
        for (Empleado itemFind : CapaDeDatos.CargarTXTDA.ListEmpleados) {
            if (itemFind.getIdentificador()== id) {
                CapaDeDatos.CargarTXTDA.ListEmpleados.set(CapaDeDatos.CargarTXTDA.ListEmpleados.indexOf(itemFind), Empleado);
            }
        }
        return getModelDataTable(false);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        for (Empleado itemFind : CapaDeDatos.CargarTXTDA.ListEmpleados) {
            if (itemFind.getIdentificador() == id) {
                CapaDeDatos.CargarTXTDA.ListEmpleados.remove(itemFind);
                break;
            }
        }
        return getModelDataTable(false);
    }
    
    public String getEstadoWithBoolean(boolean estado){
            if (estado) {
                return "Activo";
            }else{
                return "Inactivo";
            }
        }
}
