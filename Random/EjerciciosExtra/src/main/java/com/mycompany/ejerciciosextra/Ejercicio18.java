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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        // N, con los valores ingresados por el usuario.
        int size;
        int variable = 0;

        System.out.println("Ingrese la cantidad de numeros");
        Scanner read = new Scanner(System.in);
        size = read.nextInt();

        int[] array = new int[size];
 System.out.print("[ " );
        for (int i = 0; i < size; i++) {
//pongo aleatorios para no escribir todo
            array[i] = (int) (Math.random() * 10);
//voy asignando el valor del array para poder sumar todos
            variable = variable + array[i];
            System.out.print(Integer.toString(array[i]) +",");
        }
         System.out.print("]" );
        System.out.println("El total de la suma de los valores es " +variable);
    }
}


