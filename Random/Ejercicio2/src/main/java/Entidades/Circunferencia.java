/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Circunferencia {

    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float variable) {
        this.radio = variable;
    }
//constructor vacio para crear objetos afuera
    public Circunferencia() {
    }
    
    public void crearCircunferencia(){
     Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        float nuevoRadio = scanner.nextFloat();
        scanner.nextLine(); // Consumir el salto de línea
        radio = nuevoRadio;
        //return new crearCircunferencia(nuevoRadio);
    }
    public void calcularArea() {
        float Area = (float)Math.PI * (radio*radio);
        System.out.print("El area es " +Area);
    }
    
    public void calcularPerimetro() {
    float Perimetro = 2 * (float) Math.PI * radio;
    System.out.print("El area es " +Perimetro);
    }
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
    
}
