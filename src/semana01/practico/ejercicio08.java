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
public class ejercicio08 {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int N,r;
        System.out.println("Digitar un numero:");
        N=sc.nextInt();
        System.out.println("LA TABLA DE MULTIPLICAR DE "+N+" ES:");
        for(int i=0;i<=12;i++){
            r=i*N;
            
        System.out.println(N+" X "+i+" = "+r);
        }
        
    }
}
