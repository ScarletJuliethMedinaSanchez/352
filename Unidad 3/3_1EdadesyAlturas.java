package com.mycompany.edadesyalturas;

import java.util.Scanner;


public class EdadesyAlturas {

   
    public static void main(String[] args) {
     //Inicializar variables
        Scanner entrada= new Scanner(System.in);
        int edad, media_edad, suma_edad, mayor_edad, meyor_175;
        double altura, media_altura, suma_altura;
        //Iniciar variables
        mayor_edad=0; media_altura=0; int mayor_175 = 0; 
        suma_edad=0; suma_altura=0;
        
        //Proceso
        for (int i=1; i < 5; i++){
        System.out.println("*******");
        System.out.println("* Alumno No."+ i +"     *");
        System.out.println("+ Introduzca la edad:     *");
        edad=entrada.nextInt();
        System.out.println("*Introduzca la altura:   *");
        altura = entrada.nextDouble();
        if(edad >=18){
            mayor_edad++;
        }
        if(altura>1.75){
            mayor_175++;
        }
        suma_edad=suma_edad+edad;
        suma_altura=suma_altura+altura;
        }//Termina ciclo For
       media_edad=suma_edad/5;
       media_altura=suma_altura/5;
       //Salida de Datos
       System.out.println("* La edad mesdia es de:   " + media_edad + "*");
       System.out.println("* La altura media es de:  " + media_altura + "*");
       System.out.println("* Cantidad > 18: " + mayor_175 + "*");
       System.out.println("* Cantidad > 1.75: " + mayor_175 + "*");
    }
}  