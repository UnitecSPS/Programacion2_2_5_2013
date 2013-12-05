/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Docente 17082011
 */
public class TestNodo {
    public static void main(String[] args) {
        Nodo a = new Nodo("Carlos");
        Nodo b = a;
        
        b.name = "Manuel";
        
        System.out.println("a: " + a.name);
        System.out.println("b: " + b.name);
        
        if( a == b ){
            System.out.println("ES EL MISMO ESPACIO");
        }
        
        String x = "Hola";
        String y = "Hola";
        System.out.println("x: " + x);
        
        if( x == y )
            System.out.println("Cadenas iguales");
        else
            System.out.println("Cadenas no iguales");
    }
}
