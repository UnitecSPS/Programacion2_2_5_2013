/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Docente 17082011
 */
public class Phone {
    public int num;
    public int serie;

    public Phone(int num, int serie) {
        this.num = num;
        this.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public int getSerie() {
        return serie;
    }
    
    public void makeCall(int num){
        System.out.println("Llamando a " +num);
    }
    
    public void sendMessage(int num,String msg){
        System.out.println("Mandando mensajito a: " + num);
        System.out.println("Contenido: \n" + msg);
    }
}
