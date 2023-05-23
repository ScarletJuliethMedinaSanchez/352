package programacion3;

import java.util.Scanner;



public class V3TRIFIV {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        int numero; 
        
        System.out.println("Dame el numero");
        
        numero = entrada.nextInt();
        
        //Salida de datos
        
        retornaMultiplo(numero);
    }
    public static String retornaMultiplo(int num){
        
        //Declaracion de variables
        
       int mult3, mult5; 
       
       //Procesamiento de datos
       
       mult3 = num % 3;
       mult5 = num % 5;
       
       //Salida de datos
       
       if (mult3 == 0 && mult5 == 0){
           return "TRIFIV";
       }
       else if (mult3 == 0 )
       {
           return "TRI";
       }
       
         else if (mult5 == 0){
             return "FIV";
         } 
             
       
        return " Ningun caso"; 
    }
}
