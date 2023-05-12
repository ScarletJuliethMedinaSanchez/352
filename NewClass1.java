package com.mycompany.NewClass1;
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = input.nextInt();
        if (num % 3 == 0) {
            System.out.println("tri");
        }
         if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("trifi");
        }
         if (num % 5 == 0) {
            System.out.println("fvi");}
    }
}
