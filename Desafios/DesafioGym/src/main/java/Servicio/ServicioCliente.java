/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioCliente {

    //registrarCliente: lo registra en el sistema. 
    ArrayList<Cliente> arraycitoClientes;

    public ServicioCliente() {
        arraycitoClientes = new ArrayList();
    }

    public void registrarCliente() {
        Cliente cliente = new Cliente();

        System.out.println("Ingrese el nombre del cliente");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        cliente.setNombre(nombre);
        System.out.println("Ingrese su ID");
        String id = scanner.next();
        cliente.setId(id);
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        cliente.setEdad(edad);
        System.out.println("Ingrese su altura");
        double altura = scanner.nextDouble();
        cliente.setAltura(altura);
        System.out.println("Ingrese su peso");
        double peso = scanner.nextDouble();
        cliente.setPeso(peso);
        System.out.println("Ingrese su objetivo");
        String objetivo = scanner.next();
        cliente.setObjetivo(objetivo);
        arraycitoClientes.add(cliente);
    }
//obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.

    public ArrayList<Cliente> obtenerClientes() {
        int clienteNro = 1;
        for (Cliente cliente : arraycitoClientes) {
             System.out.println("---------------------------------------------");
            System.out.println("El cliente numero: " + clienteNro);
           
            System.out.println("Nombre: " + cliente.getNombre() + " ID: " + cliente.getId() + " Edad: " + cliente.getEdad() + " Altura: " + cliente.getAltura() + " Peso: " + cliente.getPeso());
            System.out.println();
            System.out.println("Objetivo: " + cliente.getObjetivo());
             System.out.println("---------------------------------------------");

            clienteNro++;
        }
        return arraycitoClientes;
    }
//actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.

    public void actualizarCliente(String id, String nombre, int edad, double altura, double peso, String objetivo) {
        int tamano = (arraycitoClientes.size());
        Scanner scanner = new Scanner(System.in);
        for (Cliente cliente : arraycitoClientes) {
            if (cliente.getId().equals(id)) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
            }
        }
    }

    //eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
    public void eliminarCliente(String id) {
        Scanner scanner = new Scanner(System.in);
        Cliente clientABorrar = null;
        for (Cliente cliente : arraycitoClientes) {
            if (cliente.getId().equals(id)) {
                clientABorrar = cliente;
            }
        }
        if (clientABorrar != null) {
            arraycitoClientes.remove(clientABorrar);
        }
    }
}
