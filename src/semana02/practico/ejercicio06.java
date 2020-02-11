/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.practico;

import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class ejercicio06 {
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int suma,f,valor,promedio,x;
        suma=0;
        do{
            System.out.println("Ingrese valor:");
            valor=teclado.nextInt();
            suma+=valor;
            System.out.println("ELIJA OPCION:"+"\n"+"1.Continuar"+"\n"+"2.Salir");
            x=teclado.nextInt();
        }while(x!=2);
        System.out.println("La suma es:"+suma);
        promedio=suma/10;
        System.out.println("El promedio es:"+promedio);
    }
}
