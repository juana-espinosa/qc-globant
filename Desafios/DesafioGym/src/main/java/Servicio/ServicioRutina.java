/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class ServicioRutina {

    ArrayList<Rutina> arraycitoRutinas;

    public ServicioRutina() {
        arraycitoRutinas = new ArrayList();
    }
    //crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.       

    public void crearRutina() {
        Rutina rutina = new Rutina();

        System.out.println("Ingrese el id de la rutina");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        rutina.setId(id);
        System.out.println("Ingrese el nombre de la rutina");
        String nombre = scanner.next();
        rutina.setNombre(nombre);
        System.out.println("Ingrese la duracion");
        String duracion = scanner.next();
        rutina.setDuracion(duracion);
        System.out.println("Ingrese el nivel de dificultad");
        Scanner scannerRut = new Scanner(System.in);
        int dificultad = scanner.nextInt();
        rutina.setNivelDificultad(dificultad);
        System.out.println("Ingrese la descripcion");
        String description = scannerRut.next();
        rutina.setDuracion(description);
        arraycitoRutinas.add(rutina);
    }
//obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.

    public ArrayList<Rutina> obtenerRutinas() {
        int rutinaNro = 1;
        for (Rutina rutina : arraycitoRutinas) {
             System.out.println("---------------------------------------------");
            System.out.println("La rutina numero: " + rutinaNro);
            System.out.println("Rutina: " + rutina.getNombre() + " ID: " + rutina.getId() + "Descripcion: " + rutina.getDescripcion() + " Dificultad: " + rutina.getNivelDificultad() + " Duracion: " + rutina.getDuracion());
            System.out.println("---------------------------------------------");
            rutinaNro++;
        }
        return arraycitoRutinas;
    }
//actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador de una rutina existen//te y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema. 

    public void actualizarRutina(String id, String nombre, String duracion, int nivelDificultad, String descripcion) {
        Scanner scanner = new Scanner(System.in);
        for (Rutina rutina : arraycitoRutinas) {
            if (rutina.getId().equals(id)) {
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDificultad(nivelDificultad);
                rutina.setDescripcion(descripcion);
            }
        }
    }
//eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.  En el método principal (main)
    public void eliminarRutina(String id) {
        Rutina rutinaBorrar = null;
        Scanner scanner = new Scanner(System.in);
        for (Rutina rutina : arraycitoRutinas) {
            if (rutina.getId().equals(id)) {
                rutinaBorrar = rutina;
                
            }
        }
        arraycitoRutinas.remove(rutinaBorrar);
    } 

}
