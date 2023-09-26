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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        //muestre la suma de sus elementos.
        int size1;
        int size2;
        int variable = 0;

        System.out.println("Ingrese la cantidad de filas");
        Scanner read = new Scanner(System.in);
        size1 = read.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        size2 = read.nextInt();

        int[][] matrix = new int[size1][size2];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
//pongo aleatorios para no escribir todo
                matrix[i][j] = (int) (Math.random() * 10);
//voy asignando el valor de la matriz para poder sumar todos
                variable = variable + matrix[i][j];
            }
        }


       System.out.println("La matriz  es: ");
        for (int x = 0; x < matrix.length; x++) {
            System.out.print("|");
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y]);
                if (y != matrix[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

        read.close();
        System.out.println("El total de la suma de los valores es " + variable);

    }

}
