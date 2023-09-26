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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        //detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
        //y la cantidad de números impares. Al igual que en el ejercicio anterior los números
        //negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

        int number;
        int counterEven = 0;
        int counterOdd = 0;
        int i = 0;
        Scanner read = new Scanner(System.in);

        //pido el primer numero
        System.out.println("Ingrese su primer numero");
        number = read.nextInt();
        //hago el while por numeros dividos 5    
        while (number % 5 != 0) {
            i++;
            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
            System.out.println("Ingrese el numero " + (i + 1));
            number = read.nextInt();
        }
        System.out.println("La cantidad de numeros ingresados es " + i + " de los cuales " + counterEven + " son pares y " + counterOdd + " son impares");
    }

}
