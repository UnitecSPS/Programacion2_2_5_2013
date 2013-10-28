/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_2_5_2013;

import java.util.Date;

/**
 *
 * @author Docente 17082011
 */
public class Barco {
    protected String nombre;
    protected Date fecha;
    
    public Barco(String nombre) {
        this.nombre = nombre;
        fecha = new Date();
    }

    @Override
    public String toString() {
        return "Barco{" + "nombre=" + nombre + '}';
    }

    public final String getNombre() {
        return nombre;
    }
        
    public void agregarElemento(){
        System.out.println("SOY PAPA");
    }
    
    public double vaciarCobrar(){
        return 0;
    }
}
