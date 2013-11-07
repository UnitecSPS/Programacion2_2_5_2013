/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.ArrayList;

/**
 *
 * @author Docente 17082011
 */
public abstract class RedSocial {
    protected ArrayList<String> posts;
    protected String user;

    public RedSocial(String user) {
        this.user = user;
        posts = new ArrayList<String>();
    }

    public final String getUser() {
        return user;
    }
    
    public abstract void recordPost(String post);
    
}
