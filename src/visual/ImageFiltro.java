/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Docente 17082011
 */
public class ImageFiltro extends FileFilter {
    private ArrayList<String> types;
    
    public ImageFiltro(){
        types = new ArrayList<String>();
        types.add("jpeg");
        types.add("gif");
        types.add("png");
        types.add("bmp");
        types.add("jpg");
    }
    
    @Override
    public boolean accept(File f) {
        String name = f.getName();
        
        if(f.isDirectory())
            return true;
        
        String data[] = name.split("\\.");
       
        if(data.length == 2){
            return types.contains(data[1]);
        }
        
        return false;
    }

    @Override
    public String getDescription() {
         return "Escoja una imagen.";
    }
    
}
