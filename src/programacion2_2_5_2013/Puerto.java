/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_2_5_2013;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class Puerto {
    private ArrayList<Barco> barcos;
    Scanner lea = new Scanner(System.in);
    
    public Puerto(){
        barcos = new ArrayList<Barco>();
        
    }
    
    public Barco buscar(String nombre){
        for(Barco bar : barcos){
            if( bar.getNombre().equals(nombre) ){
               return bar; 
            }
        }
        return null;
    }
    
    public void agregarBarco(int tipo){
        String nomb = lea.next();
        
        if( buscar(nomb) == null ){
            switch(tipo){
                case 0:
                    barcos.add(new BarcoPesquero(nomb));
                    break;
                case 1:
                    int max = lea.nextInt();
                    double prec = lea.nextDouble();
                    barcos.add(new BarcoPasajero(nomb,max,prec));
                    break;
                default:
                    System.out.println("TIPO INCORRECTO");
            }
            
        }
    }
    
    public void agregarElemento(String nombre){
        Barco barco = buscar(nombre);
        
        if( barco != null ){
            barco.agregarElemento();
        }
    }
    
    public double vaciar(String nombre){
        return vaciar(nombre, 0);
    }

    private double vaciar(String nombre, int pos) {
        if( pos < barcos.size() ){
            if( barcos.get(pos).getNombre().equals(nombre) ){
                System.out.println(barcos.get(pos));
                return barcos.get(pos).vaciarCobrar();
            }
            return vaciar(nombre, pos + 1 );
        }
        return 0;
    }
    
    private void agregarCardumen(String nomb, int cant){
       Barco barco = buscar(nomb);
       if(barco instanceof BarcoPesquero){
           ((BarcoPesquero)barco).agregarCardumen(cant);
       }
    }
    
    public static void main(String[] args) {
        Barco b = new Barco("El Java");
        System.out.println(b);
    }
}