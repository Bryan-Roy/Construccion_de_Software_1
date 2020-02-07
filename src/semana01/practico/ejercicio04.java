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
public class ejercicio04 {
    
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       
       int Minuto=60;
       int Segundo=3600;
       
       int m,s;
       System.out.println("Cantidad en horas:");
       int c=sc.nextInt();
       
       m=(c * Minuto);
       s=(c * Segundo);
       
       System.out.println("-----------RESULTADO--------");
       System.out.println("En Minuto es: "+ m +" minutos");
       System.out.println("En Segundo es: "+ s +" segundos");
       System.out.println("----------------------------");
    }
    
}
