/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class Rectángulo {

    private int base;
    private int altura;

    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Holis, escriba la base ");
        int basecita = scanner.nextInt();
        base = basecita;
        System.out.println("Holis, escriba la altura ");
        int alturita = scanner.nextInt();
        altura = alturita;
    }

    public void calcularSuperficie() {
        int superficie = base * altura;
        System.out.println("La superficie es " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        System.out.println("El perimetro es " + perimetro);
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == 0 || i == base - 1 || j == 0 || j == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
