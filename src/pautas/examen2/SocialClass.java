/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pautas.examen2;

import java.util.ArrayList;

/**
 *
 * @author Docente 17082011
 */
public abstract class SocialClass {
    protected ArrayList<String> friends;
    protected ArrayList<String> posts;
    protected String username;

    public SocialClass(String username) {
        this.username = username;
        friends = new ArrayList<String>();
        posts = new ArrayList<String>();
    }
    
    public final void addFriend(String user){
        if(friends.contains(user)||user.equals(username))
            throw new FriendExistException();
        friends.add(user);
    }
    
    public abstract void viewMyInfo();
    
    public void crearPost(String msg){
        posts.add(msg);
    }
}
