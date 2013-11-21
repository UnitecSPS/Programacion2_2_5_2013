/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Docente 17082011
 */
public class TestFile {
    public static void main(String[] args) {
        //direccion abstracta
        File f = new File("hola.txt");
        //direccion absoluta
        File f2 = new File("C:\\Users\\patito.txt");
        
        if( f.exists() ){
            System.out.println("Nombre: " + f.getName());
            System.out.println("Dir Absoluta: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length());
            System.out.println("Path: " + f.getPath());
            System.out.println("Padre: " + 
                    f.getAbsoluteFile().getParentFile().getName());
            Date d = new Date(f.lastModified());
            System.out.println("Ultima Modificacion en "+
                    d);
            
            f.delete();
        }
        else{
            System.out.println("NO EXISTE");
            try{
                if( f.createNewFile() )
                    System.out.println("SE CREO");
                else
                    System.out.println("NO SE CREO");
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
