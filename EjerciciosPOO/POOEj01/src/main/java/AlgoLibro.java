
import Entidad.Libro;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author juana
 */
public class AlgoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ISBN;
        String titulo;
        String autor;
        int paginas;
        

        System.out.println("Ingrese los datos del libro en el siguiente orden:");
        Scanner readText = new Scanner(System.in);
        Scanner readNumbers = new Scanner(System.in);
        System.out.println("ISBN");
        ISBN = readNumbers.nextDouble();
        System.out.println("El título");
        titulo = readText.nextLine();
        System.out.println("El autor");
        autor = readText.nextLine();
        System.out.println("Numero de paginas");
        paginas = readNumbers.nextInt();
        
       Libro librito = new Libro(ISBN, titulo, autor, paginas);
             Libro librito2 = new Libro(ISBN, "aaaaaaaaaaaaaa", autor, paginas);

             librito.mostrarInfo();
       librito2.mostrarInfo();
        
    }

}
