package programacion8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeterminaEtapas {
     public static void main(String[] args)throws IOException{ 
        //Declaracion de variables
        int edad;
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader (System.in));
                // Entrada de datos
                System.out.println("Ingrsa tu edad");
                edad = Integer.parseInt(bufEntrada. readLine ());
                //Procesamiento de datos
              if(edad>=0 && edad<=4)
                { 
                    System.out.println("Infante");
                }
                else if (edad>=5 && edad<=17)
                {
                   System.out.println("Niño o adolscente"); 
                }
               else if (edad>18 && edad<=100)
               {
                System.out.println("adulto");   
               } 
              else if (edad<0)
               {
                System.out.println("No se pueden edades negativas");   
               }    
    }
}
