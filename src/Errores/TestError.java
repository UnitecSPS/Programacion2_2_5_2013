/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author Docente 17082011
 */
public class TestError {
    public static void main(String[] args) {
        
        try{
            ClaseA clas = new ClaseA();
            clas.FuncA();
            System.out.println("CERRAR CONEXION");
        }
        catch(NullPointerException e){
            System.out.println("Instancialo vo!");
        }
        catch(InputMismatchException e){
            System.out.println("Ingrese un entero");
        }
        catch(NegativeValueException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("ERROR: " +
                    e.getMessage());
            //e.printStackTrace();
        }
        finally{
            System.out.println("SE CORRIO EL FINALLY");
        }
        
        System.out.println("FIN DEL MAIN");
    }
}
