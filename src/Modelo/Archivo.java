/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Victor Mendoza
 */
public class Archivo {
    
    public void escribir(ArrayList<Producto> listaProductos){
        try{
            ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("listaProductos.dat"));
            
            System.out.println("Datos guardados correctamente");
            escribiendo.writeObject(listaProductos);
            escribiendo.close();
            
            
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    
    
    public static ArrayList<Producto> leer(){
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        try{
            ObjectInputStream leyendo = new ObjectInputStream(new FileInputStream("listaProductos.dat"));
            listaProductos = (ArrayList<Producto>) leyendo.readObject();
            leyendo.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error");
        }
        
        return listaProductos;
    }
    
}
