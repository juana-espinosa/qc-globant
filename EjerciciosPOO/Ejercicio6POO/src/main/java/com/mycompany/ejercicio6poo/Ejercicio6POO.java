/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6poo;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejercicio6POO {

    public static void main(String[] args) {
        Cafetera cafe = new Cafetera();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamano de su taza ");
        int tamanoTaza = scanner.nextInt();
        cafe.servirTaza(tamanoTaza);
        cafe.llenarCafetera();
        cafe.vaciarCafereta();
        System.out.println("Ingrese cuanto queres agregar a su cafetera ");
        int agregar = scanner.nextInt();
        cafe.agregarCafe(agregar);
    }
}
