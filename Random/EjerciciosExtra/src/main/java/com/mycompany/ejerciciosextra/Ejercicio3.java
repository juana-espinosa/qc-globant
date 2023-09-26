/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        //Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
        //String.
        
        String letter;
        System.out.println("Por favor, ingrese una letra");
        
        Scanner read = new Scanner(System.in);
        letter = read.next();
        
        letter = letter.toUpperCase();
        
        if (letter.equals("A") || letter.equals("E")|| letter.equals("I")|| letter.equals("O")||letter.equals("U")) {
        System.out.println("Su letra es una vocal");
        } else {System.out.println("Su letra es una consonante :(");}
    }
    
}
