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
public class Veleros extends Barco {
    int nroMastiles;
    Scanner read = new Scanner(System.in).useDelimiter("\n");
//constructores
    public Veleros(String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
    }

    public Veleros() {
    }
//get y set
    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
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
    
 //metodo para crear velero, solicitando los datos que vayan   
    public void crearVelero(){
    Veleros velerito = new Veleros();
   //. int mastiles=0;
   // int eslora=0;
   // int matricula
        System.out.println("Por favor, inserte el numero de mastiles del velero");
        velerito.setNroMastiles(read.nextInt());
        System.out.println("Por favor, inserte los metros de eslora");
        velerito.setEslora(read.nextInt());
        System.out.println("Por favor, inserte la matricula");
        velerito.setMatricula(read.next());
        System.out.println("Por favor, inserte el año");
        velerito.setAnio(read.nextInt());   
    }
    
}
