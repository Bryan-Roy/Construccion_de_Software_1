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
public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num;
        int acu=0;
        System.out.println("Ingrese nro: ");
        num=sc.next();
        int i=num.length()-1;
        while(i>=0){
            acu+=Integer.parseInt(num.charAt(i)+"");
            i--;
        }
        System.out.println("La suma de digitos de "+ num +" es: "+ acu);
    }
}
