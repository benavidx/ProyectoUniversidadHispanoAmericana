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
    
    
    public ClientesDA(){
        
    }
    
    public javax.swing.table.DefaultTableModel getModelDataTable(){
        javax.swing.table.DefaultTableModel Model;
            Model = new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"Nombre","Apellido 1","Apellido 2"," Fecha Nacimiento","Direccion","Profesion","Cedula","Carnet","Estado","Genero"});
        if(CapaDeDatos.CargarTXTDA.ListClientes != null){
            for(Cliente itemFind: CapaDeDatos.CargarTXTDA.ListClientes){
                Model.addRow(
                new Object[]{
                    itemFind.getNombre(),itemFind.getApellido1(),itemFind.getApellido2(),itemFind.getFechaDeNacimiento(),itemFind.getDireccion(),itemFind.getProfesion(),itemFind.getCedula(),itemFind.getCarnet(),itemFind.getEstado(),itemFind.getGenero()
                    
                });
            }
        }
        return Model;
    }
    
}