/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDeDatos.UsuariosDA;
import Entidades.Usuarios;

/**
 *
 * @author Antonio
 */
public class UsuariosBL {

    UsuariosDA UsuariosDA;

    public UsuariosBL() {
        UsuariosDA = new UsuariosDA();
    }

    public boolean QueryUser(String user, String password) {
        return UsuariosDA.QueryUser(user, password);
    }

    
    public javax.swing.table.DefaultTableModel getModelDataTable(boolean Filter){
        return UsuariosDA.getModelDataTable(Filter);
    }
    
    public javax.swing.table.DefaultTableModel addUsuario(Usuarios User){
        return UsuariosDA.addUsuario(User);
    
    }
    
    public javax.swing.table.DefaultTableModel editItem(Usuarios Usuario, int id) {
        return UsuariosDA.editItem(Usuario, id);
    }
    public javax.swing.table.DefaultTableModel deleteItem(int id) {
        return UsuariosDA.deleteItem(id);
    }
}
