/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author juana
 */
public class MainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        revolverDeAgua ruleta = new revolverDeAgua();
        ruleta.llenarRevolver();
        ruleta.mojar();
        ruleta.siguienteChorro();
        ruleta.toString();
        String boludez = "PAJA";
        Jugador juga = new Jugador(boludez);
        juga.disparo(ruleta);
        Juego jueguito = new Juego();
        jueguito.llenarJuego(ruleta);
        jueguito.ronda();
        
//          public static void main(String[] args) {
//        revolverDeAgua revolver = new revolverDeAgua();
//        Juego juego = new Juego();
//        juego.llenarJuego(revolver);
//        juego.ronda();
    }
        
       
    }
    


