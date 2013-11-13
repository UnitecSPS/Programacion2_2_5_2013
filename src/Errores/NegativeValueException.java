/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Docente 17082011
 */
public class NegativeValueException extends Exception {
    public NegativeValueException(){
        super("NUMERO ES NEGATIVO");
    }
}
