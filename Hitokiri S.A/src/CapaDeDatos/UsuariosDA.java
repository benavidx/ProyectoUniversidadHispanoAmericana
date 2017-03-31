/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import Entidades.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class UsuariosDA {
    
    private CargarTXTDA CargarTXTDA;
    
    protected ArrayList<Usuarios> ListUsuarios;
    
    public UsuariosDA() {
        
    }
    
    public boolean QueryUser(String user, String password) {
        if (!"".equals(user) && !"".equals(password)) {
            for (Usuarios itemFind : CargarTXTDA.ListUsuarios) {
                if (itemFind.getUsuario() == user && itemFind.getContraseña()==password) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
