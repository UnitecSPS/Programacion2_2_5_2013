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
public class TestMkdir {
    public static void main(String[] args) {
          //direccion abstracta
        File f = new File("dc");
        
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
            
            if( f.isFile() )
                System.out.println("Es archivo");
            if( f.isDirectory() )
                System.out.println("Es directorio");
            
            f.delete();
        }
        else{
            System.out.println("NO EXISTE");
            if( f.mkdirs() )
                System.out.println("Directio creado bien");
        }
    }
}
