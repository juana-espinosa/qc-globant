/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author juana
 */

//Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad,
//descripcion
public class Rutina {
    String id;
    String nombre;
    String duracion;
    int nivelDificultad;
    String descripcion;
//gets
    public String getId() {
        return id;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
//sets
    public void setId(String id) {
        this.id = id;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
//constructor
    public Rutina(String id, String duracion, int nivelDificultad, String descripcion) {
        this.id = id;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Rutina() {
    }
    
    
}
