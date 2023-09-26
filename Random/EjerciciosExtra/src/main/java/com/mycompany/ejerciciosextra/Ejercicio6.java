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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
        //por debajo de 1.60 mts. y el promedio de estaturas en general.
        
        double height;
        int quantityPeople;
        double averageShorties;
        int counterShorties=0;
        int counter=0;
        double heightShorties=0;
        double heightTotal=0;
        
        System.out.println("Ingrese la cantidad de personas");
        Scanner read = new Scanner(System.in);
        quantityPeople = read.nextInt();
        
        for (int i = 0; i <quantityPeople; i++){
        System.out.println("Ingrese la altura de dichas personas");
        height = read.nextDouble();
        if (height <= 1.60) {
            counterShorties++;
            heightShorties = heightShorties + height;
        }
        counter++;
        heightTotal = heightTotal +  height;                       
        }
        heightShorties = heightShorties / counterShorties;
        
        heightTotal = heightTotal/counter;
        
        System.out.println("La altura promedio de los minions es " +heightShorties+ " y del total de personas es " +heightTotal);
        
        
    }

}
