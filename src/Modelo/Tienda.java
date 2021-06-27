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
public class Tienda {
    private String descripcion;
    private Inventario inventarioGeneral;

    public Tienda(String descripcion, Inventario inventarioGeneral) {
        this.descripcion = descripcion;
        this.inventarioGeneral = inventarioGeneral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Inventario getInventarioGeneral() {
        return inventarioGeneral;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setInventarioGeneral(Inventario inventarioGeneral) {
        this.inventarioGeneral = inventarioGeneral;
    }

    @Override
    public String toString() {
        return "Tienda\n" + "Descripción: " + getDescripcion() + "\nIventarioGeneral: " + getInventarioGeneral();
    }
    
}

