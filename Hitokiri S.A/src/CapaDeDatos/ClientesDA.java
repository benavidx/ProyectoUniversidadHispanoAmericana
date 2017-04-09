/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Cliente;

/**
 *
 * @author Antonio
 */
public class ClientesDA {

    public ClientesDA() {

    }

    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel
        if (filtrado) {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre Completo","Profesion", "Estado(Activo)"});//Cargo los encabezados de la tabla
        } else {
            Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                    new Object[][]{},//Cargo las Filas vacias
                    new String[]{"Nombre", "Apellido 1", "Apellido 2", " Fecha Nacimiento", "Direccion", "Profesion", "Cedula", "Carnet", "Estado", "Genero"});//Cargo los encabezados de la tabla
        }

        if (CapaDeDatos.CargarTXTDA.ListClientes != null) {//Pregunto si la lista se encuentra vacia
            for (Cliente itemFind : CapaDeDatos.CargarTXTDA.ListClientes) {
                if (filtrado) {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                itemFind.getNombre() + " " + itemFind.getApellido1() + " " + itemFind.getApellido2(), itemFind.getProfesion(), getEstadoWithBoolean(itemFind.getEstado())
                            });
                } else {
                    Model.addRow(//Agrego al model la fila
                            new Object[]{
                                itemFind.getNombre(), itemFind.getApellido1(), itemFind.getApellido2(), itemFind.getFechaDeNacimiento(), itemFind.getDireccion(), itemFind.getProfesion(), itemFind.getCedula(), itemFind.getCarnet(), getEstadoWithBoolean(itemFind.getEstado()), itemFind.getGenero()

                            });
                }
            }
        }
        return Model;
    }

    public javax.swing.table.DefaultTableModel addCliente(Cliente Cliente) {

        if (Cliente != null) {
            CapaDeDatos.CargarTXTDA.ListClientes.add(Cliente);
            return getModelDataTable(false);
        }
        return null;
    }

    public javax.swing.table.DefaultTableModel editItem(Cliente cliente, int id) {
        for (Cliente itemFind : CapaDeDatos.CargarTXTDA.ListClientes) {
            if (itemFind.getCedula() == id) {
                CapaDeDatos.CargarTXTDA.ListClientes.set(CapaDeDatos.CargarTXTDA.ListClientes.indexOf(itemFind), cliente);
            }
        }
        return getModelDataTable(false);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        for (Cliente itemFind : CapaDeDatos.CargarTXTDA.ListClientes) {
            if (itemFind.getCedula() == id) {
                CapaDeDatos.CargarTXTDA.ListClientes.remove(itemFind);
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
