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
    private Empleado ObjEmpleado;
    private Cliente ObjCliente;
    private Usuarios ObjUsuarios;
    private Peliculas ObjPeliculas;
    private Vacaciones ObjVacaciones;
    private UsuariosDA UsuariosDA;
            
    protected ArrayList<Empleado> ListEmpleados;
    protected ArrayList<Cliente> ListClientes;
    protected ArrayList<Usuarios> ListUsuarios;
    protected ArrayList<Peliculas> ListPeliculas;
    protected ArrayList<Vacaciones> ListVacaciones;
    
    public CargarTXTDA() {
        this.ListEmpleados = new ArrayList();
        this.ListClientes = new ArrayList();
        this.ListUsuarios = new ArrayList();
        this.ListPeliculas = new ArrayList();
        this.ListVacaciones = new ArrayList();
    }
    
    
    
    public void PrepararListas(String[] files) throws FileNotFoundException, IOException{
        for (int i = 0; i < files.length; i++) {
            switch (i){
                case 0:
                    rellenarListas(files[i],0);
                break;
                case 1:
                     rellenarListas(files[i],1);
                break;
                case 2:
                     rellenarListas(files[i],2);
                break;
                case 3:
                     rellenarListas(files[i],3);
                break;
                case 4:
                     rellenarListas(files[i],4);
                break;
            }
        }
    }
    
    private void rellenarListas(String file,int ObjType){   
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(file)));
            String bfRead="";
            String[] arreglo;
            while((bfRead = bf.readLine()) != null){
                arreglo = bfRead.split(";");
                    switch(ObjType){
                        case 0:
                            ListEmpleados.add(this.ObjEmpleado = new Empleado(arreglo));
                        break;
                        case 1:
                            ListClientes.add(this.ObjCliente = new Cliente(arreglo));
                        break;
                        case 2:
                            ListUsuarios.add(new Usuarios(arreglo));
                        break;
                        case 3:
                            ListPeliculas.add(new Peliculas(arreglo));
                        break;
                        case 4:
                            ListVacaciones.add(new Vacaciones(arreglo));
                        break;

                    }
            }
            bf.close();
        } catch (IOException ex) {
            Logger.getLogger(CargarTXTDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
