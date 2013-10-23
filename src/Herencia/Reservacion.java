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
    
    public Reservacion(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //public Reservacion(int codigo){
      //  this(codigo, "Fulanito", 0);
    //}

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public String getAsiento(){
        return "" + fila + asiento;
    }
    
    public void quienSoy(){
        System.out.println("Soy El PAPA de las reservas");
    }
    
    public void imprimir(){
        System.out.println("------------------------------");
        System.out.println("CODIGO RESERVA: " + codigo);
        System.out.println("PASAJERO: " + nombre);
        System.out.println("ASIENTO: " + fila + asiento);
        System.out.println("------------------------------");
    }
}
