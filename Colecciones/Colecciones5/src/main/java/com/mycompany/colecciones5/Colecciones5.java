/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colecciones5;

import Servicio.ServicioPais;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Colecciones5 {

    public static void main(String[] args) {
        ServicioPais pais = new ServicioPais();

        System.out.println("Hola! Elija una opción");
        System.out.println("1 - Agregar pais");
        System.out.println("2 - Ver paises");
        System.out.println("3 - Remover pais");
        System.out.println("4 - Ordenar los paises");
        System.out.println("5 - Salir");
        Scanner read = new Scanner(System.in);
        int option = read.nextInt();
        pais.agregarAlgunos();

        do {
            switch (option) {
                case 1 -> {
                    System.out.println("A continuación te pediremos unos datos");
                    pais.registrarNuevoPais();
                    System.out.println("1 - Agregar pais");
                    System.out.println("2 - Ver paises");
                    System.out.println("3 - Remover pais");
                    System.out.println("4 - Ordenar los paises");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
                case 2 -> {
                    //ver pais
                    pais.mostrarPaises();
                    System.out.println("1 - Agregar pais");
                    System.out.println("2 - Ver paises");
                    System.out.println("3 - Remover pais");
                    System.out.println("4 - Ordenar los paises");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
                case 3 -> {
                    String paisABorrar;
                    Scanner leer = new Scanner(System.in);
                    paisABorrar = leer.next();

                    pais.removerPais(paisABorrar);
                    System.out.println("1 - Agregar pais");
                    System.out.println("2 - Ver paises");
                    System.out.println("3 - Remover pais");
                    System.out.println("4 - Ordenar los paises");
                    System.out.println("5 - Salir");
                    option = read.nextInt();
                }
                case 4 -> {
                    pais.ordenarPaises();

                    System.out.println("1 - Agregar pais");
                    System.out.println("2 - Ver paises");
                    System.out.println("3 - Remover pais");
                    System.out.println("4 - Ordenar los paises");
                    System.out.println("5 - Salir");
                    option = read.nextInt();

                }

            }

        } while (option != 5);
        pais.mostrarPaises();
    }
}
