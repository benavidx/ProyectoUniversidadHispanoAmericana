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
    
    public UsuariosDA() {
        CargarTXTDA = new CargarTXTDA(null);
        
    }
    
    public boolean QueryUser(String user, String password) {
        if (!"".equals(user) && !"".equals(password)) {
            for (Usuarios itemFind : CapaDeDatos.CargarTXTDA.ListUsuarios) {
                if (itemFind.getUsuario().equals(user) && itemFind.getContraseña().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
