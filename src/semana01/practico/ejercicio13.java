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
        for(i=0;i<5;i++){
            System.out.println("Inserte candidato");
            dato=sc.nextInt();
        if(dato==1){
            a++;
        }if(dato==2){
            b++;
        }else{
            c++;
        }
    }
        if(a>b && a>c){
            System.out.print("Candidato ganador es 1 con: "+a+"\n");
        }
        if(b>a && b>c){
            System.out.print("Candidato ganador es 1 con: "+b+"\n");
        }
        if(c>b && c>a){
            System.out.print("Candidato ganador es 1 con: "+c+"\n");
        }
  }
}
