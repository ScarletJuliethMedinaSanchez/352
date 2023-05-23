/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author scarl
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
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