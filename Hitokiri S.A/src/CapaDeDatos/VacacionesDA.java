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

    private final int NOMBRE_EMPLEADO = 0;
    private final int NOMBRE_COMPLETO_EMPLEADO = 1;
    private final int APELLIDO_1_EMPLEADO = 2;
    private final int APELLIDO_2_EMPLEADO = 3;
    private final int ESTADO_EMPLEADO = 4;
    

    public VacacionesDA() {
    }

    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel
        if (filtrado) {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre Completo", "Cedula", "Estado"});//Cargo los encabezados de la tabla
        } else {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre", "Primer Apellido", "Segundo Apellido", "Cedula", "Identificador", "Fecha de ingreso", "Estado"});//Cargo los encabezados de la tabla
        }
        if (CapaDeDatos.CargarTXTDA.ListVacaciones != null) {//Pregunto si la lista se encuentra vacia

            for (Vacaciones itemFind : CapaDeDatos.CargarTXTDA.ListVacaciones) {
                if (filtrado) {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                getDatosEmpleado(itemFind.getCedulaEmpleado(),NOMBRE_COMPLETO_EMPLEADO),itemFind.getCedulaEmpleado(),getDatosEmpleado(itemFind.getCedulaEmpleado(),ESTADO_EMPLEADO)
                            });
                } else {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                getDatosEmpleado(itemFind.getCedulaEmpleado(),NOMBRE_EMPLEADO),getDatosEmpleado(itemFind.getCedulaEmpleado(),APELLIDO_1_EMPLEADO),getDatosEmpleado(itemFind.getCedulaEmpleado(),APELLIDO_2_EMPLEADO),itemFind.getCedulaEmpleado(),itemFind.getIdVacaciones(),"Fecha de ingreso",getDatosEmpleado(itemFind.getCedulaEmpleado(),ESTADO_EMPLEADO)
                            });
                }

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
               }
           }
       }
       return "NO ASIGNADO";
    }
        
    public void getFechaDeIngreso(Vacaciones itemFind){
        java.util.Calendar Solicitud = java.util.Calendar.getInstance();
        String[] FechaSolicitud = itemFind.getFechaSolicitud().split("-");
        
        Solicitud.set(Integer.parseInt(FechaSolicitud[2]), Integer.parseInt(FechaSolicitud[1]), Integer.parseInt(FechaSolicitud[0]));
        
        Solicitud.add(java.util.Calendar.DAY_OF_YEAR, itemFind.getCantidadDeDias());
        
    }
    
    
    public void getFechaDeIngreso(String fechaSolicitud, int cantidadDias){
        java.util.Calendar Solicitud = java.util.Calendar.getInstance();
        String[] FechaSolicitud = fechaSolicitud.split("-");
        
        Solicitud.set(Integer.parseInt(FechaSolicitud[2]), Integer.parseInt(FechaSolicitud[1]), Integer.parseInt(FechaSolicitud[0]));
        System.out.println(FechaSolicitud[2]+"/"+FechaSolicitud[1]+"/"+FechaSolicitud[0]);
        Solicitud.add(java.util.Calendar.DAY_OF_YEAR, cantidadDias);
        System.out.println(Solicitud.getTime());
    }
    
    
/////////////////////////////////////////////////////////////////////////////////
    
    
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
