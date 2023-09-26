/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiojarvisexcepciones;

import Entidades.Armadura;
import Entidades.Enemigos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author juana
 */
public class DesafioJarvisExcepciones {

    public static void main(String[] args) {
        Armadura ironMan = new Armadura("Rojo", "Oro", 90);
    
    // Simulación de acciones
    ironMan.caminar(10);
    ironMan.correr(5);
    ironMan.volar(15);
    ironMan.usarGuantesComoArmas(3);
    ironMan.escribirEnConsola(2);
    ironMan.hablarEnSintetizador(1);
    
      // Mostrar estado y otras funcionalidades
//    ironMan.mostrarEstado();;
//    ironMan.mostrarEstadoBateria();
//    ironMan.mostrarInformacionReactor();
//    ironMan.revisarDispositivos();
//    ironMan.repararDispositivos();
//    ironMan.revisarDispositivosInsistentemente();
//    
//    // Simulación del radar
//    ironMan.simularRadar();
//    ironMan.dispararEnemigos();
//    
//        // Acciones evasivas
//    ironMan.accionesEvasivas();
    
        // Ejemplo de uso
    //Armadura ironMan = new Armadura("Rojo", "Oro", 90);
    List<Enemigos> enemigos = new ArrayList<>();

    // Agregar enemigos aleatorios para la prueba
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
        double x = random.nextDouble() * 100; // Coordenada X aleatoria
        double y = random.nextDouble() * 100; // Coordenada Y aleatoria
        double z = random.nextDouble() * 100; // Coordenada Z aleatoria
        enemigos.add(new Enemigos(x, y, z));
    }

    // Calcular y mostrar distancias
   // ironMan.calcularDistanciaEnemigos(enemigos);
    
    }
}
