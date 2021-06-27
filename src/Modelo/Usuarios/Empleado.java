/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Usuarios;

/**
 *
 * @author 4PF42LA_RS6
 */
public class Empleado extends Usuario {

    private double bonoPuntualidad;

    public Empleado(String nombre, String apellidoP, String apellidoM, int id, String username, String password, int numTienda, String cargo, double sueldoBase, double bonoPuntualidad) {
        super(nombre, apellidoP, apellidoM, id, username, password, numTienda, cargo, sueldoBase);
        this.bonoPuntualidad = bonoPuntualidad;
    }

    public double getBonoPuntualidad() {
        return bonoPuntualidad;
    }

    public void setBonoPuntualidad(double bonoPuntualidad) {
        this.bonoPuntualidad = bonoPuntualidad;
    }

    @Override
    public double calculaPago(){
        return getSueldoBase() + getBonoPuntualidad();
    }
    
}
