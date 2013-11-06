/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Docente 17082011
 */
public class Refrigerator implements SmartDevice{

    @Override
    public void getIp() {
        System.out.println("192.168.9.10");
    }

    @Override
    public int openWebRequest(String url) {
        System.out.println("PAGE NOT FOUND");
        return 404;
    }

    @Override
    public void openCamera() {
        System.out.println("Not Available");
    }
    
}
