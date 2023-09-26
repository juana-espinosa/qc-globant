/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import Extra1.Barco;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author juana
 */
public class Alquiler {

    String nombre;
    int documentoCliente;
    LocalDate fechaDeAlquiler;
    LocalDate fechaDeDevolucion;
    String posicion;
    Barco barco;

    public Alquiler(String nombre, int documentoCliente, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion, String posicion, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void calcularFechas(List <Barco> barcos) {
        for (Barco barco : barcos){
        double numberOFDays = Math.ceil(ChronoUnit.DAYS.between(fechaDeAlquiler, fechaDeDevolucion));
        //System.out.println("La diferencia de dias es de: " + numberOFDays);
        double valorAlq = numberOFDays + barco.calculoEslora();
        System.out.println("Su alquiler es de " + valorAlq);

        //double diacitos = numberOFDays.toDays();
        // int days = (int) diacitos;
        // int intValue = Long.valueOf(milliseconds).intValue();
        // Imprimir el valor entero
        //  System.out.println("Duración en milisegundos: " + milliseconds);
        // System.out.println("Valor entero: " + intValue);
        //return numberOFDays;
        }
    }

    public void alquilar(List <Barco> barcos) {
        for (Barco barco : barcos){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        setNombre(read.next());
        System.out.println("Ingrese su documento");
        setDocumentoCliente(read.nextInt());
        System.out.println("Ingrese la fecha de alquiler (yyyy-MM-dd)");
        String dateString = read.next();
        setFechaDeAlquiler(LocalDate.parse(dateString));
        System.out.println("Ingrese la fecha de devolucion (yyyy-MM-dd)");
        String dateDevolution = read.next();
        setFechaDeDevolucion(LocalDate.parse(dateDevolution));
        System.out.println("Ingrese la posicion");
        setPosicion(read.next());
        }
        
        //setBarco(barco);
    }
    

}
