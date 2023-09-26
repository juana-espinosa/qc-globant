/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosextra;

/**
 *
 * @author juana
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
        //0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        //Ejemplo:
        //0-0-0
        //0-0-1
        //0-0-2
        //0-0-E
        //0-0-4
        //0-1-2
        //0-1-E
        //Nota: investigar función equals() y como convertir números a String.
        String number1="";
        String number2="";
        String number3="";
        
        for (int i = 0; i <= 9; i++) {
            number1 = Integer.toString(i);
            for (int j = 0; j <= 9; j++) {
                number2 = Integer.toString(j);
                for (int k = 0; k <= 9; k++){
                number3 = Integer.toString(k);
                if (number1.equals("3")){
                number1="E";
                } 
                if(number2.equals("3")){
                    number2="E";
                } 
                if(number3.equals("3")){                                   
                    number3="E";                   
                }
                System.out.println(number1+ " - " + number2+  " - " +number3);
                }
            }
            
        }

        
    }
    
}
