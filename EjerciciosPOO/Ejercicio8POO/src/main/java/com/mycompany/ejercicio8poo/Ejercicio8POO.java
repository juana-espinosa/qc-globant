/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8poo;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejercicio8POO {
//En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. 


    public static void main(String[] args) {
        String frase;
        int tamano;
        Cadena frase1 = new Cadena();
        System.out.println("Ingrese la FRASE");
        Scanner scanner = new Scanner(System.in);
        frase = scanner.next();
        tamano = frase.length();
        frase1.setFrase(frase);
        frase1.setTamano(tamano);
        
         System.out.println(tamano);
         
         frase1.pasarAArray();
         frase1.mostrarVocales();
         frase1.invertirFrase();
         frase1.vecesRepetido();
         frase1.unirFrases();
         frase1.reemplazar();
                 frase1.contiene();
    }
}
