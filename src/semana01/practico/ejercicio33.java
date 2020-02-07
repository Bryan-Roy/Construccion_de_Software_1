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
public class ejercicio33 {
    
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int n,cont=0,sum=0;
    double prom=0;
    System.out.println("Ingrese un numero entero o Ingrese un negativo para terminar el proceso:");
    do{
       n=sc.nextInt();
       if(n>=0){
       sum=sum+n;
       cont++;
       }
    }while(n>0);
    prom=(float)sum/cont;
    System.out.print("El promedio de los numeros es: "+prom+"\n");
    }
}
