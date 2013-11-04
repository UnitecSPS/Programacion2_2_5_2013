/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Docente 17082011
 */
public class Granja {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        
        if( c instanceof GregorianCalendar )
            System.out.println("SIII!");
        
        Animal ani = Animal.getInstance("perro");
        ani.hablar();
        
        //funciones ON DEMAND
        Animal ani2 = new Animal(){
            public void test(){
                System.out.println("tes tes test");
            }
            @Override
            public void hablar(){
                test();
                System.out.println("hljksdh jshdjhdjs");
            }
        };
        
        ani2.hablar();
        
        Perro dog = new Perro(){
            public void hablar(){
                System.out.println("Guaf Guaf");
            }
        };
               
        dog.hablar();
        
    }
}
