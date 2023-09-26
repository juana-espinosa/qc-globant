/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author juana
 */
//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. 
//En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. 
//Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
public class Date {

    private int dia;
    private int mes;
    private int anio;

    public Date(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

//constructor vacio
    public Date() {   }
    
    public static LocalDate pedirFecha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año:");
        int anio = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();
        return LocalDate.of(anio, mes, dia);
    }
    

    public static long calcularDiferenciaEnAnios(LocalDate fecha) {
        return ChronoUnit.YEARS.between(fecha, LocalDate.now());
    }
}

//public static mostrarDiferencia(){
//LocalDate fNacimiento = LocalDate.of(1972, Month.MAY, 23);
//System.out.println("La diferencia entre las fechas es de " + diferenciaEnAnios + " años.");

