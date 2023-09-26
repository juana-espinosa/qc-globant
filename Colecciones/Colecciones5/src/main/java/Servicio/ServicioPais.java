/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioPais {

    HashSet<Pais> paises;

    public ServicioPais() {
        this.paises = new HashSet();
    }

    public void agregarAlgunos() {
        //agrego unos paises pues paja
        paises.add(new Pais("España"));
        paises.add(new Pais("Francia"));
        paises.add(new Pais("Italia"));
    }

    //metodo para agregar paises
    public void registrarNuevoPais() {
        Pais pais = new Pais();

        System.out.println("Ingrese el nombre del pais");
        Scanner scanner = new Scanner(System.in);
        String nombrePais = scanner.next();
        pais.setNombre(nombrePais);
        paises.add(pais);
    }

    public HashSet<Pais> mostrarPaises() {
        int paisNro = 1;
        for (Pais paisito : paises) {
            System.out.println("---------------------------------------------");
            System.out.println("El pais numero: " + paisNro + " Nombre: " + paisito.getNombre());
            System.out.println();
            System.out.println("---------------------------------------------");

            paisNro++;
        }
        return paises;
    }

    public void ordenarPaises() {

        ArrayList<Pais> paisesOrdenados = new ArrayList(paises);
        //usar el comparator
        Comparator<Pais> comparadorPorNombre = Comparator.comparing(Pais::getNombre);
        Collections.sort(paisesOrdenados, comparadorPorNombre);

        for (Pais paisito : paisesOrdenados) {
            System.out.println(paisito.getNombre());
        }
    }

    public void removerPais(String pais) {
        Iterator<Pais> iterator = paises.iterator();
        while (iterator.hasNext()) {
            Pais paisActual = iterator.next();
            if (paisActual.getNombre().equals(pais)) {
                iterator.remove();
                System.out.println("El país fue eliminado.");
                return; 
            }
        }
        System.out.println("Este país no es parte de la lista.");
    }

}

