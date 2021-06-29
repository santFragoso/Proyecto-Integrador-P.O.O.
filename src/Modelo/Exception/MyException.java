/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Exception;

/**
 *
 * @author 4PF42LA_RS6
 */

public class MyException extends Exception {
    
    public static final long serialVersionUNID = 700L;
    
    public MyException(String mensaje){
        super(mensaje);
    }
}
