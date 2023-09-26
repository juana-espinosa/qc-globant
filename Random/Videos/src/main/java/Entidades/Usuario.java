/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author juana
 */
public class Usuario {
    public String nombre; 
    public String apellido;
    //puede ser perfectamente un string
    public int dni;
    //para que no sea estatico, es mas practico poner nacimiento en vez de fecha
    public Date nacimiento;
    public String pais;

    public Usuario() {
    }
    
    
}
