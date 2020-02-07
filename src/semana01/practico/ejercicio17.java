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
public class ejercicio17 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int tiemp = 0;
        float prom;
        for(int i=1;i<=10;i++){
            System.out.println("Digite tiempo");
            tiemp=sc.nextInt();
            if(tiemp>16){
                System.out.println("no puedes");
            }else{
                System.out.println("si puedes");
            }
        }
        sum=sum+tiemp;
        prom=sum/10;
        if(prom<=15){
            System.out.print("\n");
            System.out.print("no puedes");
        }else{
            System.out.print("Su promedio es: "+prom+"\n");
            System.out.print("si puedes");
        }
    }
}
