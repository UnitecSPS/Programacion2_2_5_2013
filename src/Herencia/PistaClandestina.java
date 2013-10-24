/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Docente 17082011
 */
public class PistaClandestina {
    public static void main(String[] args) {
        //UP CASTING
        Reservacion rev = new PrimeraClase(2, "Gaby");
        //DOWN CASTING  format: (Clase)obj
        //a.Indirecta
        PrimeraClase pc = (PrimeraClase)rev;
        pc.setWifiPlan(true);
        rev.imprimir();
        //b.Directa
        ((PrimeraClase)rev).setWifiPlan(false);
        rev.imprimir();
    }
}
