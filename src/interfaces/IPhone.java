/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Docente 17082011
 */
public class IPhone extends Phone implements SmartDevice, Multiplayer {

    public IPhone(int num, int serie) {
        super(num, serie);
    }

    @Override
    public void getIp() {
        System.out.println("192.168.3.5");
    }

    @Override
    public int openWebRequest(String url) {
        System.out.println("LOADING " + url);
        return 200;
    }

    @Override
    public void openCamera() {
        System.out.println("Opening Camera");
    }

    @Override
    public void serverConnection(int pls) {
        System.out.println("Connection server to play");
    }
    
}
