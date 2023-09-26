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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        //equivalente en romano.
        int num;
        int unity = 0;
        String Roman = "";

        System.out.println("Por favor, ingrese un numero del 1 al 10");
        Scanner read = new Scanner(System.in);
        num = read.nextInt();

        if (num <= 10) {
            if (num == 10) {
                Roman = Roman + "X";
            } else if (num == 9) {
                Roman = Roman + "IX";
            } else if (num >= 5) {
                Roman = Roman + "V";
                for (int i = 6; i <= num; i++) {
                    Roman = Roman + "I";
                }
            } else if (num == 4) {
                Roman = Roman + "IV";
            } else {
                for (int i = 1; i <= num; i++) {
                    Roman = Roman + "I";
                }
            }
            System.out.println("El numero en romano es " + Roman);
        } else {
            System.out.println("Su numero es mas grande de lo aceptado");
        }
    }       
}
