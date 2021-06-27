/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 4PF42LA_RS6
 */
class ValorMonetario {
    private double monto;

    public ValorMonetario(double monto) {
        if(monto < 0)
            this.monto = 0;
        else
            this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Monto: " + getMonto();
    }
    
}
