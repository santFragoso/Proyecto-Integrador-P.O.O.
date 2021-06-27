/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Usuarios;
import java.io.Serializable;

/**
 *
 * @author 4PF42LA_RS6
 */
public abstract class Usuario implements Serializable{
        private String nombre;
        private String apellidoP;
        private String apellidoM;
        private int id;
        private String username;
        private String password;
        private int numTienda;
        private String cargo;
        private double sueldoBase;

    public Usuario(String nombre, String apellidoP, String apellidoM, int id, String username, String password, int numTienda, String cargo, double sueldoBase) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.id = id;
        this.username = username;
        this.password = password;
        this.numTienda = numTienda;
        this.cargo = cargo;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getNumTienda() {
        return numTienda;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumTienda(int numTienda) {
        this.numTienda = numTienda;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calculaPago();
}
