/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;


import CapaDeDatos.CargarTXTDA;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Antonio
 */
public class CargarTXTBL {
    
    public CargarTXTBL(){
        
    }
    
    
    
    public void PrepararListas(String[] files) throws FileNotFoundException, IOException{
        new CargarTXTDA().PrepararListas(files);
    }
     
    
}
