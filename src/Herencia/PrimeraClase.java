/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Gotcha
 */
public class PrimeraClase extends Reservacion {
    public boolean wifiPlan;

    public PrimeraClase(int codigo, String nombre){
        super(codigo, nombre, 700);
    }
            
    public boolean isWifiPlan() {
        return wifiPlan;
    }

    public void setWifiPlan(boolean wifiPlan) {
        this.wifiPlan = wifiPlan;
    }
    
    
}
