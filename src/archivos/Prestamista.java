/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Docente 17082011
 */
public class Prestamista {
    private Scanner lea = new Scanner(System.in);
    private RandomAccessFile rPrestamos;

    public Prestamista() {
        try {
            initDir();
            initArchivoPrestamos();
            initCodigos();
        } catch (Exception e) {
            System.out.println("NO DEBERIA ENTRA AQUI");
        }
    }

    private void initDir() {
        File fi = new File("archivos");
        fi.mkdir();
    }

    private void initArchivoPrestamos() throws Exception {
        rPrestamos = new RandomAccessFile("archivos/prestamos.pre", "rw");
    }

    private void initCodigos() throws Exception {
        RandomAccessFile rcods = new RandomAccessFile("archivos/codigos.pre", "rw");

        if (rcods.length() == 0) {
            rcods.writeInt(1);
        }

        rcods.close();
    }

    private int getCodigo() throws Exception {
        RandomAccessFile rcods = new RandomAccessFile("archivos/codigos.pre", "rw");

        int cod = rcods.readInt();
        rcods.seek(0);
        rcods.writeInt(cod + 1);
        rcods.close();

        return cod;
    }

    public void addPrestamo(String cli, double m, double t, int cp) throws Exception {
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

        double mm = (m + (m * t)) / cp;

        initArchivoPago(codPrestamo, mm, cp);
    }

    private void initArchivoPago(int codPrestamo, double mm, int cant) throws Exception {
        RandomAccessFile rPago = new RandomAccessFile("archivos/pagos_"
                + codPrestamo + ".pre", "rw");

        Calendar cal = Calendar.getInstance();

        for (int c = 1; c <= cant; c++) {
            //fecha maxima de pago
            cal.add(Calendar.MONTH, 1);
            System.out.println("Agregando cuota para "
                    + cal.getTime());

            rPago.writeLong(cal.getTimeInMillis());
            //monto
            rPago.writeDouble(mm);
            //fecha de pago
            rPago.writeLong(0);
        }

        rPago.close();
    }
    /*
     * Funcion buscar busca el codigo dentro del archivo
     */

    public long buscar(int c) throws IOException {
        rPrestamos.seek(0);

        while (rPrestamos.getFilePointer() < rPrestamos.length()) {
            int cod = rPrestamos.readInt();
            if (c == cod) {
                return rPrestamos.getFilePointer();
            } else {
                rPrestamos.readUTF();
                rPrestamos.seek(rPrestamos.getFilePointer()+36);

            }
        }
        return -1;

    }

    public void estadoCuenta(int cod)throws Exception {
        if( buscar(cod) != -1 ){
            System.out.println("Nombre: " + 
                    rPrestamos.readUTF());
            System.out.println("Monto: " + 
                    rPrestamos.readDouble());
            System.out.println("Balance: " + 
                    rPrestamos.readDouble());
            System.out.println("Tasa: " +
                    rPrestamos.readDouble());
            System.out.println("Fecha: " + 
                    new Date(rPrestamos.readLong()));
            System.out.println("Cantidad de Cuotas: "+
                    rPrestamos.readInt());
            listarCuota(cod);
        }
        else{
            System.out.println("Prestamo No Existe");
        }
    }

    private void listarCuota(int cod)throws Exception {
        RandomAccessFile rCuotas = 
                new RandomAccessFile("archivos/pagos_"+ 
                cod + ".pre", "r");
        int conta = 1;
        while(rCuotas.getFilePointer() < rCuotas.length()){
            System.out.print("Cuota " + conta++);
            System.out.print(" " + new Date(rCuotas.readLong()));
            System.out.print(" Lps. " + rCuotas.readDouble());
            long pago = rCuotas.readLong();
            if(pago > 0){
                System.out.println(" pagado en " + 
                        new Date(pago));
            }
            else{
                System.out.println(" - No Pagado");
            }
        }
    }

    public void pagarCuota(int cod)throws IOException {
        if( buscar(cod) != -1 ){
            rPrestamos.readUTF();
            double monto = rPrestamos.readDouble();
            long pos = rPrestamos.getFilePointer();
            double balance = rPrestamos.readDouble();
            double tasa = rPrestamos.readDouble();
            rPrestamos.readLong();
            int cant = rPrestamos.readInt();
            
            if(balance > 0){
                double cuota = registrarPago(cod,(monto*tasa)/cant);
                rPrestamos.seek(pos);
                rPrestamos.writeDouble(balance-cuota);
                System.out.println("Cuota Pagada con Exito");
            }else{
                System.out.println("Prestamo Ya esta pagado");
            }
        }
        else{
            System.out.println("Prestamo No Existe");
        }
    }

    private double registrarPago(int cod, double inte)throws IOException {
        RandomAccessFile rCuotas = 
                new RandomAccessFile("archivos/pagos_"+ 
                cod + ".pre", "rw");
        
        int cont=1;
        while(rCuotas.getFilePointer() < rCuotas.length()){
            Date max = new Date(rCuotas.readLong());
            double monto = rCuotas.readDouble();
            long fechaPago = rCuotas.readLong();
            
            if(fechaPago == 0){
                rCuotas.seek(rCuotas.getFilePointer()-8);
                rCuotas.writeLong(new Date().getTime());
                System.out.println("Cuota " + cont + " del "+
                        max + " ha sido pagada.");
                System.out.println("Lps. " + monto);
                return monto - inte;
            }
            cont++;
        }
        return 0;
    }
}
