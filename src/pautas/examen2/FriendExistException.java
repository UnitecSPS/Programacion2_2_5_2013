/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pautas.examen2;

/**
 *
 * @author Docente 17082011
 */
public class FriendExistException extends RuntimeException {
    public FriendExistException(){
        super("Este amigo ya esta");
    }
}
