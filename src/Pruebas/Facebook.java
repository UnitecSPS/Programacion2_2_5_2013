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
public class Facebook extends RedSocial implements Comentable {
    
    private ArrayList<Comment> comments;

    public Facebook(String user) {
        super(user);
        comments = new ArrayList<Comment>();
    }   
    
    @Override
    public void recordPost(String post) {
        posts.add(post);
    }

    @Override
    public boolean addComment(int postid, String comment) {
        if(postid >= 0 && postid < posts.size()){
            comments.add(new Comment(postid, comment));
            return true;
        }
        return false;
    }
    
}
