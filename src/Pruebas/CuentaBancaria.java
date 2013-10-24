/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Docente 17082011
 */
public class CuentaBancaria {
    protected int codigo;
    protected String nombre;
    protected double saldo;

    public CuentaBancaria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        saldo = 500;
    }
    
    public void imprimir(){
        System.out.println(codigo + "-" + nombre + " Lps." + saldo);
    }
    
    
}
