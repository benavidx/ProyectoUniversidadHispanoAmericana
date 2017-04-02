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

}
