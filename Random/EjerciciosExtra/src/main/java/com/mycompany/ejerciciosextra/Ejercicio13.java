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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que dibuje una escalera de números, donde cada línea de números
        //comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        //usuario al comenzar. Ejemplo: si se ingresa el número 3:
        //1
        //12
        //123
        int number=0;
        String variable = "";

        System.out.println("Ingrese el valor maximo de su piramide");
        Scanner read = new Scanner(System.in);
        number = read.nextInt();       
        
        for (int i = 1; i <= number; i++) {           
            variable = variable + i;
            System.out.println(variable);
        }
    }
    
}
