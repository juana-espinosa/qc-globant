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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        int M;
        int age = 0;
        int totalAge = 0;
        int average;
        // Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        // hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
        //cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
        System.out.println("Por favor, escriba la cantidad de familias");
        Scanner read = new Scanner(System.in);
        N = read.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Por favor, escriba la cantidad de hijos de la familia " +i);
            M = read.nextInt();
            for (int j = 1; j <= M; j++) {
                System.out.println("Por favor, escriba la edad del hijo " +j);
                age = read.nextInt();
                totalAge = totalAge +  age; 
            }
                average = totalAge / M;
                System.out.println("El promedio de edad de la familia " + i + " es " + average + " teniendo en cuenta las edades ingresadas y la cantidad de hijos");
                totalAge = 0;
        }

    }

}
