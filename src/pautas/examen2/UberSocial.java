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
public class UberSocial {
    static ArrayList<SocialClass> redes;
    
    public static void main(String[] args) {
        redes = new ArrayList<SocialClass>();
    }
    
    public static SocialClass busqueda(String user, TipoCuenta tc){
        for(SocialClass sc : redes){
            if(user.equals(sc.username)){
                if( (tc == TipoCuenta.FACEBOOK && sc instanceof Facebook) ||
                    (tc == TipoCuenta.TWITTER && sc instanceof Twitter))
                    return sc;
            }
        }
        return null;
    }
    
    public static void agregarCuenta(String user,TipoCuenta tc){
        if( busqueda(user,tc) == null ){
            if(tc == TipoCuenta.FACEBOOK)
                redes.add(new Facebook(user));
            else
                redes.add(new Twitter(user));
        }
    }
    
    public static void agregarAmigo(String u1, String u2, TipoCuenta tc){
        try{
            SocialClass sc1 = busqueda(u1,tc);
            SocialClass sc2 = busqueda(u2,tc);
            
            if( sc1 != null && sc2 != null ){
                sc1.addFriend(u2);
                if(tc == TipoCuenta.FACEBOOK)
                    sc2.addFriend(u1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void agregarComment(String user,int postId,String com)throws NoPostException{
        SocialClass sc = busqueda(user,TipoCuenta.FACEBOOK);
        
        if( sc != null )
            ((Facebook)sc).addComment(postId, com);
    }
    
    public static void agregarPost(String user,String post,TipoCuenta tc){
        SocialClass sc = busqueda(user,tc);
        
        if( sc != null )
            sc.crearPost(post);
    }
}
