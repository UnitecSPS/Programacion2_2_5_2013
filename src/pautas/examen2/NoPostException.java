/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pautas.examen2;

/**
 *
 * @author Docente 17082011
 */
public class NoPostException extends Exception {
    public NoPostException(){
        super("Post no Existe");
    }
}
