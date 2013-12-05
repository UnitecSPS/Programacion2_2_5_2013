/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class FileWriterAndReader {
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        
        
        do{
            System.out.println("1- Escribir en Archivo");
            System.out.println("2- Leer con FileReader");
            System.out.println("3- Leer con FilReader+Scanner");
            System.out.println("4- Salir");
            System.out.println("Escoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Nombre del Archivo: ");
                    testFileWriter(lea.next());
                    break;
                case 2:
                    System.out.println("Nombre del Archivo: ");
                    testFileReader(lea.next());
                    break;
                case 3:
                    System.out.println("Nombre del Archivo: ");
                    testFileReaderScanner(lea.next());
                    break;
                    
            }
        }while(op!=4);
    }

    private static void testFileWriter(String path) {
        try{
            System.out.println("Append?: ");
            char resp = lea.next().charAt(0);
            
            FileWriter fw = new FileWriter(path,
                    resp=='s' ? true : false);
            
            String msg;
            do{
                System.out.println("Ingrese texto: ");
                msg = lea.nextLine();
                
                if(!msg.equals("#$%")){
                    fw.write(msg+"\n");
                    fw.flush();
                }
                    
            }while(!msg.equals("#$%"));
            
            fw.close();
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void testFileReader(String path) {
        File f = new File(path);
        try{
            FileReader fr = new FileReader(f);
            char buffer[] = new char[(int)f.length()];
            fr.read(buffer);
            System.out.println("Contenido");
            System.out.println("--------------");
            System.out.println(buffer);
            fr.close();
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void testFileReaderScanner(String next) {
        try{
            FileReader fr = new FileReader(next);
            Scanner sc = new Scanner(fr);
            sc.useDelimiter(System.getProperty("line.separator"));
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
            
            fr.close();
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
