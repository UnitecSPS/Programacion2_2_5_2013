/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

/**
 *
 * @author Docente 17082011
 */
public class Elga {
    public static void main(String[] args) throws Exception {
        Prestamista presta = new Prestamista();
        presta.addPrestamo("Carlos",80000,0.02,12);
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
    }
}
