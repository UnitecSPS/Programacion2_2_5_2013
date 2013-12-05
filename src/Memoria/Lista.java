/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Memoria;

/**
 *
 * @author Docente 17082011
 */
public class Lista {
    Nodo raiz = null;
    
    public void add(Nodo obj){
        if( obj != null ){
            if( raiz == null ){
                //lista vacia
                raiz = obj;
            }
            else{
                //buscar la cola
                Nodo tmp = raiz;
                
                while(tmp.siguiente != null ){
                    tmp = tmp.siguiente;
                }
                
                tmp.siguiente = obj;
            }
        }
    }
    
    public void printList(){
        Nodo tmp = raiz;
        System.out.println("\nLISTA DE NODOS\n----------");
        
        while(tmp != null ){
            System.out.println("-" + tmp.name);
            tmp = tmp.siguiente;
        }
    }
    
    public boolean remove(String name){
        return false;
    }
}
