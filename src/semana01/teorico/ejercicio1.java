/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.teorico;

import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class ejercicio1 {
        
    public static void main(String[] args) {
        Scanner digito = new Scanner(System.in);
        int s=0;
        System.out.println("Ingrese el digito");
        int n= digito.nextInt();
        
        while(n>0){
            s=s+n%10;
            n=n/10;   
        }
        System.out.println("La suma de sus digitos es: "+s);
    }
}

