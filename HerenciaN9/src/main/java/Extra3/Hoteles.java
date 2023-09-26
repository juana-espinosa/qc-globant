/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra3;

/**
 *
 * @author juana
 */
public abstract class Hoteles extends Alojamiento {

    protected int cantidadDeHabitaciones;
    protected int numeroDeCamas;
    protected int cantidadDePisos;
    protected double precioHabitaciones;
    protected int cantEstrellas;

    public Hoteles(int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, int cantEstrellas, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        //this.precioHabitaciones = PrecioHabitacion();
        this.cantEstrellas = cantEstrellas;
    }

    public Hoteles(int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, int cantEstrellas) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
       // this.precioHabitaciones = precioHabitaciones;
        this.cantEstrellas = cantEstrellas;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(int cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public abstract int PrecioHabitacion();

}
