package com.mycompany.fortablas;

public class Fortablas {

    public static void main(String[] args) {
       int i, j; 
       for(i=1; i<=10; i++)
       {
           System.out.println("Tabla del "+ i);
           System.out.println("--------");
           
           for (j=1; j<=10; j++)
           {
               System.out.println(i + "X" + j + "=" + j*i);
           }
       }
    }
}
