/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04desafio;

/**
 *
 * Nicolas Fabian Zuñiga Estrada
 */
import java.util.Scanner;

public class S04Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Mensaje de bienvenida del usuario
       System.out.println("Bienvenido a la Aplicacion de Productos:");
       System.out.println();
       
       //Crear un objeto tipo Scanner con identificador sc
       Scanner sc = new Scanner(System.in);
       
       double cantidad = sc.nextDouble();
       double precio = sc.nextDouble();
      
              //obtener el subtotal del usuario
       
       System.out.print("Ingrese Nombre del Producto 1:   ");
       System.out.print("Ingrese Cantidad:   ");
       System.out.print("Ingrese Precio:   ");
       
       double subtotal = cantidad * precio;
               
       
       
       double impuesto = subtotal * 0.18;
       double total = subtotal + impuesto;
          
       //Mostrar el total de factura
       String mensaje = "Total Factura:    " + total +  "\n";
       System.out.println(mensaje);
    }
    
}
