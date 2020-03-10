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
public class ejercicio10 {
    
    public static void main(String[] args){
        
     Scanner sc=new Scanner(System.in);
     int n,dato,valormenor = 0;
     System.out.println("Ingrese la cantidad de numeros:");
     n=sc.nextInt();
     for(int i=1;i<=n;i++){
         System.out.print("Ingrese Numero "+i+" : ");
         dato=sc.nextInt();
         if(i==1){
             valormenor=dato;
         }
         if(dato<valormenor)
             valormenor=dato;
   }
     System.out.print("El numero menor es: "+valormenor+"\n");
  }
}
