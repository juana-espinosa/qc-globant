/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author juana
 */
public class Habitacion {
    int nroHab;
    LocalDate fechaOcupacion, fechaDesocupacion;
    int cantidadDePersonas;

    public Habitacion() {
    }

    public Habitacion(int nroHab, LocalDate fechaOcupacion, LocalDate fechaDesocupacion, int cantidadDePersonas) {
        this.nroHab = nroHab;
        this.fechaOcupacion = fechaOcupacion;
        this.cantidadDePersonas = cantidadDePersonas;
        this.fechaDesocupacion = fechaDesocupacion;
    }

    public int getNroHab() {
        return nroHab;
    }

    public void setNroHab(int nroHab) {
        this.nroHab = nroHab;
    }

    public LocalDate getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(LocalDate fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public LocalDate getFechaDesocupacion() {
        return fechaDesocupacion;
    }

    public void setFechaDesocupacion(LocalDate fechaDesocupacion) {
        this.fechaDesocupacion = fechaDesocupacion;
    }
    
}
