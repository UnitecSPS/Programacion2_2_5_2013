/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class ExampleScanner {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int x;
        
        do{
            try{
                System.out.println("Entero: ");
                x = lea.nextInt();
                break;
            }
            catch(InputMismatchException e){
                lea.nextLine();
                System.out.println("Error vuelva a ingresarlo");
            }
        }while(true);
    }
}
