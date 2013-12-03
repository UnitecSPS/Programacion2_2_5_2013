/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.Scanner;

/*
         * MENU
         *   1- Agregar Prestamo
         *   2- Imprimir Dato de Prestamo =
         *        pedir el codigo del prestamo, si existe
         *        muestra todo el estado del prestamo, incluyendo
         *        todo el listado de sus cuotas y si estan pagadas
         *        o no
         *   3- Pagar Cuota.
         *       Pida el codigo del prestamo, y si existe pagan
         *       la cuota no pagada mas proxima a la fecha actual.
         *       si el balance esta en cero se le dice que ya esta
         *       pagada. RECORDAR que con cada pago se actualiza la
         *       fecha de pago de la cuota Y se baja el balance del
         *       prestamo.
         *   4- Imprimir
         *        Si quiere imprimir los prestamos pendiente, pagados
         *       o Todos
         *       cada uno con los datos COD - NOMBRE - MONTO - BALANCE
         *       Al final un MONTO TOTAL entre todos los prestamos
         * 
         */

public class Elga {
    public static void main(String[] args) {
        Prestamista presta = new Prestamista();
        Scanner lea = new Scanner(System.in);
        
        int op;
        
        do{
            System.out.println("1- Agregar Prestamo");
            System.out.println("2- Estado de Cuenta de Prestamo");
            System.out.println("3- Pagar Cuota");
            System.out.println("4- Imprimir Prestamos");
            System.out.println("5- Salir");
            System.out.print("Escoja opcion: ");
            op = lea.nextInt();
            
            try{
                switch(op){
                    case 1:
                        System.out.print("Cliente: ");
                        String cli = lea.next();
                        System.out.print("Monto: ");
                        double mon = lea.nextDouble();
                        System.out.print("Tasa: ");
                        double t = lea.nextDouble();
                        System.out.print("Cantidad: ");
                        int cant = lea.nextInt();

                        presta.addPrestamo(cli, mon, t, cant);
                        break;
                    case 2:
                        System.out.print("Codigo: ");
                        int cod = lea.nextInt();
                        presta.estadoCuenta(cod);
                        break;
                    case 3:
                        System.out.print("Codigo: ");
                        cod = lea.nextInt();
                        presta.pagarCuota(cod);
                        break;
                }
            }
            catch(Exception e){
                System.out.println("ERROR: " + e.getMessage());
            }
        }while(op!=5);
        
        
        
    }
}
