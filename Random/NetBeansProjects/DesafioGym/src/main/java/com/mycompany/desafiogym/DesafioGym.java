/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.desafiogym;

import Entidad.Cliente;
import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class DesafioGym {

//Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
//clases y metodos;
//Crea una clase ServicioCliente y una clase ServicioRutina   
    public static void main(String[] args) {
        ServicioCliente registros = new ServicioCliente();
        ServicioRutina registrosRut = new ServicioRutina();
        boolean menu = true;

        //menu
        System.out.println("Ingrese 1 si quiere registrar un cliente");
        System.out.println("Ingrese 2 si quiere ver sus clientes actuales");
        System.out.println("Ingrese 3 si quiere actualizar datos de sus clientes actuales");
        System.out.println("Ingrese 4 si quiere remover alguno de sus clientes actuales");
        System.out.println("Ingrese 5 para agregar una rutina");
        System.out.println("Ingrese 6 si quiere actualizar datos de sus rutinas actuales");
        System.out.println("Ingrese 7 si quiere remover alguna de sus rutinas actuales");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (menu) {
            switch (option) {
                case 1 -> {
                    System.out.println("A continuación te pediremos unos datos");
                    registros.registrarCliente();
                }
                case 2 -> {
                    System.out.println("Te mostraremos los clientes ingresados");
                    registros.obtenerClientes();
                }
                case 3 -> {
                    System.out.println("Te pediremos algunos datos para una correcta actualizacion");
                    System.out.println("Ingrese el id del cliente");
                    String idABuscar = scanner.next();
                    System.out.println("Ingrese el nuevo nombre del cliente");
                    String nuevoNombre = scanner.next();
                    System.out.println("Ingrese la nueva edad del cliente");
                    int nuevaEdad = scanner.nextInt();
                    System.out.println("Ingrese la nueva altura del cliente");
                    double nuevaAltura = scanner.nextDouble();
                    System.out.println("Ingrese el nuevo peso del cliente");
                    double nuevoPeso = scanner.nextDouble();
                    System.out.println("Ingrese el nuevo objetivo del cliente");
                    String nuevoObjetivo = scanner.next();
                    registros.actualizarCliente(idABuscar, nuevoNombre, nuevaEdad, nuevaAltura, nuevoPeso, nuevoObjetivo);
                }
                case 4 -> {
                    System.out.println("Te pediremos algunos datos para una correcta eliminacion");
                    System.out.println("Ingrese el id del cliente");
                    String idABuscar = scanner.next();
                    registros.eliminarCliente(idABuscar);
                }
                case 5 -> {
                    System.out.println("A continuación te pediremos unos datos");
                    registrosRut.crearRutina();
                }
                case 6 -> {
                    System.out.println("Te pediremos algunos datos para una correcta actualizacion");
                    System.out.println("Ingrese el id de la rutina");
                    String idABuscar = scanner.next();
                    System.out.println("Ingrese el nuevo nombre de la rutina");
                    String nuevoNombre = scanner.next();
                    System.out.println("Ingrese la nueva duracion de la rutina");
                    String nuevaDuracion = scanner.next();
                    System.out.println("Ingrese el nuevo nivel de dificultad");
                    int nuevoNivelDificultad = scanner.nextInt();
                    System.out.println("Ingrese la nueva descripcion");
                    Scanner scanner2 = new Scanner(System.in);
                    String nuevaDescrip = scanner2.next();
                    registrosRut.actualizarRutina(idABuscar, nuevoNombre, nuevaDuracion, nuevoNivelDificultad, nuevaDescrip);
                }
                case 7 -> {
                    System.out.println("Ingrese el id de la rutina");
                    String idABuscar = scanner.next();
                    registrosRut.eliminarRutina(idABuscar);
                }
                case 8 -> {
                registrosRut.obtenerRutinas();
                }
                default ->
                    System.out.println("Opción no válida");
            }

            System.out.println("Ingrese 1 si quiere registrar un cliente");
            System.out.println("Ingrese 2 si quiere ver sus clientes actuales");
            System.out.println("Ingrese 3 si quiere actualizar datos de sus clientes actuales");
            System.out.println("Ingrese 4 si quiere remover alguno de sus clientes actuales");
            System.out.println("Ingrese 5 para agregar una rutina");
            System.out.println("Ingrese 6 si quiere actualizar datos de sus rutinas actuales");
            System.out.println("Ingrese 7 si quiere remover alguna de sus rutinas actuales");
            System.out.println("Ingrese 8 si quiere ver sus rutinas actuales");
            System.out.println("Digite 23 si quieres salir del menu");
            option = scanner.nextInt();
            if (option == 23) {
                System.out.println("Gracias por ser parte del JuaGym");
                menu = false;
            }

        }

    }
}
