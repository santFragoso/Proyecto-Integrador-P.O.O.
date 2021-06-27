/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author 4PF42LA_RS6
 */
public class Inventario {
    private ArrayList<Producto> inventarioProducto;
    private Registro registroGeneral;
    private ArrayList<Usuario> usuarios;

    public ArrayList<Producto> getInventarioProducto() {
        return inventarioProducto;
    }

    public Registro getRegistroGeneral() {
        return registroGeneral;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setInventarioProducto(ArrayList<Producto> inventarioProducto) {
        this.inventarioProducto = inventarioProducto;
    }

    public void setRegistroGeneral(Registro registroGeneral) {
        this.registroGeneral = registroGeneral;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
}
