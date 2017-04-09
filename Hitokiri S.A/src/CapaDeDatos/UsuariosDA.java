/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Usuarios;

/**
 *
 * @author Antonio
 */
public class UsuariosDA {

    private CargarTXTDA CargarTXTDA;
    private EmpleadoDA EmpleadoDA;

    public UsuariosDA() {
        CargarTXTDA = new CargarTXTDA(null);
        EmpleadoDA = new EmpleadoDA();
    }

    public boolean QueryUser(String user, String password) {
        if (!"".equals(user) && !"".equals(password)) {
            for (Usuarios itemFind : CapaDeDatos.CargarTXTDA.ListUsuarios) {
                if (itemFind.getUsuario().equals(user)) {
                    if (!itemFind.getBloqueado()) {
                        if (!EmpleadoDA.IsOnVacation(itemFind.getIdentificador())) {
                            if (itemFind.getContraseña().equals(password)) {
                                itemFind.setIntentos(0);
                                return true;
                            } else {
                                itemFind.setIntentos(itemFind.getIntentos() + 1);
                                if (itemFind.getIntentos() == 3) {
                                    itemFind.setBloqueado(true);
                                    return false;
                                }
                            }
                        }
                        return false;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    
    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {

        javax.swing.table.DefaultTableModel Model;//Creo la variable Model de tipo DefaultTableModel

        Model = new javax.swing.table.DefaultTableModel(//Le asigno el valor
                new Object[][]{},//Cargo las Filas vacias
                new String[]{"ID", "Usuario", "Contraseña", "Fecha de Ingreso", "Bloqueado", "Estado"});//Cargo los encabezados de la tabla

        if (CapaDeDatos.CargarTXTDA.ListUsuarios != null) {//Pregunto si la lista se encuentra vacia
            for (Usuarios itemFind : CapaDeDatos.CargarTXTDA.ListUsuarios) {
                Model.addRow(//Agrego al model la fila
                        new Object[]{
                            itemFind.getIdentificador(), itemFind.getUsuario(), itemFind.getContraseña(), itemFind.getFechaDeIngreso(), getBloqueadoWithBoolean(itemFind.getBloqueado()), getEstadoWithBoolean(itemFind.getEstado())
                        });
            }
            return Model;
        }
        return null;
    }
    private String getBloqueadoWithBoolean(boolean bloqueado) {
        if (bloqueado) {
            return "Bloqueado";
        }
        return "Desbloqueado";
    }

    private String getEstadoWithBoolean(boolean estado) {
        if (estado) {
            return "Activo";
        }
        return "Inactivo";
    }
    
    public javax.swing.table.DefaultTableModel addUsuario(Usuarios User) {
        if (User != null) {
            CapaDeDatos.CargarTXTDA.ListUsuarios.add(User);
            return getModelDataTable(false);
        }
        return null;
    }

    public javax.swing.table.DefaultTableModel editItem(Usuarios User, int id) {
        for (Usuarios itemFind : CapaDeDatos.CargarTXTDA.ListUsuarios) {
            if (itemFind.getIdentificador()== id) {
                CapaDeDatos.CargarTXTDA.ListUsuarios.set(CapaDeDatos.CargarTXTDA.ListUsuarios.indexOf(itemFind), User);
            }
        }
        return getModelDataTable(false);
    }
    
    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        for (Usuarios itemFind : CapaDeDatos.CargarTXTDA.ListUsuarios) {
            if (itemFind.getIdentificador()== id) {
                CapaDeDatos.CargarTXTDA.ListUsuarios.remove(itemFind);
            }
        }
        return getModelDataTable(false);
    }
}
