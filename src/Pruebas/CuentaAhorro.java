/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Docente 17082011
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasa;

    public CuentaAhorro(int codigo, String nombre, double tasa) {
        super(codigo, nombre);
        this.tasa = tasa;
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Tasa: " + tasa);
    }
    
    
}
