/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDeDatos.ClientesDA;
import Entidades.Cliente;

/**
 *
 * @author Antonio
 */
public class ClientesBL {
    private final ClientesDA ClientesDA;
    public ClientesBL(){
        ClientesDA = new ClientesDA();
    }
    
    
    
    
    public javax.swing.table.DefaultTableModel getModelDataTable(boolean filtrado){
        return ClientesDA.getModelDataTable(filtrado);
    }
    
       public boolean addCliente(Cliente Cliente){
          return ClientesDA.addCliente(Cliente);
    }
       
    public javax.swing.table.DefaultTableModel editItem(Cliente cliente ,int id) {    
        return ClientesDA.editItem(cliente, id);
    }
    
    public javax.swing.table.DefaultTableModel deleteItem(int id) {    
        return ClientesDA.deleteItem(id);
    }
}
