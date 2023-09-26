/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extra2;

import java.util.ArrayList;

/**
 *
 * @author juana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo(10d,10d,10d, "Moron", "Techado"));
        edificios.add(new Polideportivo(50d,10d,50d, "River", "Abierto"));
        edificios.add(new EdificioDeOficina(10d,10d,10d,5,10,2));
        edificios.add(new EdificioDeOficina(100d,20d,50d,10,10,10));

        int contTechado = 0;
        int contAbierto = 0;

        for (Edificio aux: edificios) {
            System.out.println("Superficie: "+aux.calcularSuperficie()+ " m2");
            System.out.println("Volumen: "+aux.calcularVolumen()+ " m3");
            if(aux instanceof EdificioDeOficina)
                System.out.println("Cant de personas max: "+((EdificioDeOficina) aux).cantPersonas());
            else {
                if(((Polideportivo)aux).getTipoDeInstalacion().equals("Techado"))
                    contTechado++;
                else
                    contAbierto++;
            }
            System.out.println("-----");
        }
        System.out.println("Polideportivos techados: " + contTechado);
        System.out.println("Polideportivos abiertos: " + contAbierto);
        
// TODO code application logic here
    }
    
}
