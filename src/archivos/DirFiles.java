    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.Scanner;
import java.io.File;
import java.util.Date;
/**
 *
 * @author Docente 17082011
 */
public class DirFiles {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Ingrese Path: ");
        String path = lea.nextLine();
        
        File f = new File(path);
        
        if( f.isDirectory() ){
            File children[] = f.listFiles();
            for(File child : children ){
                if( !child.isHidden() ){
                    System.out.print("- " + child.getName());
                    if(child.isFile()){
                        System.out.print(" <FILE> ");
                        System.out.print(child.length() + " bytes " );
                    }
                    if (child.isDirectory())
                        System.out.print(" <DIR> ");
                    Date d = new Date(child.lastModified());
                    System.out.println(d);
                }
            }
        }
        f.delete();
    }
}
