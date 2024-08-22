
package ejercicios.propuestos;

import java.util.Scanner;


public class Ej2 {
     public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in); 
      double sueldo1;
       System.out.print("Digita el 1er sueldo: ");
       sueldo1=entrada.nextDouble();
       double sueldo2;
       System.out.print("Digita el 2do sueldo: ");
       sueldo2=entrada.nextDouble();
       double sueldo3;
       System.out.print("Digita el 3er sueldo: ");
       sueldo3=entrada.nextDouble();
       double sueldo4;
       System.out.print("Digita el 4to sueldo: ");
       sueldo4=entrada.nextDouble();
       double sueldo5;
       System.out.print("Digita el 5to sueldo: ");
       sueldo5=entrada.nextDouble();
       double sueldot,psueldo;
       sueldot=sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
       psueldo=sueldot/5;
       System.out.println("EL SUELDO TOTAL ES DE: " + sueldot);
        System.out.println("EL SUELDO PROMEDIO ES: " + psueldo);
       }
}
