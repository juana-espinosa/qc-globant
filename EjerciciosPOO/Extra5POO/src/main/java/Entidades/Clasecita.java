/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Clasecita {

   String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = meses[9];
    String intento;
    boolean validar = true;
 public void mesAleatorio(){
     Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Adivine el mes secreto introduciendo el nombre del mes en minúsculas:");
            intento = scanner.next();

            if (intento.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                validar = false;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (validar);
 }

}
