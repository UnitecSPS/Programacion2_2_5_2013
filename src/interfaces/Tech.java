/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Docente 17082011
 */
public class Tech {
    public static void main(String[] args) {
        SmartDevice sd = new IPhone(1,2);
        SmartDevice sd2 = new Refrigerator();
        Phone ph = new IPhone(2,3);
        
        if( sd instanceof SmartDevice &&
            sd instanceof Phone &&
            sd instanceof IPhone){
            System.out.println("SOY TODO ESO!!");
            ((Phone)sd).makeCall(9998);
            ((Multiplayer)sd).serverConnection(5);
        }
        
        sd.getIp();
        sd2.getIp();
        
        ((SmartDevice)ph).openCamera();
    }
}
