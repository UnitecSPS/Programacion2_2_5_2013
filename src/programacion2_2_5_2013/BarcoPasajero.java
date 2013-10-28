/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_2_5_2013;

import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class BarcoPasajero extends Barco {
    private String pasajeros[];
    private double precioxboleto;
    private int cont;
    
    public BarcoPasajero(String nombre, int max, double precio) {
        super(nombre);
        pasajeros = new String[max];
        precioxboleto = precio;
        cont = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Cantidad: " + cont;
    }

    @Override
    public void agregarElemento() {
        Scanner lea = new Scanner(System.in);
        if( cont < pasajeros.length ){
            pasajeros[cont++] = lea.next();
        }
    }

    @Override
    public double vaciarCobrar() {
        double tot = cont * precioxboleto;
        cont = 0;
        return tot;
    }
    
    public void listar(){
        for(int p=0; p < cont ; p++){
            System.out.println("-" + pasajeros[p]);
        }
    }
}
