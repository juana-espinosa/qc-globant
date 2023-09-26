/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author juana
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private float generador;
    private float bateria;
    private boolean[] dispositivosDanados = new boolean[4]; // Botas, guantes, consola, sintetizador
    private Random random = new Random();

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = 100; // Inicialmente, la salud está al máximo
        this.generador = Float.MAX_VALUE; // Carga máxima del generador
        this.bateria = Float.MAX_VALUE; // Carga máxima de la batería
        // Inicialmente, ningún dispositivo está dañado
        for (int i = 0; i < dispositivosDanados.length; i++) {
            dispositivosDanados[i] = false;
        }
    }

    public void caminar(int tiempo) {
        int consumo = tiempo; // Consumo básico
        if (dispositivosDanados[0]) {
            consumo *= 2; // Si las botas están dañadas, consumo doble
        }
        consumirEnergia(consumo);
    }

    public void correr(int tiempo) {
        int consumo = tiempo * 2; // Consumo normal de las botas
        if (dispositivosDanados[0]) {
            consumo *= 2; // Si las botas están dañadas, consumo doble
        }
        consumirEnergia(consumo);
    }

    public void propulsar(int tiempo) {
        int consumo = tiempo * 3; // Consumo intensivo de las botas
        consumirEnergia(consumo);
    }

    public void volar(int tiempo) {
        int consumoBotas = tiempo * 3; // Consumo intensivo de las botas
        int consumoGuantes = tiempo * 2; // Consumo normal de los guantes
        consumirEnergia(consumoBotas + consumoGuantes);
    }

    public void usarGuantesComoArmas(int tiempo) {
        int consumo = tiempo * 3; // Consumo triple durante el tiempo del disparo
        consumirEnergia(consumo);
    }

    public void escribirEnConsola(int tiempo) {
        int consumo = tiempo; // Consumo básico de la consola
        consumirEnergia(consumo);
    }

    public void hablarEnSintetizador(int tiempo) {
        int consumo = tiempo; // Consumo básico del sintetizador
        consumirEnergia(consumo);
    }

    private void consumirEnergia(int consumo) {
        if (consumo <= bateria) {
            bateria -= consumo;
        } else {
            bateria = 0;
        }
    }

//       public void dispararEnemigos(List<Enemigos> enemigos) {
//        Iterator<Enemigos> iter = enemigos.iterator();
//        while (iter.hasNext()) {
//            Enemigos enemigo = iter.next();
//            if (calcularDistancia(enemigo) <= 5000 && !enemigo.estaDestruido()) {
//                // Atacar al enemigo si está dentro del alcance y no está destruido
//                int potenciaAtaque = calcularPotenciaAtaque(enemigo);
//                enemigo.recibirAtaque(potenciaAtaque);
//                System.out.println("¡Atacando al enemigo en (" + enemigo.getCoordX() + ", " +
//                                   enemigo.getCoordY() + ", " + enemigo.getCoordZ() + ") " +
//                                   "con potencia de " + potenciaAtaque);
//                if (enemigo.estaDestruido()) {
//                    System.out.println("¡Enemigo destruido!");
//                    iter.remove(); // Eliminar el enemigo de la lista si está destruido
//                }
//            }
//        }
//    }
       
       

    // Otros métodos y funcionalidades según el enunciado

    
}
