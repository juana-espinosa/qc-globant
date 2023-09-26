/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra3;

/**
 *
 * @author juana
 */
public class Hoteles4Estrellas extends Hoteles {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;


    public Hoteles4Estrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadDeHabitaciones, int numeroDeCamas, int cantidadDePisos, int cantEstrellas, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadDeHabitaciones, numeroDeCamas, cantidadDePisos, cantEstrellas, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
    

    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
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

    @Override
    public int PrecioHabitacion() {
        int valorAgrGym;
        int valorAgrRest;
       
        //para darle valor agregado por gimnasio
        if (gimnasio.equals("A")) {
            valorAgrGym = 50;
        } else {
            valorAgrGym = 30;
        }
        // para darle valor al restaurate
        if (capacidadRestaurante < 30) {
            valorAgrRest = 10;
        } else if (capacidadRestaurante > 50) {
            valorAgrRest = 50;
        } else {
            valorAgrRest = 30;
        }
        
        double precioHabitacion = 50 + (cantidadDeHabitaciones*numeroDeCamas*cantidadDePisos) + valorAgrRest +valorAgrGym;
        int value = (int)precioHabitacion;

        return value;
    }

}
