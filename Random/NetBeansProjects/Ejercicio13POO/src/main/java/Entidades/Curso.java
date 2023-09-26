/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Curso {

    public String nombreCurso;
    public int cantidadHorasPorDia;
    public int cantidadDiasPorSemana;
    public String turno;
    public double precioPorHora;
    String[] alumnos = new String[5];

//constructor por defecto
    public Curso() {
    }
//constructor con los parametros

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }
//get

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }
//set    

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
//metodo cargar alummnos

    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de su alumno numero: " + (i + 1));
            String nombre = scanner.next();
            this.alumnos[i] = nombre;          
        }
    }

    public void devolverAlumnos() {
        System.out.println("Los alumnos son: " + Arrays.toString(alumnos));
    }

    public void crearCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso: ");
        String curso = scanner.next();
        this.nombreCurso = curso;
        System.out.println("Ingrese la cantidad de horas del curso: ");
        int horas = scanner.nextInt();
        this.cantidadHorasPorDia = horas;
        System.out.println("Ingrese la cantidad de dias de la semana del curso: ");
        int dias = scanner.nextInt();
        this.cantidadDiasPorSemana = horas;
        System.out.println("Ingrese el turno del curso: ");
        String turnoo = scanner.next();
        this.turno = turnoo;
        System.out.println("Ingrese el precio por hora: ");
        int precio = scanner.nextInt();
        this.precioPorHora = precio;
        
        cargarAlumnos();
    }
    public void calcularGananciaSemanal() {
    double gananciaSemanal;
    
    gananciaSemanal = cantidadDiasPorSemana * precioPorHora * cantidadDiasPorSemana * 5;
    System.out.println("Su ganancia esta semana es de $ " +gananciaSemanal);
        
    }
    
    //Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    
}
