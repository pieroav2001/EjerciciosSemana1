
package ejercicios.propuestos;

import java.util.Scanner;


public class EjerciciosPropuestos {

   
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in); 
       String cliente;
       System.out.print("Digita el nombre del cliente: ");
       cliente=entrada.next();
       String producto;
       System.out.print("Digita el producto del cliente: ");
       producto=entrada.next();
       double precio;
       System.out.print("Digita el precio del producto: ");
       precio=entrada.nextDouble();
       double cantidad;
        System.out.print("Digita la cantidad del producto:");
       cantidad=entrada.nextDouble();
       double igv,stotal,tpagar;
       
       stotal = precio*cantidad;
       igv = stotal * 0.18;
       tpagar = stotal + igv;
       System.out.println("Subtotal: " + stotal);
        System.out.println("IGV (18%): " + igv);
        System.out.println("Total a Pagar: " + tpagar);
    }
       
    
    
    
}
