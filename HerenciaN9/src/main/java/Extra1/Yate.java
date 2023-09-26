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
public class Yate extends Barco{
    int potenciaYate;
    int cantCamarotes;
    Scanner read = new Scanner(System.in).useDelimiter("\n");


    public Yate(int potenciaYate, int cantCamarotes, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potenciaYate = potenciaYate;
        this.cantCamarotes = cantCamarotes;
    }

    public Yate(int potenciaYate, int cantCamarotes) {
        this.potenciaYate = potenciaYate;
        this.cantCamarotes = cantCamarotes;
    }

    public Yate() {
    }
    

    public int getPotenciaYate() {
        return potenciaYate;
    }

    public void setPotenciaYate(int potenciaYate) {
        this.potenciaYate = potenciaYate;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
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
    public void crearYate(){
    Yate yatecito = new Yate();
        System.out.println("Por favor, inserte el numero de camarotes del yate");
        yatecito.setCantCamarotes(read.nextInt());
        System.out.println("Por favor, inserte los metros de eslora");
        yatecito.setEslora(read.nextInt());
        System.out.println("Por favor, inserte la matricula");
        yatecito.setMatricula(read.next());
        System.out.println("Por favor, inserte el año");
        yatecito.setAnio(read.nextInt());   
        System.out.println("Por favor, inserte la potencia del yate");
        yatecito.setPotenciaYate(read.nextInt());
    }
    
}
