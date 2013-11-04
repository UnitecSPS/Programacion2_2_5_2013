/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Docente 17082011
 */
public abstract class Animal {
    abstract void hablar();
    
    public static Animal getInstance(String tipo){
        if(tipo.equals("perro"))
            return new Perro();
        else if(tipo.equals("gato"))
            return new Gato();
        else
            return new Vaca();
    }
}
