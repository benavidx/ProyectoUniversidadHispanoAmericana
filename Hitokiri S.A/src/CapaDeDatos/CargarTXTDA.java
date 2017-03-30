/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;


import Entidades.Cliente;
import Entidades.Empleado;
import Entidades.Peliculas;
import Entidades.Usuarios;
import Entidades.Vacaciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class CargarTXTDA {
    
    private String file = null;
    
    private ArrayList<Empleado> ObjEmpleados;
    private ArrayList<Cliente> ObjClientes;
    private ArrayList<Usuarios> ObjUsuarios;
    private ArrayList<Peliculas> ObjPeliculas;
    private ArrayList<Vacaciones> ObjVacaciones;
    
    public CargarTXTDA() {
        this.ObjClientes = new ArrayList();

    }
    
    
    
    public void PrepararListas(String[] files) throws FileNotFoundException, IOException{
        for (int i = 0; i < files.length; i++) {
            switch (i){
                case 0:
                    rellenarListas(files[i], new Cliente());
                break;
                case 1:
                     rellenarListas(files[i]);
                break;
                case 2:
                     rellenarListas(files[i]);
                break;
                case 3:
                     rellenarListas(files[i]);
                break;
                case 4:
                     rellenarListas(files[i]);
                break;
            }
        }
    }
    
    private void rellenarListas(String file, Object j){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(file)));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp += bfRead;
            }
            Object[] lista = temp.split(";");
        } catch (IOException ex) {
            Logger.getLogger(CargarTXTDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
