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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        //comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        //elementos).5

        int size;
        boolean find = false;

        System.out.println("Por favor, escriba la cantidad de números que desea que tenga su vector:");
        Scanner read = new Scanner(System.in);
        size = read.nextInt();
        int[] array = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < size-1; i++) {            
            array[i] = 5;
            //array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < size-1; i++) {
            array2[i] = 5;
            //array2[i] = (int) (Math.random() * 10);
        }

            //find = false;
            for (int i = 0; i < size-1; i++) {
                if (array[i] != array2[i]) {
                    find = true;
                    break; 
                }
            }

        if (find == true) {
            System.out.println("Los arrays no son iguales");
        } else {
            System.out.println("Los arrays son iguales");
        }

        // Imprimir el array
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Imprimir el array 2
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
