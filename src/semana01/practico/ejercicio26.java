/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class ejercicio26 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float sp=0,sd=0,vp;
        int pc,n;   
        do{
            System.out.println("Ingrese 1 si compro articulos o 2 para salir");
            n=sc.nextInt();
            if(n==1){
                System.out.println("Ingrese la cantidad de productos comprados:");
                pc=sc.nextInt();
                System.out.println("La cantidad de productos comprados: "+pc);
                for(int x=1;x<=pc;x++){
                    System.out.println("Ingrese el valor del producto");
                    vp=sc.nextFloat();
                    System.out.println("el valor del producto es:"+"\n"+"$"+vp);
                    sp=sp+vp;
                }
                System.out.println("la suma de los productos es:"+"$"+sp);
                sd=sd+sp;
            }
        }while(n==1);
        System.out.println("La suma del dia es:"+"$"+sd);
                
    }
            
}
