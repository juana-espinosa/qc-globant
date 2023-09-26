/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class MainExtra1RC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList personas = new ArrayList();
        Perro perrito1 = new Perro("Hulk", 5, "Golden", "Medio");
        Persona persona1 = new Persona("Juani", "Espinosa", 23, 3204, perrito1);
        Perro perrito2 = new Perro("Blanquita", 9, "Labrador", "Medio");
        Persona persona2 = new Persona("Nikolai", "Jolodkow", 25, 2332, perrito2);
        //agregar al array
        personas.add(persona1);
        personas.add(persona2);
        
        //definir scanner
        Scanner leer = new Scanner(System.in);


        // }
//imprimir
        System.out.println("La persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Documento: " + persona1.getDocumento());
        System.out.println("Perrito: " + persona1.getPerrito().getNombre() + "Raza " + persona1.getPerrito().getRaza() );
        System.out.println("Tamano: " + persona1.getPerrito().getTamano() + " Edad " + persona1.getPerrito().getEdad() );

        System.out.println("La persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Documento: " + persona2.getDocumento());
       System.out.println("Perrito: " + persona2.getPerrito().getNombre() + " Raza " + persona2.getPerrito().getRaza() );
        System.out.println("Tamano: " + persona2.getPerrito().getTamano() + " Edad " + persona2.getPerrito().getEdad() );
    }
}
    
    

