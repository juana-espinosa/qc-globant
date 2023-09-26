/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciones3;

import Servicio.ServicioAlumno;
import Entidades.Alumno;

/**
 *
 * @author juana
 */
public class Colecciones3 {

    public static void main(String[] args) {
        ServicioAlumno alumnos = new ServicioAlumno();
        
        alumnos.RegistrarAlumnos();
        alumnos.mostrarAlumnos();
        alumnos.notaFinal();
       // alumnos.agregarNotas();
    }
}
