/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extra1;

import java.util.Scanner;

/**
 *
 * @author juana
 */
public class barcoAMotor extends Barco {

    int potencia;
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public barcoAMotor(int potencia, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public barcoAMotor(int potencia) {
        this.potencia = potencia;
    }

    public barcoAMotor() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void crearBarcoAMotor() {
        barcoAMotor barquito = new barcoAMotor();
        System.out.println("Por favor, inserte la potencia del barco");
        barquito.setPotencia(read.nextInt());
        System.out.println("Por favor, inserte los metros de eslora");
        barquito.setEslora(read.nextInt());
        System.out.println("Por favor, inserte la matricula");
        barquito.setMatricula(read.next());
        System.out.println("Por favor, inserte el año");
        barquito.setAnio(read.nextInt());
    }
}
