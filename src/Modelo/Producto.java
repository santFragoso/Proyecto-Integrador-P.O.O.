/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author 4PF42LA_RS6
 */
public class Producto implements Serializable{
    private String nombreProducto;
    private String codigoProducto;
    private double precioVenta;
    private double precioCompra;
    private int cantidadDisponible;
    private String unidadMedida;

    public Producto(String nombreProducto, String codigoProducto, double precioVenta, double precioCompra, int cantidadDisponible, String unidadMedida) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        setPrecioVenta(precioVenta);
        setPrecioCompra(precioCompra);
        setCantidadDisponible(cantidadDisponible);
        this.unidadMedida = unidadMedida;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecioVenta(double precioVenta) {
        if(precioVenta < 0)
            this.precioVenta=0;
        else
            this.precioVenta = precioVenta;
    }

    public void setPrecioCompra(double precioCompra) {
        if(precioCompra < 0)
            precioCompra = 0;
        else
            this.precioCompra = precioCompra;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        if (cantidadDisponible < 0)
            this.cantidadDisponible = 0;
        else
            this.cantidadDisponible = cantidadDisponible;
    }

    public void setUnidadMedida(String unidadMedida) {
        if(unidadMedida.equals("Pza"))
            this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", codigoProducto=" + codigoProducto + ", precioVenta=" + precioVenta + ", precioCompra=" + precioCompra + ", cantidadDisponible=" + cantidadDisponible + ", unidadMedida=" + unidadMedida + "\n";
    }

    
    
}
