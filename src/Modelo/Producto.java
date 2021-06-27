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
class Producto {
    private String nombreProducto;
    private int codigoProducto;
    private ValorMonetario precioVenta;
    private boolean disponibilidad;
    private ValorMonetario precioCompra;
    private double margenGanancia;
    private String unidadMedida;

    public Producto(String nombreProducto, int codigoProducto, ValorMonetario precioVenta, boolean disponibilidad, ValorMonetario precioCompra, double margenGanancia, String unidadMedida) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioVenta = precioVenta;
        this.disponibilidad = disponibilidad;
        this.precioCompra = precioCompra;
        this.margenGanancia = margenGanancia;
        this.unidadMedida = unidadMedida;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public ValorMonetario getPrecioVenta() {
        return precioVenta;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public ValorMonetario getPrecioCompra() {
        return precioCompra;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setPrecioVenta(ValorMonetario precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setPrecioCompra(ValorMonetario precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
}
