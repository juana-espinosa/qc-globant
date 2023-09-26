/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Persona {

    public String name;
    public Date fechaDeNacimiento;
    private int edad;
// constructor vacio

    public Persona() {
    }
// constructor parametrizado

    public Persona(String name, Date fechaDeNacimiento) {
        this.name = name;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
//get

    public String getName() {
        return name;
    }

    public Date getDate() {
        return fechaDeNacimiento;
    }
//set 

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
//Agregar un método de creación del objeto que respete la siguiente firma: crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.next();
        name = nombre;
        System.out.println("Ingrese su fecha de nacimiento:");
        String fechaComoTexto = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //intenta ejercutar el codigo de los primeros cositos
        try {
            fechaDeNacimiento = sdf.parse(fechaComoTexto);
            //captura cualquier excepcion
        } catch (Exception ex) {
            System.out.println("Fecha invalida");
        }
    }
//Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener en cuenta que para conocer la edad de la persona también se debe conocer la fecha actual.   
    public LocalDate convertToLocalDateViaInstant(Date fechaDeNacimiento) {
        return fechaDeNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public void calcularEdad(LocalDate fechaDeNacimiento) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaDeNacimiento, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
        edad = periodo.getYears();

    }
//Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra edad y retorna true en caso de que el receptor tenga menor edad que la persona que se recibe como parámetro, o false en caso contrario.      

    public boolean menorQue(int edad) {
        boolean validacion = false;
//el edad del if hace referencia al edad de la funcion
        if (edad > this.edad) {
          validacion = true;
          System.out.println("Sos menor que la otra persona");
        } else {System.out.println("Sos mayor que la otra persona");}
        return validacion;
        
        //podria hacerlo asi:
        //return this.edad < edad;
    }
//Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    public void mostrarPersona(){
    System.out.println("La persona " +name+ " tiene " +edad+ " años.");
    }
    
}
