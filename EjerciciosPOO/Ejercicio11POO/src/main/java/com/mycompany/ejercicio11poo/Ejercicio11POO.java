/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11poo;

import Entidades.Date;
import static Entidades.Date.calcularDiferenciaEnAnios;
import static Entidades.Date.pedirFecha;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Ejercicio11POO {

    public static void main(String[] args) {
        LocalDate fecha = pedirFecha();
        long diferenciaEnAnios = calcularDiferenciaEnAnios(fecha);
        System.out.println("La diferencia entre las fechas es de " + diferenciaEnAnios + " años.");
        //System.out.println( "Fecha de mi cumpleaños: " + datacita.of(1972, .MAY, 23) );
        System.out.println("La fecha actual es: " + LocalDate.now());
        Scanner scanner = new Scanner(System.in);
        
    }
}
