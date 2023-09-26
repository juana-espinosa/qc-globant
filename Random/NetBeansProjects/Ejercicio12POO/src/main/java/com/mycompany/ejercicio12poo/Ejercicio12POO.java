/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio12poo;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejercicio12POO {

    public static void main(String[] args) {
        Persona juana = new Persona();
        juana.crearPersona();
        LocalDate fechaNacimiento = juana.convertToLocalDateViaInstant(juana.getDate());
        juana.calcularEdad(fechaNacimiento);
        System.out.print("\n");
        System.out.println("Ingrese una edad para comparar con la tuya");
        Scanner scanner = new Scanner(System.in);
        int edadComp = scanner.nextInt();
        juana.menorQue(edadComp);
        juana.mostrarPersona();

    }
}
