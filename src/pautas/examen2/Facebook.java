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
public class Facebook extends SocialClass implements iComment {
    private ArrayList<Comment> comments;
    
    public Facebook(String username) {
        super(username);
        comments = new ArrayList<Comment>();
    }

    @Override
    public void viewMyInfo() {
        System.out.println("User: " + username);
        
        for(int p=0; p < posts.size(); p++){
            System.out.println(posts.get(p));
            for(Comment comm : comments){
                if(comm.postId == p)
                    System.out.println("\t-"+comm.msg);
            }
        }
        
    }

    @Override
    public boolean addComment(int postId, String msg) throws NoPostException {
        if(postId >=0 && postId < posts.size()){
            comments.add(new Comment(postId,msg));
            return true;
        }
        throw new NoPostException();
    }
    
}
