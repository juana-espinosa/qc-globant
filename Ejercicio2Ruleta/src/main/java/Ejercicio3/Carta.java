/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author juana
 */
public class Carta {
     private Integer numero;
    private String palo;

    public Carta() {
    }
/*
    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
*/
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "{ " + "Numero: " + numero + " - Palo: " + palo + " }\n";
    }
    
}
