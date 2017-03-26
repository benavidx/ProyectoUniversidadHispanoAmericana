/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Antonio
 */
public class CargarTXT {
    
    public CargarTXT(){
    
    }
    
    public Object getUsuarios() throws FileNotFoundException, IOException{
            
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\Antonio\\AppData\\Local\\Temp\\Usuarios.txt")));
        String temp = "";
        String bfRead;
        while((bfRead = bf.readLine()) != null){ 
                temp += bfRead; 
        }
            
        String file = temp;
            //Object[][] Usuarios = file.split(";");   
        
        return null;
    }


}
