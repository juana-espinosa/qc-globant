/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videos;

import Entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Videos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //va a imprimir con 0, porque no imprimi el valor de la variable, y el valor por defecto primitivo es 0
        
        Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
       
       
        //para imprimir los datos:
        System.out.println(m1.apodo+" "+m1.edad+ " " + m1.tipo ); 
    }
}
