package Programacion5_1;

import java.util.Scanner;


public class FuncMayorEdad {


    public static void main(String[] args) {
        
                //Declaracion de variables
        Scanner Entrada = new Scanner(System.in);
        int edad;
        //Entrada de datos
        System.out.println("Dame tu edad: ");
        edad = Entrada.nextInt();
        //Salida
        System.out.println(retornaEdad(edad));
        
    }
    
        public static String retornaEdad( int numero){
        //Declaracion de variables 
        int mayor;
        
        //Procesamiento 
        mayor = numero;
        
        //Salida de datos
        if(mayor >= 18){
            return "Mayor de edad";
        }
        
        else if (mayor <= 17){
          
        }
        
            return "Menor de edad";
        }
}