/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;


/**
 *
 * @author Docente 17082011
 */
public final class SegundaClase extends Reservacion {
    
    public SegundaClase(int cod, String n){
        super(cod, n, 350);
    }

    @Override
    public void quienSoy() {
        System.out.println("Soy pobre porque voy en SEGUNDA CLASE");
    }
   
    public final void pelicula(){
        System.out.println("HARRY POTTER Y LA CLASE DE JAVA");
    }
    
    //public abstract void patito();
}
