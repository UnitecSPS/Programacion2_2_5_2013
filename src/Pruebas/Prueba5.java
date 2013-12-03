/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Docente 17082011
 */
public class Prueba5 {
    public boolean rentABook(int codigo)throws IOException{
        RandomAccessFile ram = new RandomAccessFile("libros.bok","rw");
        
        while(ram.getFilePointer() < ram.length() ){
            int cod = ram.readInt();
            ram.readUTF();
            long pos = ram.getFilePointer();
            int copias = ram.readInt();
            ram.readUTF();
            boolean esrenta = ram.readBoolean();
            ram.readDouble();
            
            if(codigo==cod){
                if(copias > 0 && esrenta){
                    ram.seek(pos);
                    ram.writeInt(copias-1);
                    return true;
                }
                break;
            }
        }
        
        return false;
    }
}
