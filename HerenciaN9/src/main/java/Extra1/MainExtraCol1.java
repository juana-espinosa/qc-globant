/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extra1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juana
 */
public class MainExtraCol1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Barco> barcos = new ArrayList();
        //barcos.add(new Veleros(1, 123, 20, 1999));
        barcos.add(new barcoAMotor(1000, "AAA24", 100, 2022));
        barcos.add(new Yate(20, 500, "AAA45", 40, 2001));

        //Yate yatecito = new Yate();
        //yatecito.crearYate();
        Alquiler alquileresJuju = new Alquiler();
        alquileresJuju.alquilar(barcos);
        //alquileresJuju.calcularFechas();
        alquileresJuju.calcularFechas(barcos);

        //calculoEslora();
    }

}
