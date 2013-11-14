/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Errores.NegativeValueException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class MiClase {
    private int arreglo[];
    private Scanner lea;
    
    public MiClase(int n){
        arreglo = new int[n];
        lea = new Scanner(System.in);
    }
    
    public void llenar()throws NegativeValueException{
  
        for(int n=0; n < arreglo.length; n++){
            try{
                int valor = lea.nextInt();

                if(valor >= 0)
                    arreglo[n] = valor;
                else
                    throw new NegativeValueException();

            }
            catch(InputMismatchException e){
                System.out.println("Error: " + e.getMessage());
                n--;
                lea.next();
            }
        } 
    }
}
