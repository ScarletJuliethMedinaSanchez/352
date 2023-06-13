package programacion6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecedenciaOperadores {

    static double a=0, b=0, c=0, d=0, e=0, f=0, 
            g=0, h=0, j=0, m=0, n=0, p=0, q=0, 
            r=0, s=0, x=0, y=0;
    
    public static void main(String[] args) {
       pedirDatos();
       calculaOperaciones(a,b,c,d,e,f,g,h,j,m,n,x,y);  
    
    } 
       
 public static void pedirDatos(){
        
      Scanner numero = new Scanner(System.in);
    
   System.out.println("Asigna los valores.");
             
    
                System.out.println("Valor de A: "); 
                a = numero.nextInt();
            
                System.out.println("Valor de B: ");  
                b = numero.nextInt();
            
                System.out.println("Valor de C: "); 
                c = numero.nextInt();
            
                System.out.println("Valor de D: ");
                d = numero.nextInt();
            
                System.out.println("Valor de E: "); 
                e = numero.nextInt();
           
                System.out.println("Valor de F: ");  
                f = numero.nextInt();
            
                System.out.println("Valor de G: ");  
                g = numero.nextInt();
            
                System.out.println("Valor de H: ");
                h = numero.nextInt();
           
            
                System.out.println("Valor de J: "); 
                j = numero.nextInt();
            
                System.out.println("Valor de M: "); 
                m = numero.nextInt();
            
                System.out.println("Valor de N: "); 
                n = numero.nextInt();
            
                System.out.println("Valor de S: "); 
                s = numero.nextInt();    
           
                System.out.println("Valor de P: "); 
                p = numero.nextInt();  
            
                System.out.println("Valor de Q: "); 
                q = numero.nextInt(); 
            
                System.out.println("Valor de R: "); 
                r = numero.nextInt(); 
            
                System.out.println("Valor de X: "); 
                x = numero.nextInt(); 
            
                System.out.println("Valor de Y: "); 
                y = numero.nextInt(); 
 
 }          
 private static void calculaOperaciones(double a, double b, double c, double d, 
         double e, double f, double g, double h, double j, double m, double n, double x, double y) {
     DecimalFormat df = new DecimalFormat (".00");   

   
     
                   // IncisoA 
                    double calcularA;
                    calcularA=(3/2) + (4/3);
                    System.out.println("a) "+ df.format (calcularA));                   

//********** IncisoB
                    double calcularB;
                       calcularB= (1/(x-5)) - ((3*x*y)/4);
                    System.out.println("b) "+ df.format (calcularB));

//********** IncisoC
                    double calcularC;
                       calcularC= ((1/2)+7);
                    System.out.println("c) "+ df.format ( calcularC));

//********** IncisoD
                    double calcularD;
                       calcularD=(7 + (1/2));
                    System.out.println("d) "+ df.format ( calcularD));

//********** IncisoE
                    double calcularE;
                       calcularE= (((a*a) / (b-c))+ (d-e) / (f-((g*h) / j)));
                    System.out.println("e) "+ df.format ( calcularE));

//********** IncisoF
                    double calcularF; 
                       calcularF= ((m/n)+p);
                    System.out.println("f) "+ df.format (calcularF));

//********** IncisoG
                    double calcularG; 
                       calcularG= (m+(n/(p-q)));
                    System.out.println("g) "+ df.format (calcularG));

//********** IncisoH
                    double calcularH; 
                       calcularH = (((a*a)/(b*b)) + ((c*c)/(d*d)));
                    System.out.println("H) "+ df.format (calcularH));

//********** Incisoi
                    double calcularI; 
                       calcularI = (m /(n/p)) / (q-(r/s));
                    System.out.println("i) "+ df.format (calcularI));


//********** IncisoJ
                    double calcularJ; 
                       calcularJ = ((3*a)+b)/((c-(d+(5*e)) / (f+(g/(2*h)))));
                    System.out.println("j) "+ df.format (calcularJ));

//********** IncisoK
                    double calcularK; 
                       calcularK = (Math.pow(a,2) + (2*a*b) + Math.pow(b,2))/(1/Math.pow(x,2)+2);
                    System.out.println("k) "+df.format ( calcularK));        
     }
    }