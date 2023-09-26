/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juana
 */
import java.util.Scanner;

public class Juego {
    int upper = 1;
    int lower = 500;
    int nro = (int) (Math.random() * (upper - lower)) + lower;
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    int intentos = 0;

    public void jueguito() {
        int nroUser = 0;
        System.out.println("Nro: " + nro);

        do {
            try {
                System.out.println("Por favor, ingresa un número:");
                nroUser = read.nextInt();
                if (nroUser == nro) {
                    System.out.println("¡Felicitaciones! Adivinaste el número en " + intentos + " intentos");
                } else if (nro < nroUser) {
                    intentos++;
                    System.out.println("Le erraste, ya jugaste " + intentos);
                    System.out.println("Pista: El número es más chico...");
                } else if (nro > nroUser) {
                    intentos++;
                    System.out.println("Le erraste, ya jugaste " + intentos);
                    System.out.println("Pista: El número es más grande");
                }
            } catch (Exception e) {
                System.out.println("Dato no válido");
                intentos++;
                System.out.println("Le erraste, ya jugaste " + intentos);
                read.nextLine(); 
            }
        } while (intentos < 10 && nroUser != nro);
        
        if (intentos >= 10) {
            System.out.println("Te quedaste sin intentos");
        }
    }
}
    
   
