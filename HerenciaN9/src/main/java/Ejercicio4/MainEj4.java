/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author juana
 */
public class MainEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c = new Circulo(5d);
        Rectangulo r = new Rectangulo(2d, 3d);
        
        System.out.println("Perimetro y area de las figuras:");
        System.out.println("Circulo:");
        System.out.println("Perimetro: " +c.calcularPerimetro());
        System.out.println("Area: " +c.calcularArea());
        System.out.println("---");
        System.out.println("Rectangulo:");
        System.out.println("Perimentro: " +r.calcularPerimetro());
        System.out.println("Area: "+ r.calcularArea());
    }
    
}
