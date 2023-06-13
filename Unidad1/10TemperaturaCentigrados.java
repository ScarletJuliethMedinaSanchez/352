package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mavenproject2 {

    public static void main(String[] args)throws IOException {
        int tp;
        
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader (System.in));
                // Entrada de datos
                System.out.println("Dame la temperatura en centigrados");
                tp = Integer.parseInt(bufEntrada. readLine ());
                                   
                if(tp<=10)
                { 
                    System.out.println("Frio");
                }
                else if (tp>10 && tp<=20)
                {
                   System.out.println("Nublado"); 
                }
               else if (tp>20 && tp<=30)
               {
                System.out.println("Caluroso");   
               }
               else if (tp>30)
               {
                System.out.println("Tropical");   
               }   
    }
}
