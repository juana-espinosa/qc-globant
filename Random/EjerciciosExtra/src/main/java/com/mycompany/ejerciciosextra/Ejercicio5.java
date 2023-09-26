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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Una obra social tiene tres clases de socios:
        //Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
        //Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
        //Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
        //Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        //real que represente el costo del tratamiento (previo al descuento) y determine el
        //importe en efectivo a pagar por dicho socio.
        String memberType;
        double cost;
        double total;
        double discount;

        System.out.println("Bienvenido, ingrese la letra correspondiente a su tipo de sociedad");
        System.out.println("Ingrese A para socios de categoría A");
        System.out.println("Ingrese B para socios de categoría B");
        System.out.println("Ingrese C para socios de categoría C");
        Scanner read = new Scanner(System.in);
        memberType = read.next();
        memberType = memberType.toUpperCase();
        System.out.println("Ingrese el monto del tratamiento");
        cost = read.nextInt();

        switch (memberType) {
            case "A":
                discount = (cost * 0.50);
                total = cost - discount;
                System.out.println("Tenes que pagar " + total);
                break;
            case "B":
                discount = (cost * 0.35);
                total = cost - discount;
                System.out.println("Tenes que pagar " + total);
                break;
            case "C":
                System.out.println("Lamentablemente no tenes descuento, tenes que pagar " + cost);
                break;
        }

    }

}
