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
    
    public ClaseA()throws Exception{
        
    }
    
    public void FuncA() throws NegativeValueException{
        FuncB();
        System.out.println("FIN DE FUNCA");
    }
    
    public void FuncB()throws NegativeValueException{
        //lea.close();
        int x = lea.nextInt();
        if(x < 0 ){
            throw new NegativeValueException();
        }
        System.out.println("FIN DE FUNCB");
    }
}
