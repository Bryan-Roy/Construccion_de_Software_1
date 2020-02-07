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
public class principal {
     
    public static void main(String[] args){
        Scanner numero=new Scanner(System.in);
        int num1,num2;
        System.out.println("Digite el primer numero:");
        num1=numero.nextInt();
        System.out.println("Digite el segundo numero:");
        num2=numero.nextInt();
        
        ejercicio01 op=new ejercicio01();
        
        op.sumar(num1, num2);
        op.multiplicar(num1, num2);
        op.dividir(num1, num2);
        op.imprimir();
    }
}
