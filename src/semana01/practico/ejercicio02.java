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
public class ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int numero1= n1.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2= n2.nextInt();
        
        int sum=0;
        sum=numero1+numero2;
        
        System.out.println("La suma de los numeros es: "+sum);
        
    }
    
}
