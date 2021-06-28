/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Modelo.Usuarios.*;
import Vista.InterfazGraficaTienda;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 4PF42LA_RS6
 */
public class PruebaInterfazTienda {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new InterfazGraficaTienda().setVisible(true);
    }
    
    public static ArrayList<Usuario> cargaArregloUsuarios(){
        //ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        //listaUsuarios.add(new Gerente("Alfredo", "Esparza", "Gamboa", 10000, "AlfredEsp", "pollitofeliz22", 1, "Gerente", 12000, 1500));
        //listaUsuarios.add(new Empleado("Raúl", "Fernández", "Salas", 10001, "FernanSls", "pizzadequeso101", 1, "Empleado", 8000, 1000));
        //return listaUsuarios;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try {
            try (BufferedReader entrada = new BufferedReader(new FileReader("Usuarios.txt"))) {
                String s, s2 = new String();
                String nombre, apellidoP, apellidoM;
                int id;
                String username, password;
                int numTienda;
                String cargo;
                double sueldoBase;
                double bonoPOR;
                while ((s = entrada.readLine()) != null) {
                    s2 += s + "\n";
                    String[] informacion = s.split("/");
                    nombre = informacion[0];
                    apellidoP = informacion[1];
                    apellidoM = informacion[2];
                    id = Integer.parseInt(informacion[3]);
                    username = informacion[4];
                    password = informacion[5];
                    numTienda = Integer.parseInt(informacion[6]);
                    cargo = informacion[7];
                    sueldoBase = Double.parseDouble(informacion[8]);
                    bonoPOR = Double.parseDouble(informacion[9]);
                    
                    if(cargo.equals("Gerente")){
                        Gerente NuevoGerente = new Gerente(nombre, apellidoP, apellidoM, id, username, password, numTienda, cargo, sueldoBase, bonoPOR);
                        listaUsuarios.add(NuevoGerente);
                    }
                    if(cargo.equals("Empleado")){
                        Empleado NuevoEmpleado = new Empleado(nombre, apellidoP, apellidoM, id, username, password, numTienda, cargo, sueldoBase, bonoPOR);
                        listaUsuarios.add(NuevoEmpleado);
                    }
                }   System.out.println("Usuarios:" + "\n" + s2);                 
            }
        } 
        catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra en la Base");
        }
        return listaUsuarios;
    }
}
