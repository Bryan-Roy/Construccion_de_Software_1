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
public class ejercicio8_1 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pago,sueldo,horas,traba;
        System.out.println("Ingrese el sueldo por una hora de trabajo:");
        sueldo=sc.nextInt();
        System.out.println("Ingrese el numero de trabajadores");
        traba=sc.nextInt();
        for(int i=1;i<=traba;i++){
            System.out.println("Ingrese las horas trabajadas");
            horas=sc.nextInt();
            pago=0;
            if(horas<=40){
                pago=horas*sueldo;
                System.out.println("Sueldo total"+pago);
            }else{
                if(horas>40 && horas<80){
                    sueldo=sueldo*2;
                    pago=horas*sueldo;
                    System.out.println("Sueldo total"+pago);
                }else{
                    if(horas>=80){
                        sueldo=sueldo*3;
                        pago=horas*sueldo;
                        System.out.println("Sueldo total: "+pago);
                    }
                }
            }
        }
    }
}
