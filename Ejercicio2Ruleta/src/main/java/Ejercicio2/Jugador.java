/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
/**
 *
 * @author juana
 */
public class Jugador {
    int Id =1;
    String nombre = ("Jugador " + Id);
    boolean mojado = false;
    int cantidad = 1;

    public Jugador(String par) {
    }
     public Jugador(int ID, String nombre, boolean mojado, int cantidad) {
         this.Id = Id;
         this.mojado = mojado;
         this.nombre = nombre;
         this.cantidad = cantidad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
    public boolean disparo(revolverDeAgua revolver){
        
    boolean mojarr = revolver.mojar();
    revolver.siguienteChorro();
    
    if(mojarr==true){
    mojado = true;
    System.out.println("El jugador esta mojado? " + mojado);
    }else {System.out.println("El jugador esta mojado? " + mojado);}
            
            return mojado;
    }
}
