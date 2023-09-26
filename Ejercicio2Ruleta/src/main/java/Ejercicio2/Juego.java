/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author juana
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private revolverDeAgua revolver;

    public void llenarJuego(revolverDeAgua revolver) {
        this.jugadores = new ArrayList<Jugador>();
        this.revolver = revolver;

        // Crear 5 jugadores y agregarlos a la lista
        for (int i = 1; i <= 5; i++) {
            Jugador jugador = new Jugador("Jugador " + i);
            jugadores.add(jugador);
        }
    }

    public void ronda() {
        if (jugadores == null || jugadores.isEmpty() || revolver == null) {
            System.out.println("El juego no está configurado correctamente.");
            return;
        }

        boolean alguienSeMojó = false;
        int jugadorMojado = -1;

        while (!alguienSeMojó) {
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugadorActual = jugadores.get(i);
                System.out.println("Turno del jugador " + jugadorActual.getNombre() + ":");

                boolean mojado = jugadorActual.disparo(revolver);
                if (mojado) {
                    alguienSeMojó = true;
                    jugadorMojado = i;
                    break; // Terminamos el juego si alguien se moja
                }
            }
        }

        System.out.println("¡El jugador " + jugadores.get(jugadorMojado).getNombre() + " se mojó!");
    }

}

