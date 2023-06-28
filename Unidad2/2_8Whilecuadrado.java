package com.mycompany.whilecuadrado;

import java.util.Scanner; 
public class Whilecuadrado {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int num, cuadrado;
       
       System.out.println("Introduzca un numero ");
       num = entrada.nextInt();
       
       while (num>=0)
       {
           cuadrado = num*num;
           System.out.println("El cuadrado de " + num + "es igual a " + cuadrado);
           
           System.out.println("");
           System.out.println("Introduce otro numero");
           num = entrada.nextInt();
       }
    }
}
