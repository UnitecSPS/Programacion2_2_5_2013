/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class ClaseA {
    Scanner lea = new Scanner(System.in);
    
    public void FuncA(){
        FuncB();
        System.out.println("FIN DE FUNCA");
    }
    
    public void FuncB(){
        int x = lea.nextInt()/0;
        System.out.println("FIN DE FUNCB");
    }
}
