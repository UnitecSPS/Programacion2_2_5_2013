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
        
        if( raiz != null ){
            if( raiz.name.equals(name) ){
                raiz = raiz.siguiente;
            }
            else{
                Nodo tmp = raiz;
                
                while(tmp.siguiente != null &&
                        !tmp.siguiente.name.equals(name)){
                    tmp = tmp.siguiente;
                }
                
                if(tmp.siguiente != null){
                    tmp.siguiente = tmp.siguiente.siguiente;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addInTheMiddle(Nodo obj, String name){
        Nodo tmp = raiz;
        
        while(tmp != null && !tmp.name.equals(name)){
            tmp = tmp.siguiente;
        }
        
        if( tmp != null ){
            obj.siguiente = tmp.siguiente;
            tmp.siguiente = obj;
            return true;
        }
        return false;
    }
    
    public boolean contains(String name){
        Nodo tmp = raiz;
        
        while(tmp != null){
            if( tmp.name.equals(name))
                return true;
            tmp = tmp.siguiente;
        }
        
        return false;
    }
}
