/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author juana
 */
public class Alumno {

    String nombre;
    ArrayList<Integer> arraycitoNotas;
//constructores

    public Alumno(String nombre, ArrayList<Integer> arraycitoNotas) {
        this.nombre = nombre;
        this.arraycitoNotas = arraycitoNotas;
    }

    public Alumno() {
        arraycitoNotas = new ArrayList();
    }

//gets
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getArraycitoNotas() {
        return arraycitoNotas;
    }
//sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArraycitoNotas(ArrayList<Integer> arraycitoNotas) {
        this.arraycitoNotas = arraycitoNotas;
    }

    public void agregarNota(int nota1, int nota2, int nota3) {
        arraycitoNotas.add(nota1);
        arraycitoNotas.add(nota2);
        arraycitoNotas.add(nota3);
    }

    public void sumarNotas() {
        //int variablecita = 0;
        int promedio = 0;
        for (Integer notas : arraycitoNotas) {
        promedio = promedio + notas;
        }
        promedio = promedio / 3;
        System.out.println(promedio);
    }

}
