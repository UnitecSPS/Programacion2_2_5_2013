/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Docente 17082011
 */
public class Movie {
    private MovieType type;
    
    public Movie(String t){
        try{
            type = MovieType.valueOf(t);
        }
        catch(Exception e){
            System.out.println("Type Incorrecto");
            type = MovieType.UNDEFINE;
        }
        System.out.println("!!PASO!");
    }
    
    public double getPago(int dias){
        return dias * type.price;
    }

    public MovieType getType() {
        return type;
    }
    
    
}
