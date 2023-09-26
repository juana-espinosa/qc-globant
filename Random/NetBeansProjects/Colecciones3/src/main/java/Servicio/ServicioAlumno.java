/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioAlumno {

    ArrayList<Alumno> arraycitoAlumnos;

    public ServicioAlumno() {
        arraycitoAlumnos = new ArrayList();
    }

    public void RegistrarAlumnos() {
        boolean validador = true;
        do {
            System.out.println("Ingrese 1 si quieres agregar un alumno, o 2 si quieres agregar notas, 3 si quieres salir");
            Scanner readINT = new Scanner(System.in);
            int option = readINT.nextInt();
            switch (option) {
                case 1 -> {
                    Alumno alumnito = new Alumno();
                    System.out.println("Ingrese el nombre del alumno");
                    Scanner readString = new Scanner(System.in);
                    String nombrecito = readString.next();
                    alumnito.setNombre(nombrecito);
                    arraycitoAlumnos.add(alumnito);
                }
                case 2 -> {
                    agregarNotas();
                }
                case 3 -> {
                    validador = false;
                }

            }
        } while (validador);
    }

    public void mostrarAlumnos() {
        int alumnoNro = 1;
        for (Alumno alumnos : arraycitoAlumnos) {
            System.out.println("---------------------------------------------");
            System.out.println("El alumno numero: " + alumnoNro + " Nombre: " + alumnos.getNombre());
            System.out.println();
            System.out.println("---------------------------------------------");
            alumnoNro++;
        }
    }

    public void agregarNotas() {
        System.out.println("Ingrese el nombre del alumno");
        Scanner readString = new Scanner(System.in);
        String alumnoABuscar = readString.next();
        Iterator<Alumno> iterator = arraycitoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumnoActual = iterator.next();
            if (alumnoActual.getNombre().equals(alumnoABuscar)) {
                System.out.println("El alumno " + alumnoActual.getNombre());
                System.out.println("Ingrese la nota 1 del alumno");
                Scanner readINT = new Scanner(System.in);
                int nota1 = readINT.nextInt();
                //alumnos.agregarNota(nota1);
                System.out.println("Ingrese la nota 2 del alumno");
                int nota2 = readINT.nextInt();
                //alumnos.agregarNota(nota2);
                System.out.println("Ingrese la nota 3 del alumno");
                int nota3 = readINT.nextInt();
                alumnoActual.agregarNota(nota1, nota2, nota3);
                //alumnos.sumarNotas();  
                return;
            }

        }
    } 

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno");
        Scanner readString = new Scanner(System.in);
        String alumnoABuscar = readString.next();
        //for (Alumno alumnos : arraycitoAlumnos) {  
        //iterator para poder sacar el alumno igual
        Iterator<Alumno> iterator = arraycitoAlumnos.iterator();
        while (iterator.hasNext()) {
            Alumno alumnoActual = iterator.next();
            if (alumnoActual.getNombre().equals(alumnoABuscar)) {
                alumnoActual.sumarNotas();
                return;
            }
            //  }
        }
    }
}

