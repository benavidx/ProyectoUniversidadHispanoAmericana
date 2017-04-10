/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDeDatos.EmpleadoDA;
import Entidades.Empleado;

/**
 *
 * @author Antonio
 */
public class EmpleadoBL {

        private final EmpleadoDA EmpleadoDA;
      public EmpleadoBL(){
      EmpleadoDA = new EmpleadoDA();
      }
      
    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {
        return EmpleadoDA.getModelDataTable(filtrado);
    }

    public javax.swing.table.DefaultTableModel addCliente(Empleado Empleado) {
        return EmpleadoDA.addEmpleado(Empleado);
    }

    public javax.swing.table.DefaultTableModel editItem(Empleado Empleado, int id) {
        return EmpleadoDA.editItem(Empleado, id);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        return EmpleadoDA.deleteItem(id);
    }
}
