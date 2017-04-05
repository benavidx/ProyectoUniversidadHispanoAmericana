/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import CapaDeDatos.UsuariosDA;

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

}
