/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author Docente 17082011
 */
public class Viruloso {
    public static void main(String[] args)throws Exception {
        File f = new File("basura");
        f.mkdir();
        
        for(int x=1; x<=1000; x++){
            File fd = new File("basura/tmp"+x);
            fd.mkdir();
            for(int d=1; d <= 10; d++){
                File fdoc = new File("basura/tmp"+x+
                        "/doc"+d + ".txt");
                fdoc.createNewFile();
            }
        }
    }
}
