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
public class ejercicio44 {
    
    public static void main(String[] args){
       Scanner Teclado = new Scanner(System.in);
       int n1 = 0,n2 = 0,n3 = 0,n4 = 0;
       int opcion;
       int cont=1;
       int total = 0;


while(cont==1){
    System.out.println("1- Primaria");
    System.out.println("2- Secundaria");
    System.out.println("3- Carrera Tecnica");
    System.out.println("4- Estudios Profesionales");
    System.out.println("Eliga una opcion [1-4]:");
    opcion=Teclado.nextInt();
         if(opcion==1){
           System.out.println("Primaria es:");
           n1=Teclado.nextInt();
           } 
         if(opcion==2){
           System.out.println("Secundaria es:");
           n2=Teclado.nextInt();
           }
         if(opcion==3){
           System.out.println("Carrera tecnica es:");
           n3=Teclado.nextInt();
           }
         if(opcion==4){
           System.out.println("Estudios profesionales es:");
           n4=Teclado.nextInt();
            }
    System.out.println("Desea continuar[1.si/2.no]:");
    cont=Teclado.nextInt();
}
        total=n1+n2+n3+n4;
        int porcentaje_prim=(int)(n1*100)/total;
        int porcentaje_sec=(int)(n2*100)/total;
        int porcentaje_carreratec=(int)(n3*100)/total;
        int porcentaje_estpro=(int)(n4*100)/total;
        
    System.out.println("Estudio primaria"+" representa el "+porcentaje_prim+"%");
    System.out.println("Estudio secundaria"+" representa el "+porcentaje_sec+"%");
    System.out.println("Estudio carrera tecnica"+" representa el "+porcentaje_carreratec+"%");
    System.out.println("Estudios profesionales"+" representa el "+porcentaje_estpro+"%");
    }
}
