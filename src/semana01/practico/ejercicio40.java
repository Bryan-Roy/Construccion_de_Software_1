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
public class ejercicio40 {
    
    public static void main(String[] args){
       Scanner leer=new Scanner(System.in);
       int offset=0,offset1 = 0,offset2,standar=0,standar2,standar1 = 0,resultado = 0,resultado1;
       System.out.println("Bienvenido al programa de control de impresion");
       while(resultado==0){
           System.out.println("Presiona (1) si la impresion es offset o presiona (2) si la impresion es Standar");
           resultado1=leer.nextInt();
           if(resultado1==1){
               System.out.println("Cuantas copias offset desea:");
               offset=leer.nextInt();
             if(offset<=10000){
             offset1+=offset;
             offset2=10000-offset1;
             System.out.println("Impresion en proceso");
             System.out.println("Recuerda que te quedan "+offset2+" impresiones offset disponibles");
            }
           }
           if(offset>10000){
            System.out.println("Estas tratando de exeder el limite permitido ya no puedes sacar mas impresiones");
           }
           if(resultado1==2){
               System.out.println("Cuantas copias Standar desea:");
               standar=leer.nextInt();
               if(standar<=50000){
                   standar1+=standar;
                   standar2=50000-standar1;
                   System.out.println("Impresion en proceso");
                   System.out.println("Recuerda que te quedan "+standar2+" impresiones standar disponbles");
               }
           }
           if(standar>50000){
               System.out.println("Estas tratando de exeder el limite permitido ya no puedes sacar mas impresiones");
           }
           System.out.println("Escribe 0 si todavia existen solicitudes por atender o Escribe 3 si ya haz acabado de atender las solicitudes");
           resultado=leer.nextInt();
       }
    }
}
