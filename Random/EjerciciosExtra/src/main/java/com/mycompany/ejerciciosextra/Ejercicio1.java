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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        //usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        int minutes = 0;
        int hour;
        int days = 0;
        System.out.println("Por favor, ingrese la cantidad de minutos");
        
        Scanner read = new Scanner(System.in);
        minutes = read.nextInt();
        
        hour = minutes/60;
        
        while (hour >= 24){
        days++;
        hour = hour - 24;
        } 
        
        
        System.out.println("La cantidad de minutos equivale a " +days+ " y " +hour+ " horas");
     
    }
    
}
