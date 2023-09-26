/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

/**
 *
 * @author juana
 */
import java.util.Date;
import Entidad.Persona;


//import Entidad.Persona;
public class POO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Persona persona1 = new Persona("Juana","62400000");
        //persona1.iDNumber(62405804);
//IDNumber cedula = new IDNumber(62405804);        
//name = new name (Juani);        
Date fecha = new Date(2000, 02, 28, 01, 15);
 System.out.println(persona1.name +" "+ persona1.iDNumber +" "+ fecha);
 
    }
}
