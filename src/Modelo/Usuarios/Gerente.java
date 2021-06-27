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
public class Gerente extends Usuario{

    private double bonoRendimiento;

    public Gerente(String nombre, String apellidoP, String apellidoM, int id, String username, String password, int numTienda, String cargo, double sueldoBase, double bonoRendimiento) {
        super(nombre, apellidoP, apellidoM, id, username, password, numTienda, cargo, sueldoBase);
        this.bonoRendimiento = bonoRendimiento;
    }

    public double getBonoRendimiento() {
        return bonoRendimiento;
    }

    public void setBonoRendimiento(double bonoRendimiento) {
        this.bonoRendimiento = bonoRendimiento;
    }
    
    @Override
    public double calculaPago(){
        return getSueldoBase()*(1.08) + getBonoRendimiento();
    }
    
}
