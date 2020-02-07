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
public class ejercicio29 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        float precio;
        int ar,cantidad;
        System.out.println("Ingrese el numero de productos comprados");
        ar=sc.nextInt();
        int total_final=0;
        int st=0;
        for(int i=1;i<=ar;i++){
            System.out.println("Digite la cantidad comprada del producto "+i);
            cantidad=sc.nextInt();
            for(int j=1;j<=cantidad;j++){
                System.out.println("Digite el precio del producto");
                precio=sc.nextFloat();
                st=(int) (precio*cantidad);
            }
            System.out.println("El costo total de la compra "+i+" es: "+st+"\n");
            total_final=total_final+st;
        }
        System.out.println("El costo final total de la compra es:"+total_final);
    }
}
