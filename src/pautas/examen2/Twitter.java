/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pautas.examen2;

/**
 *
 * @author Docente 17082011
 */
public class Twitter extends SocialClass {

    public Twitter(String username) {
        super(username);
    }

    @Override
    public void viewMyInfo() {
        for(String msg : posts)
            System.out.println(msg);
    }
    
}
