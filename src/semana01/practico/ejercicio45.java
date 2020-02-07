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
public class ejercicio45 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int  n1,n2,n3,m=0;
        n1=(int)(Math.random()*100);
        n2=(int)(Math.random()*100);
        n3=(int)(Math.random()*100);
        while(m==0){
        System.out.println("-------VOTACIONES--------");
        System.out.print("PERSONAS VOTANTES DEL NORTE: "+n1+"\n");
        System.out.print("PERSONAS VOTANTES DEL SUR: "+n2+"\n");
        System.out.print("PERSONAS VOTANTES DEL CENTRO: "+n3+"\n");
        System.out.println("PRESIONE 1 PARA LOS RESULTADOS");
        m=sc.nextInt();
      }
        System.out.println("-------RESULTADOS----------");
         if(n1>n2 && n1>n3){
            System.out.println("La Seccion con mayor voto es norte con: "+n1+" votos");
        }
        if(n2>n1 && n2>n3){
            System.out.println("La Seccion con mayor voto es sur con: "+n2+" votos");
        }
        if(n3>n1 && n3>n2){
            System.out.println("La Seccion con mayor voto es centro con: "+n3+" votos");
        }
    }
}

