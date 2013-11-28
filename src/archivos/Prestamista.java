/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;

/**
 *
 * @author Docente 17082011
 */
public class Prestamista {
    private RandomAccessFile rPrestamos;
    
    public Prestamista(){
        try{
            initDir();
            initArchivoPrestamos();
            initCodigos();
        }catch(Exception e){
            System.out.println("NO DEBERIA ENTRA AQUI");
        }
    }

    private void initDir() {
        File fi = new File("archivos");
        fi.mkdir();
    }

    private void initArchivoPrestamos()throws Exception {
        rPrestamos = new RandomAccessFile("archivos/prestamos.pre", "rw");
    }

    private void initCodigos()throws Exception {
        RandomAccessFile rcods = new RandomAccessFile("archivos/codigos.pre","rw");
        
        if(rcods.length() == 0 ){
            rcods.writeInt(1);
        }
        
        rcods.close();
    }
    
    private int getCodigo()throws Exception{
       RandomAccessFile rcods = new RandomAccessFile("archivos/codigos.pre","rw");
       
       int cod = rcods.readInt();
       rcods.seek(0);
       rcods.writeInt(cod+1);
       rcods.close();
       
       return cod;  
    }
    
    public void addPrestamo(String cli, double m, double t, int cp)throws Exception{
        rPrestamos.seek(rPrestamos.length());
        
        //codigo
        int codPrestamo = getCodigo();
        rPrestamos.writeInt(codPrestamo);
        //nombre
        rPrestamos.writeUTF(cli);
        //monto
        rPrestamos.writeDouble(m);
        //balance
        rPrestamos.writeDouble(m);
        //tasa
        rPrestamos.writeDouble(t);
        //fecha
        rPrestamos.writeLong(new Date().getTime());
        //cantidad
        rPrestamos.writeInt(cp);
        
        double mm = (m+(m*t)) / cp;
        
        initArchivoPago(codPrestamo, mm);
    }

    private void initArchivoPago(int codPrestamo, double mm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
