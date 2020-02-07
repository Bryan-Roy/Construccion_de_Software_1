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
public class ejercicio06 {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int n1,n2,n3,n4,suma;
    
    
    System.out.println("Ingresa numero 1:");
    n1=sc.nextInt();
    System.out.println("Ingresa numero 2:");
    n2=sc.nextInt();
    System.out.println("Ingrese numero 3:");
    n3=sc.nextInt();
    System.out.println("Ingrese numero 4:");
    n4=sc.nextInt();
    
    suma=n1+n2+n3+n4;
    
    int Porcentaje_NUM1=(int)(n1*100)/suma;
    int Porcentaje_NUM2=(int)(n2*100)/suma;
    int Porcentaje_NUM3=(int)(n3*100)/suma;
    int Porcentaje_NUM4=(int)(n4*100)/suma;
    
    System.out.println("la variable Numero 1"+" representa el "+Porcentaje_NUM1+" % de "+suma);
    System.out.println("la variable Numero 2"+" representa el "+Porcentaje_NUM2+" % de "+suma);
    System.out.println("la variable Numero 3"+" representa el "+Porcentaje_NUM3+" % de "+suma);
    System.out.println("la variable Numero 4"+" representa el "+Porcentaje_NUM4+" % de "+suma);
    
    }
    
}
