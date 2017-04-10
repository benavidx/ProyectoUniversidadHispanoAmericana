/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Vacaciones;
import Entidades.Empleado;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VacacionesDA {

    private final int NOMBRE_EMPLEADO = 0;
    private final int NOMBRE_COMPLETO_EMPLEADO = 1;
    private final int APELLIDO_1_EMPLEADO = 2;
    private final int APELLIDO_2_EMPLEADO = 3;
    private final int ESTADO_EMPLEADO = 4;
    private final int AREA_DE_TRABAJO = 5;
    

    public VacacionesDA() {
    }

    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel
        Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                new Object[][]{},//Cargo las Filas vacias
                new String[]{"ID", "Cedula", "Nombre Completo", "Area de Trabajo", "Fecha de Solicitud", "Cantidad de dias", "Fecha de Ingreso", "Estado"});//Cargo los encabezados de la tabla
        if (CapaDeDatos.CargarTXTDA.ListVacaciones != null) {//Pregunto si la lista se encuentra vacia

            for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {
                Model.addRow(//Agrego al model la fila
                        new Object[]{
                            itemFind.getIdVacaciones(),itemFind.getCedulaEmpleado(),getDatosEmpleado(itemFind.getCedulaEmpleado(), NOMBRE_COMPLETO_EMPLEADO), getDatosEmpleado(itemFind.getCedulaEmpleado(), AREA_DE_TRABAJO),itemFind.getFechaSolicitud(),getFechaDeIngreso(itemFind),getEstadoWithBoolean(Boolean.parseBoolean(getDatosEmpleado(itemFind.getCedulaEmpleado(), ESTADO_EMPLEADO)))
                        });
            }
        }
        return Model;
    }

    public String getDatosEmpleado(int id, int position){    
       for (Empleado itemFind : CapaDeDatos.CargarTXTDA.ListEmpleados) {
           if (itemFind.getCedula()== id) {
               switch(position){
                   case 0:
                        return itemFind.getNombre();
                   case 1:
                       return itemFind.getNombre()+" "+itemFind.getApellido1()+" "+itemFind.getApellido2();
                   case 2:
                       return itemFind.getApellido1();
                   case 3:
                       return itemFind.getApellido2();
                   case 4:
                       return String.valueOf(itemFind.getEstado());
                   case 5:
                       return itemFind.getAreaDeTrabajo();
               }
           }
       }
       return "NO ASIGNADO";
    }

    public String getFechaDeIngreso(Vacaciones itemFind) {
        java.util.Calendar Solicitud = java.util.Calendar.getInstance();
        String[] FechaSolicitud = itemFind.getFechaSolicitud().split("-");
        Solicitud.set(Integer.parseInt(FechaSolicitud[2]), Integer.parseInt(FechaSolicitud[1]) - 1, Integer.parseInt(FechaSolicitud[0]));
        Solicitud.add(java.util.Calendar.DAY_OF_YEAR, itemFind.getCantidadDeDias());
        java.text.SimpleDateFormat Format = new java.text.SimpleDateFormat("dd-MM-yyyy");
        String fechaConFormato = Format.format(Solicitud.getTime());
        
        return fechaConFormato;
    }
    
    
    public javax.swing.table.DefaultTableModel addVacaciones(Vacaciones vacaciones) {
        if (vacaciones != null) {
            CapaDeDatos.CargarTXTDA.ListVacaciones.add(vacaciones);
            return getModelDataTable(false);
        }
        return null;
    }

    public javax.swing.table.DefaultTableModel editItem(Vacaciones vacaciones, int id) {
        for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {
            if (itemFind.getIdVacaciones()== id) {
                CapaDeDatos.CargarTXTDA.ListVacaciones.set(CapaDeDatos.CargarTXTDA.ListVacaciones.indexOf(itemFind), vacaciones);
            }
        }
        return getModelDataTable(false);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {
            if (itemFind.getIdVacaciones()== id) {
                CapaDeDatos.CargarTXTDA.ListVacaciones.remove(itemFind);
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
