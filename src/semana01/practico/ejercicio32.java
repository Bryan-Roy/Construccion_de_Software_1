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
public class ejercicio32 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int nven,contador;
        float sbase,comv1,comv2,comv3,stot,v1,v2,v3,tcom,tven,sto;
        nven=0;
        contador=0;
        System.out.println("Cual es el numero de vendedores:");
        nven=sc.nextInt();
        System.out.println("Cual es el sueldo base de los empleados:");
        sbase=sc.nextInt();
        while(contador<nven){
            System.out.println("Ingrese el valor de la primera venta:");
            v1=sc.nextInt();
            System.out.println("Ingrese el valor de la segunda venta:");
            v2=sc.nextInt();
            System.out.println("Ingrese el valor de la tercera venra:");
            v3=sc.nextInt();
            comv1=(float) (v1*0.10);
            comv2=(float) (v2*0.10);
            comv3=(float) (v3*0.10);
            sto=v1+v2+v3+comv1+comv2+comv3+sbase;
            tcom=comv1+comv2+comv3;
            tven=v1+v2+v3+tcom;
            System.out.println("");
            System.out.println("El sueldo total de este empleado es:"+sto);
            System.out.println("El valor total por comisiones es de:"+tcom);
            System.out.println("El valor total de comisiones y ventas es de:"+tven+"\n");
            contador++;
        }    
    }
}
