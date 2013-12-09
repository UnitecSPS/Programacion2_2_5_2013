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
        
        System.out.println("\n-------");
        list.remove("Gochez");
        list.remove("Manuel");
        list.remove("Estalin");
        list.printList();
        System.out.println("\n-------");
        
        list.addInTheMiddle(new Nodo("Estalin"), "Gaby");
        list.addInTheMiddle(new Nodo("Carlos"), "Victor");
        list.addInTheMiddle(new Nodo("No Plz"), "Kaka");
        list.printList();
    }
}
