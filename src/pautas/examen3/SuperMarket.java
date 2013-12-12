/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pautas.examen3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class SuperMarket {
    RandomAccessFile rProds;
    
    public SuperMarket()throws IOException{
        File dirs = new File("files/invoices");
        dirs.mkdirs();
        rProds = new RandomAccessFile("files/productos.str",
                "rw");
    }
    
    public long searchProduct(int cod)throws IOException{
        rProds.seek(0);
        while(rProds.getFilePointer() < rProds.length()){
            long pos = rProds.getFilePointer();
            int codigo = rProds.readInt();
            rProds.readUTF();
            rProds.readDouble();
            rProds.readInt();
            
            if(codigo == cod)
                return pos;
        }
        return -1;
    }
    
    public void addProduct(int cod, String title, double precio,
            int cantidad)throws IOException{
        
        if(this.searchProduct(cod) == -1){
            rProds.seek(rProds.length());
            rProds.writeInt(cod);
            rProds.writeUTF(title);
            rProds.writeDouble(precio);
            rProds.writeInt(cantidad);
        }
    }
    
    public int getCodigoFactura(){
        File dir = new File("files/invoices");
        return dir.list().length + 1;
    }
    
    public void vender()throws IOException{
        Scanner lea = new Scanner(System.in);
        char resp;
        double st=0,tp, imp;
       
        //crear archivo de factura
        int cod = this.getCodigoFactura();
        RandomAccessFile rFact = new RandomAccessFile("files/invoices/invoice_"+cod+".str","rw");
        //escribimos los primeros 3 datos
        rFact.writeInt(cod);
        rFact.writeLong(new Date().getTime());
        rFact.writeUTF(lea.next());
        //pedir productos
        do{
            int codprod;
            long posprod;
            do{
                codprod = lea.nextInt();
                posprod = this.searchProduct(codprod);
                if( posprod != -1)
                    break;
            }while(true);
            
            //ya tengo el producto
            rProds.seek(posprod);
            rProds.readInt();
            System.out.println(rProds.readUTF());//titulo
            double precioprod = rProds.readDouble();
            System.out.println(precioprod);//precio
            //pedir cantidad
            int inventario = rProds.readInt();
            int cantidad;
            do{
                cantidad = lea.nextInt();
                if( cantidad <= inventario)
                    break;
            }while(true);
            //actualizo subtotal de producto
            double stprod = cantidad * precioprod;
            System.out.println("Subtotal de Prod " + stprod);
            rProds.seek(rProds.getFilePointer()-4);
            rProds.writeInt(inventario-cantidad);
            st += stprod;
            //escribir en factura
            rFact.writeInt(codprod);
            rFact.writeDouble(precioprod);
            rFact.writeInt(cantidad);
            
            resp = lea.next().charAt(0);
        }while(resp == 's');
        
        imp = st * 0.12;
        tp = st + imp;
        System.out.println(st);
        System.out.println(imp);
        System.out.println(tp);
    }
    
    public void compras(int cod,int cant)throws IOException{
        long pos = this.searchProduct(cod);
        
        if(pos != -1){
            rProds.seek(pos);
            rProds.readInt();
            rProds.readUTF();
            rProds.readDouble();
            int inventario = rProds.readInt();
            rProds.seek(rProds.getFilePointer()-4);
            rProds.writeInt(inventario+cant);
        }
    }
    
    public void verInvoice(int codfact)throws IOException{
        File f = new File("files/invoices/invoice_"+
                codfact+".str");
        double st = 0;
        if( f.exists() ){
            RandomAccessFile rFact = new RandomAccessFile(f,"rw");
            //codigo
            System.out.println(rFact.readInt());
            //fecha
            System.out.println(new Date(rFact.readLong()));
            //cliente
            System.out.println(rFact.readUTF());
            
            while(rFact.getFilePointer() < rFact.length()){
                int codprod = rFact.readInt();
                double prec = rFact.readDouble();
                int cantidad = rFact.readInt();
                double stprod = prec * cantidad;
                st += stprod;
                
                rProds.seek(this.searchProduct(codprod));
                rProds.readInt();
                
                System.out.println(codprod + "-" + rProds.readUTF()+
                        "-" + prec + "-" + stprod);
                
            }
            double imp = st * 0.12;
            double tp = st + imp;
            System.out.println(st);
            System.out.println(imp);
            System.out.println(tp);
        }
    }
    
    public void escasez()throws IOException{
        rProds.seek(0);
        while(rProds.getFilePointer() < rProds.length() ){
            int cod = rProds.readInt();
            String title = rProds.readUTF();
            double prec = rProds.readDouble();
            int cant = rProds.readInt();
            
            if(cant <= 1)
                System.out.println(cod + title + prec + cant);
        }
    }
}
