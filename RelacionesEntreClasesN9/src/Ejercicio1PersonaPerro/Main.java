/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juana
 */
public class Main {

    public static void main(String[] args) {
        ArrayList personas = new ArrayList();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Perro perritos = new Perro();
        //definir scanner
        Scanner leer = new Scanner(System.in);

        //public void crearPersona(){
        System.out.println("Por favor, ingrese el nombre de la primer persona");
        persona1.setNombre(leer.next());
        System.out.println("Por favor, ingrese el apellido de la primer persona");
        persona1.setApellido(leer.next());
        System.out.println("Por favor, ingrese la edad de la primer persona");
        persona1.setEdad(leer.nextInt());
        System.out.println("Por favor, ingrese el documento de la primer persona");
        persona1.setDocumento(leer.nextInt());
        Perro perri = perritos.crearPerro();
        persona1.setPerrito(perri);
        System.out.println("Por favor, ingrese el nombre de la segunda persona");
        persona2.setNombre(leer.next());
        System.out.println("Por favor, ingrese el apellido de la segunda persona");
        persona2.setApellido(leer.next());
        System.out.println("Por favor, ingrese la edad de la segunda persona");
        persona2.setEdad(leer.nextInt());
        System.out.println("Por favor, ingrese el documento de la segunda persona");
        persona2.setDocumento(leer.nextInt());
        Perro perri2 = perritos.crearPerro();
        persona2.setPerrito(perri2);
        personas.add(persona1);
        personas.add(persona2);
        // }
//imprimir
        System.out.println("La persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Documento: " + persona1.getDocumento());
        System.out.println("Perrito: " + persona1.getPerrito().getNombre() + "Raza " + persona1.getPerrito().getRaza() );
        System.out.println("Tamano: " + persona1.getPerrito().getTamano() + "Edad " + persona1.getPerrito().getEdad() );

        System.out.println("La persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Documento: " + persona2.getDocumento());
       System.out.println("Perrito: " + persona2.getPerrito().getNombre() + "Raza " + persona2.getPerrito().getRaza() );
        System.out.println("Tamano: " + persona2.getPerrito().getTamano() + "Edad " + persona2.getPerrito().getEdad() );
    }
}
