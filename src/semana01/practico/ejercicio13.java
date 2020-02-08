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
public class ejercicio13 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,i,dato;
        for(i=0;i<50;i++){
            dato=(int)(Math.random()*(3-1+1)+1);
            System.out.println("Inserte candidato "+dato);
            //dato=sc.nextInt();
        if(dato==1){
            a++;
        }if(dato==2){
            b++;
        }if(dato==3){
            c++;
        }
    }
        if(a>b && a>c){
            System.out.print("Candidato ganador es 1 con: "+a+"\n"+c+"   "+b);
        }
        if(b>a && b>c){
            System.out.print("Candidato ganador es 2 con: "+b+"\n"+c+" "+b);
        }
        if(c>b && c>a){
            System.out.print("Candidato ganador es 3 con: "+c+"\n"+a+" "+b);
        }
  }
}
