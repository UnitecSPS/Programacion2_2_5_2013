/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.ArrayList;

/**
 *
 * @author Docente 17082011
 */
public class AmericanAirlines {
    private ArrayList<Reservacion> reservas;
    
    public AmericanAirlines(){
        reservas = new ArrayList<Reservacion>();
    }
    
    public int getCodigo(){
        return reservas.size() + 1;
    }
    
    public void addReserva(String nombre, String tipo, boolean wifi){
        int codigo = getCodigo();
        
        if(tipo.equals("Primera")){
            PrimeraClase pc = new PrimeraClase(codigo,nombre);
            pc.setWifiPlan(wifi);
            reservas.add(pc);
        }
        else{
            reservas.add(new SegundaClase(codigo, nombre));
        }
    }
    
    public String[] columnas(){
        String cols[] = {"Codigo", "Nombre", "Tipo", "Observaciones"};
        return cols;
    }
    
    public Object[][] getData(){
        Object data[][] = new Object[reservas.size()][4];
        
        for(int r=0; r < reservas.size(); r++){
            Reservacion res = reservas.get(r);
            data[r][0] = res.getCodigo();
            data[r][1] = res.nombre;
            data[r][2] = res.getClass().getName();
            data[r][3] = "";
            
            if(res instanceof PrimeraClase){
                if(((PrimeraClase)res).isWifiPlan())
                    data[r][3] = "Tiene Wifi Plan";
            }
        }
        return data;
    }
}
