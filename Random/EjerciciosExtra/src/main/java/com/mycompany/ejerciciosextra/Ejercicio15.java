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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        //restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        //matemática y deben devolver sus resultados para imprimirlos en el main.

        int number1;
        int number2;
        int option;
        int result;

        System.out.println("Ingrese el numero 1");
        Scanner read = new Scanner(System.in);
        number1 = read.nextInt();
        System.out.println("Ingrese el numero 2");
        number2 = read.nextInt();

        

        do {
        result = 0;    
        System.out.println("Elija su opcion:");
        System.out.println("1- Para sumar");
        System.out.println("2- Para restar");
        System.out.println("3- Para multiplicar");
        System.out.println("4- Para dividir");
        System.out.println("5- Para salir");
        option = read.nextInt();   
            switch (option) {
                case 1:
                    result = add(number1, number2);
                    System.out.println("El resultado es " + result);
                    break;
                case 2:
                    result = substract(number1, number2);
                    System.out.println("El resultado es " + result);
                    break;
                case 3:
                    result = multiply(number1, number2);
                    System.out.println("El resultado es " + result);
                    break;
                case 4:
                    result = divide(number1, number2);
                    System.out.println("El resultado es " + result);
                    break;
            }
        } while (option != 5);

    }

    public static int add(int number1, int number2) {
        int result;

        result = number1 + number2;
        return result;
    }

    public static int substract(int number1, int number2) {
        int result;

        result = number1 - number2;
        return result;
    }

    public static int multiply(int number1, int number2) {
        int result;

        result = number1 * number2;
        return result;
    }

    public static int divide(int number1, int number2) {
        int result;

        result = number1 / number2;
        return result;
    }

}
