/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_2_5_2013;

/**
 *
 * @author Docente 17082011
 */
public class BarcoPesquero extends Barco{
    private int pecesCapturados;
    public static int precioxpescado = 12;

    public BarcoPesquero(String nombre) {
        super(nombre);
        pecesCapturados = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " peces: " + pecesCapturados;
    }

    @Override
    public void agregarElemento() {
        pecesCapturados++;
    }

    @Override
    public double vaciarCobrar(){
        int total = pecesCapturados * precioxpescado;
        pecesCapturados = 0;
        return total;
    }
    
    public void agregarCardumen(int n){
        pecesCapturados += n;
    }
    
    
}
