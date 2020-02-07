/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

/**
 *
 * @author BRYANROY
 */
public class ejercicio24 {
    
    public static void main(String[] args){
        int i,s = 0;
        for(i=100;i>=0;i=i-2){
            System.out.print(i+"+");
            s=s+i;
        }
        System.out.println("\n");
        System.out.print("La suma es: "+s+"\n");
    }
}
