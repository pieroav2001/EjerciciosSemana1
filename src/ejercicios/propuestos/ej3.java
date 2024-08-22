
package ejercicios.propuestos;

import java.util.Scanner;


public class ej3 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in); 
      String empleado;
       System.out.print("Digita el nombre del empleado: ");
       empleado=entrada.next();
       String cargo;
       System.out.print("Digita el cargo del empleado: ");
       cargo=entrada.next();
       double ingreso;
       System.out.print("Digita su ingreso: ");
       ingreso=entrada.nextDouble();
       double gasto;
       System.out.print("Digita su gasto: ");
       gasto=entrada.nextDouble();
       double amensual,abimestral,asemestral,aanual;
       
       amensual=ingreso-gasto;
       abimestral=amensual*2;
       asemestral=amensual*6;
       aanual=amensual*12;
       System.out.println("Ahorro mensual: " + amensual);
        System.out.println("Ahorro bimestral: " + abimestral);
        System.out.println("Ahorro semestral: " + asemestral);
         System.out.println("Ahorro anual: " + aanual);
      }
}
