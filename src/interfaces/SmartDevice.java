/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Docente 17082011
 */
public interface SmartDevice {
    int version=2555;
    void getIp();
    int openWebRequest(String url);
    void openCamera();
}
