/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refactorizar;

/**
 *
 * @author lgarcia
 */
public class Refactorizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
void imprimePie() {
     double iva, total;
     System.out.println ("Base Imponible:  "+ baseimp);
     iva = baseimp*porcentaje_iva/100;
     total = baseimp + iva;
     System.out.println ("IVA:             "+ iva);
     System.out.println ("Total Factura:   "+ total);
 }

 void imprimeFactura() {
    imprimeEncabezado();

    //imprime los detalles
    System.out.println ("Nombre:        " +  nombre );
    System.out.println ("Cantidad       " + getCantidad());
    imprimePie();
}
 





    
}
