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
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero entero y positivo");
        int numero=sc.nextInt();
        if(primo(numero)){
            System.out.println("Es un numero primo");
        }else{
            System.out.println("No es numero primo");
        }
        
        if(fibonacci(numero)){
            System.out.println("El numero es fibonacci");
        }else{
            System.out.println("El numero no es fibonacci");
        }
        
    }
    public static boolean primo(int n){
       int cont=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cont++;
            }
           
        }
        if(cont==2){
            return true;
        }else{
            return false;
        }
    }
    public static boolean fibonacci(int n){
        int a=0,b=1,c=0;
        boolean valor=true;
        for(int i=0;c<=n;i++){
            if(n==c){
                valor=true;
            }else{
                valor=false;
            }
            a=b;
            b=c;
            c=a+b;   
        }
        return valor;
    }
}
