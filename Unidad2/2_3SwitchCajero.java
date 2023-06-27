package com.mycompany.switchcajero;

import java.util.Scanner;

public class Switchcajero {

    public static void main(String[] args) 
    //Variables
    {
      final int saldo_inicial=1000;
      int opcion; 
      double ingreso, saldoActual, retiro;
      Scanner entrada = new Scanner (System.in);
      
      System.out.println("1. Ingresar dinero a la cuenta");
      
      System.out.println("2. Retirar dinero a la cuenta");
      
      System.out.println("3. Salir");
      
      System.out.println("Ingresar un numero");
      opcion = entrada.nextInt();
      
      switch(opcion)
      {
          case 1:
              System.out.println("Digite la cantidad vas a ingresar");
              ingreso = entrada.nextDouble();
              saldoActual = saldo_inicial+ingreso;
              System.out.println("El saldo actual es: " + saldoActual);
            break;
          case 2:
              System.out.println("Digite la cantidad deseas retirar");
              retiro = entrada.nextDouble();
              if(retiro<=saldo_inicial)
              {
                saldoActual = saldo_inicial-retiro;
                System.out.println("El saldo actual es: " + saldoActual);
              }
              else
              {
                  System.out.println("No cuenta con el saldo suficiente");
              }
            break;
          case 3:
          default:
      }
    }
}
