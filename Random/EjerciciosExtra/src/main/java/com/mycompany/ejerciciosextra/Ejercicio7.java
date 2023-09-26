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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
        //promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
        //números serán introducidos por el usuario. Realice dos versiones del programa, una
        //usando el bucle “while” y otra con el bucle “do - while”.
        int quantity;
        int numbers;
        int largestNumber = Integer.MIN_VALUE;
        int i = 0;
        int smallerNumber =Integer.MAX_VALUE;
        int average = 0;

        System.out.println("Ingrese la cantidad de numeros ");
        Scanner read = new Scanner(System.in);
        quantity = read.nextInt();

        while (i < quantity) {
            i++;
            System.out.println("Ingrese el numero " + i);
            numbers = read.nextInt();
            if (largestNumber < numbers) {
                largestNumber = numbers;
            }
            if (smallerNumber > numbers) {
                smallerNumber = numbers;
            }
            average = average + numbers;
            average = average / quantity;
        }
        System.out.println("El numero mas grande es " + largestNumber);
        System.out.println("El numero mas chico es " + smallerNumber);
        System.out.println("El promedio es " + average);

    }

}

