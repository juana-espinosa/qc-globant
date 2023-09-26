/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Habitacion;
import Entidades.Persona;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Reserva {
    int ID;
    HashMap <Integer, Habitacion> reservas = new HashMap();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarReservas(){
    
    }
    
    public void datosPersona(){
    Persona persona = new Persona();    
    System.out.println("Hola! Ingrese su nombre");
    persona.setNombre(read.next());
    System.out.println("Ingrese su edad");
    persona.setEdad(read.nextInt());
    System.out.println("Ingrese su DNI");
    persona.setDNI(read.nextInt());
    System.out.println("Ingrese su pais");
    persona.setPais(read.next());    
    }
    
    public void datosHab(){
    Habitacion cuarto = new Habitacion();
    System.out.println("Hola! Ingrese la numero de habitacion");
    cuarto.setNroHab(read.nextInt());
    System.out.println("Hola! Ingrese la fecha con formado AÑO/MES/DIA");
    String fecha = read.next();
    String anio = fecha.substring(0, 4);
    String mes = fecha.substring(5, 7);
    String dia = fecha.substring(8, 10);
    
    
    }
    
    public void Alojamiento(){
    HashMap <Integer, String> listaReserva = new HashMap();
    
    
    }
    
}
