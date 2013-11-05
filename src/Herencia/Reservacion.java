/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 */
public class Reservacion {
    protected int codigo;
    protected char asiento;
    protected int fila;
    protected String nombre;
    protected double precio;
    public static final int version = 5;
    
    public Reservacion(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public Reservacion(int codigo){
        this(codigo, "Fulanito", 0);
    }

    public final int getCodigo() {
        return codigo;
    }

    public final String getNombre() {
        return nombre;
    }

    public final double getPrecio() {
        return precio;
    }
    
    public final String getAsiento(){
        return "" + fila + asiento;
    }
    
    public void quienSoy(){
        System.out.println("Soy El PAPA de las reservas");
    }
    
    public void imprimir(){
        final int x;
        x = 2;
        //x=9; seria un error
        System.out.println("------------------------------");
        System.out.println("CODIGO RESERVA: " + codigo);
        System.out.println("PASAJERO: " + nombre);
        System.out.println("ASIENTO: " + fila + asiento);
        System.out.println("------------------------------");
    }
}
