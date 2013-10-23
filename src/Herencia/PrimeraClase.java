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
    private boolean wifiPlan;

    public PrimeraClase(int codigo, String nombre){
        super(codigo, nombre, 700);
    }
            
    public boolean isWifiPlan() {
        return wifiPlan;
    }

    public void setWifiPlan(boolean wifiPlan) {
        this.wifiPlan = wifiPlan;
    }
    
    @Override
    public void quienSoy(){      
        System.out.println("Yo soy fresa porque soy de PRIMERA CLASE");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        if(wifiPlan)
            System.out.println("TIENE WIFI PLAN");
        else
            System.out.println("SIN PLAN WIFI");
    }
    
    
    
    
}
