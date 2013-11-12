/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.InputMismatchException;

/**
 *
 * @author Docente 17082011
 */
public class TestError {
    public static void main(String[] args) {
        ClaseA clas = new ClaseA();
        
        try{
            clas.FuncA();
            System.out.println("LLame bien a A");
        }
        catch(NullPointerException e){
            System.out.println("Instancialo vo!");
        }
        catch(InputMismatchException e){
            System.out.println("Ingrese un entero");
        }
        catch(Exception e){
            System.out.println("ERROR: " +
                    e.getMessage());
        }
        
        System.out.println("FIN DEL MAIN");
    }
}
