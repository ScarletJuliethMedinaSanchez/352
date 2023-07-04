package com.mycompany.menuswitch2;
import java.util.Scanner;
public class MenuSwitch2 {
  static int op;
    
   
    public static void main(String[] args) 
    {
        menu(op);
    }
public static void Pgr1 ()
{  
    SwitchCalificaciones.calificacion();
} 
public static void Pgr2 ()
{  
    Programacion20.descuento();
}
public static void Pgr3 ()
{   
    Switchcajero.cajero();
} 
    public static void menu(int op){
        
    while (op < 4)
    {
    System.out.println("1. PROGRAMA CALIFICACIONES");
    System.out.println("2. PROGRAMA DESCUENTO");
    System.out.println("3. PROGRAMA CAJERO");
    System.out.println("4. SALIR");
    
    Scanner entrada= new Scanner(System.in);
    System.out.println("Digitalise opción: ");
    op = entrada.nextInt();
    
    switch (op)
    {
        case 1: 
             Pgr1();
        break;
        case 2: 
             Pgr2();
        break;
        case 3: 
             Pgr3();
        break;
        case 4: 
              System.out.println("Hasta luego");
                System.exit(0);
        break;
        default:
                    System.out.println("OPCIÓN NO VALIDA");
        
   }
  }
 }
}