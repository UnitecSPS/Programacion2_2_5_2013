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
    public int codigo;
    public char asiento;
    public int fila;
    public String nombre;
    public double precio;
    
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
    
    public void imprimir(){
        System.out.println("------------------------------");
        System.out.println("CODIGO RESERVA: " + codigo);
        System.out.println("PASAJERO: " + nombre);
        System.out.println("ASIENTO: " + fila + asiento);
        System.out.println("------------------------------");
    }
}
