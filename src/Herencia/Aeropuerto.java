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
            
          
            if( rev instanceof PrimeraClase){
                System.out.println("SOY PRIMERA CLASE");
                ((PrimeraClase)rev).setWifiPlan(true);
            }
            else if( rev instanceof SegundaClase){
                System.out.println("SOY SEGUNDA CLASE");
                ((SegundaClase)rev).pelicula();
            }
            else if( rev instanceof Reservacion ){
                System.out.println("SOY RESERVACION");
            }
            else{
                System.out.println("NO SE QUE SOY");
            }
            
        }
             
        System.out.println("\n");
        reservas.remove(0);
        for(Reservacion rev : reservas){
            rev.imprimir();
        }
        
    }
}
