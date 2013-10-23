/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 */
public class Aeropuerto {
    public static void main(String[] args) {
        PrimeraClase pc = new PrimeraClase(2,"Denis");
        pc.asiento = 'A';
        pc.fila = 3;
        pc.imprimir();
        System.out.println("precio: " + pc.getPrecio());
    }
}
