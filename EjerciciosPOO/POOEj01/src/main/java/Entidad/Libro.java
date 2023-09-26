/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author juana
 */
public class Libro {

    public double ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro(double ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    public Libro() {
    }

    public void mostrarInfo() {
        System.out.println("El ISBN es " +ISBN+ " el titulo es " +Titulo+ " el Autor es " +Autor+ " y el numero de paginas es " +NumeroDePaginas);
    }

}
