/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDeDatos.VacacionesDA;
import Entidades.Vacaciones;

/**
 *
 * @author Usuario
 */
public class VacacionesBL {
    
    
    private final VacacionesDA VacacionesDA;

    public VacacionesBL() {
        VacacionesDA = new VacacionesDA();
    }
    
        public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado) {
        return VacacionesDA.getModelDataTable(filtrado);
    }

    public javax.swing.table.DefaultTableModel addCliente(Vacaciones Vacaciones) {
        return VacacionesDA.addVacaciones(Vacaciones);
    }

    public javax.swing.table.DefaultTableModel editItem(Vacaciones Vacaciones, int id) {
        return VacacionesDA.editItem(Vacaciones, id);
    }

    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        return VacacionesDA.deleteItem(id);
    }

}
