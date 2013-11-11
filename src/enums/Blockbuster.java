/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Docente 17082011
 */
public class Blockbuster {
    public static void main(String[] args) {
        Movie hp = new Movie("ESTRENo");
        System.out.println("Pagar por 2 dias: " +
                hp.getPago(2));
        System.out.println("Tipo: " + hp.getType());
    }
}
