/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Numeritos {

    ArrayList<Integer> numerillos = new ArrayList();

    public void pedirNumeros() {
        int numero = 0;
        while (numero != -99) {
            System.out.println("Hola! Ingrese un numero, porfa");
            Scanner readNumero = new Scanner(System.in);
            numero = readNumero.nextInt();
            if (numero != -99){
            numerillos.add(numero);}
        }
    }

    public void mostrarNumeros() {
        for (Integer numero : numerillos){
        System.out.print(" // "+numero+" // " );
        }
    }
}
