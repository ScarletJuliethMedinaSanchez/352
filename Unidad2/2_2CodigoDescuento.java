package com.mycompany.programacion20;

import java.util.Scanner;

public class Programacion20 {

    public static void main(String[] args) {
        //Definicion de variables
        double PV = 1000;
        Scanner entrada = new Scanner(System.in);
        int descuento = 0;
        double precioFinal;
        String codPromocion;
        
        //Entrada de datos
        
        System.out.println("Su total de compra es: $" + PV + "\n");
        System.out.println("Tienes un codigo de descuento escribelo");
        codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();
         
        //Proceso
        
        //Salida de datos
        switch(codPromocion)
        {
            case "PLATINOOCTUBRE":
               descuento = 20;
               break; 
               
            case "SILVEROCTUBRE":
                descuento = 50; 
                break;
             
            case "BRONCEOCTUBRE":
                descuento = 35;
                break;
                
            case "OROOCTUBRE":
                descuento = 75;
                break;    
                
            default:
                System.out.println("Ha sido introducido un codigo de descuento");
        }
        
        precioFinal = PV - (PV * descuento / 100); // Restar el descuento al precio original
        System.out.println("El total con el descuento aplicado es: $" + precioFinal);

    }
}
