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
public class ejercicio12 {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int cal,suma=0;
    int p;
    for(int i=1;i<=50;i++){
      System.out.print("Introduce calificacion: "+i+" : ");
      cal=sc.nextInt();
      if(cal<70)
          suma=suma+cal;
    }
    p=(suma*100)/50;
    System.out.print("El porcentaje de reprobados es: "+p+"%"+"\n"); 
  }
}
