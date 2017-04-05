/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Vacaciones;
import Entidades.Empleado;

/**
 *
 * @author Usuario
 */
public class VacacionesDA {

    public VacacionesDA() {
    }

    public javax.swing.table.DefaultTableModel getModelDataTable() {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel

        Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                new Object[][]{},//Cargo las Filas vacias
                new String[]{"ID Vacaciones", "Cedula", "Nombre Completo Empleado", "Area de Trabajo", "Fecha de Solicitud", "Cantidad de Dias", "Estado"});//Cargo los encabezados de la tabla

        if (CapaDeDatos.CargarTXTDA.ListVacaciones != null) {//Pregunto si la lista se encuentra vacia

            for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {

                Model.addRow(//Agrego al model la fila
                        new Object[]{
                            itemFind.getNombre() + " " + itemFind.getApellido1() + " " + itemFind.getApellido2(), itemFind.getCedula(), itemFind.getEstado()
                        }
              
                Model.addRow(//Agrego al model la fila
                        new Object[]{
                            itemFind.getNombre(), itemFind.getApellido1(), itemFind.getApellido2(), itemFind.getFechaDeIngreso(), itemFind.getIdentificador(), itemFind.getCedula(), itemFind.getEstado()

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
            if (itemFind.getCedula() == id) {
                CapaDeDatos.CargarTXTDA.ListEmpleados.set(CapaDeDatos.CargarTXTDA.ListEmpleados.indexOf(itemFind), Empleado);
            }
        }
        return getModelDataTable(false);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        for (Empleado itemFind : CapaDeDatos.CargarTXTDA.ListEmpleados) {
            if (itemFind.getCedula() == id) {
                CapaDeDatos.CargarTXTDA.ListEmpleados.remove(itemFind);
            }
        }
        return getModelDataTable(false);
    }

}
