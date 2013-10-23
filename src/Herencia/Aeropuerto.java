/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author Gotcha
 */
public class Aeropuerto {
    public static void main(String[] args) {
        ArrayList<Reservacion> reservas = new ArrayList<Reservacion>();
        Reservacion res = new Reservacion(1,"Estalin",800);
        reservas.add( res );
        reservas.add( new PrimeraClase(2, "Gaby") );
        reservas.add( new SegundaClase(3,"Carlos") );
        
        for(Reservacion rev : reservas){
            rev.quienSoy();
        }
        System.out.println("\n");
        reservas.remove(0);
        for(Reservacion rev : reservas){
            rev.imprimir();
        }
        
    }
}
