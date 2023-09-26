/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidade.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioCantante {
    Scanner readString = new Scanner(System.in);
    Scanner readString2 = new Scanner(System.in);

    ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

    public void agregarAlgunos() {
        //agrego unos paises pues paja
        listaCantantes.add(new CantanteFamoso("Rihanna", "Diamonds"));
        listaCantantes.add(new CantanteFamoso("Adelle", "30"));
        listaCantantes.add(new CantanteFamoso("Cuarteto de Nos", "Raro"));
        listaCantantes.add(new CantanteFamoso("Arctic Monkeys", "AM"));
        listaCantantes.add(new CantanteFamoso("Imagine Dragons", "Mercury"));
    }

    public void agregarPorUser() {
        CantanteFamoso cantante = new CantanteFamoso();
        System.out.println("Ingrese el nombre");    
        String nombreC = readString.next();
        cantante.setNombre(nombreC);
        System.out.println("Ingrese el disco con mas ventas");
        String disquito = readString2.next();
        cantante.setDiscoConMasVentas(disquito);
        listaCantantes.add(cantante);
    }
    public void mostrarCantantes(){
    int cantanteNro = 1;
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println("---------------------------------------------");
            System.out.println("El pais numero: " + cantanteNro);
            System.out.println(" Nombre: " + cantante.getNombre());
            System.out.println("El disco mas vendido es: " + cantante.getDiscoConMasVentas());
            System.out.println();
            System.out.println("---------------------------------------------");
            cantanteNro++;
        }
    }
    public void removerCantante(){
    Iterator<CantanteFamoso> iterator = listaCantantes.iterator();
        while (iterator.hasNext()) {
            CantanteFamoso cantanteActual = iterator.next();
            if (cantanteActual.getNombre().equals(listaCantantes)) {
                iterator.remove();
                System.out.println("El cantante fue eliminado.");
                return; 
            }
        }
        System.out.println("Este cantante no es parte de la lista.");
    }

}
