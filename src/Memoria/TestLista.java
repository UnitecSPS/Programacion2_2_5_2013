    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Docente 17082011
 */
public class TestLista {
    public static void main(String[] args) {
        Lista list = new Lista();
        
        list.add(new Nodo("Gochez"));
        list.add(new Nodo("Gaby"));
        list.add(new Nodo("Manuel"));
        list.add(new Nodo("Victor"));
        
        list.printList();
    }
}
