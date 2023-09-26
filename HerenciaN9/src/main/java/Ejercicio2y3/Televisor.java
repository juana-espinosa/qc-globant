/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2y3;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Televisor  extends Electrodomestico{
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 0;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Double precio, Integer peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        
        System.out.println("Creando televisor: ");
        super.crearElectrodomestico();
        System.out.println("Resolucion: ");
        this.resolucion = leer.nextInt();
        System.out.println("Sintonizador TDT (s/n): ");
        Character res = leer.next().charAt(0);
        if(res.equals('s'))
            this.sintonizadorTDT = true;
    
    }
    @Override
    public Double precioFinal(){
        Double precioFinal = super.precioFinal();
        if(this.resolucion > 40)
            precioFinal += precioFinal * 0.3;
        if(this.sintonizadorTDT == true)
            precioFinal += 500d;
        
        this.precio = precioFinal;
        
        return precioFinal;
    }
    
    public void mostrarTelevisor(){
       System.out.println("Televisor: ");
       System.out.println("Resolucion: " + this.resolucion);
       System.out.println("Sintonizador TDT: " + this.sintonizadorTDT);
       System.out.println("Peso: " + this.peso);
       System.out.println("Color: " + this.color);
       System.out.println("Precio: " + this.precio);
       System.out.println("Consumo energetico: " + this.consumoEnergetico);
    }
    
}
