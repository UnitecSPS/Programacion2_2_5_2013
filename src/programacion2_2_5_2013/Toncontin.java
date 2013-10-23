/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_2_5_2013;

import Herencia.PrimeraClase;

/**
 *
 * @author Docente 17082011
 */
public class Toncontin {
    public static void main(String[] args) {
        //PrimeraClase pc = new PrimeraClase(2,"Denis");
        Chancleta pc = new Chancleta();
        //pc.asiento = 'A';
        //pc.fila = 3;
        pc.chicle = 2;
        pc.imprimir();
        System.out.println("precio: " + pc.getPrecio());
    }
}
