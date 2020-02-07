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
public class ejercicio05 {
    

    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    float a,b;
    float c,f;
    
    System.out.println("Ingrese en Grados Celsius:");
    a=sc.nextFloat();
    System.out.println("Ingrese en Grados Fahrenheit:");
    b=sc.nextFloat();

    f=(float)((a*9/5)+32);
    c=(float)((b-32)*5/9);
    
    System.out.println("EN Fahrenheit: "+f);
    System.out.println("EN Celsius: "+c);

    }
}
