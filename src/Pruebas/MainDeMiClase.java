/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Docente 17082011
 */
public class MainDeMiClase {
    public static void main(String[] args) {
        MiClase mc = new MiClase(10);
        try{
            mc.llenar();
        }
        catch(Exception n){
            System.out.println("ERROR" +
                    n.getMessage());
        }
    }
}
