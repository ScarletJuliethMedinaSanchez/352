package com.mycompany.gestionarfacturas;
import java.util.Scanner;

public class GestionarFacturas 
{
    public static void main(String[] args) 
    {
        int cantidadFacturas = 5;
        double importeTotal = 0;
        int litrosProducto1 = 0;
        int facturasMayores10000 = 0;
        double maximoFactura = Double.MIN_VALUE;
        double minimoFactura = Double.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= cantidadFacturas; i++) 
        {
            System.out.println("Factura numero: " + i);

            System.out.print("Ingrese el número de factura: ");
            int numeroFactura = scanner.nextInt();

            System.out.print("Ingresa código de producto: ");
            int codigoProducto = scanner.nextInt();

            System.out.print("Ingresa cantidad de litros que compraste: ");
            int cantidadLitros = scanner.nextInt();

            System.out.print("Ingresar precio por litro: ");
            double precioLitro = scanner.nextDouble();

            double importeFactura = cantidadLitros * precioLitro;
            importeTotal += importeFactura;

            if (codigoProducto == 1) 
            {
                litrosProducto1 += cantidadLitros;
            }

            if (importeFactura > 10000) 
            {
                facturasMayores10000++;
            }

            if (importeFactura > maximoFactura) 
            {
                maximoFactura = importeFactura;
            }

            if (importeFactura < minimoFactura) 
            {
                minimoFactura = importeFactura;
            }

            System.out.println(); 
           // Espacio en blanco para separar las facturas
        }

        System.out.println("Resumen de ventas");
        System.out.println("Importe total de las facturas: " + importeTotal);
        System.out.println("Litros comprados del producto 1: " + litrosProducto1);
        System.out.println("Facturas mayores a 10,000: " + facturasMayores10000);
        System.out.println("Valor máximo de las facturas: " + maximoFactura);
        System.out.println("Valor mínimo de las facturas: " + minimoFactura);

       
    }
}