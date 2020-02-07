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
public class ejercicio35 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int g,tipo;
        float montProm=0,montT = 0;
        do{
        System.out.println("1. TIPO A");
        System.out.println("2. TIPO B");
        System.out.println("3. TIPO C");
        System.out.println("4. TIPO D");
        System.out.println("INGRESE EL TIPO:");
        tipo=sc.nextInt();
        
            if(tipo==1){
                System.out.println("Cantidad de galones que desea comprar:");
                g=sc.nextInt();
                if(g>0){
                    montProm=g*(3785*50);
                    montT+=montProm;
                    System.out.println("Monto a pagar por cliente:"+montProm);
                }
            }
            if(tipo==2){
                System.out.println("Cantidad de galones que desea comprar:");
                g=sc.nextInt();
                if(g>0){
                    montProm=g*(3785*50);
                    montT+=montProm;
                    System.out.println("Monto a pagar por cliente:"+montProm);
                }
            }
            if(tipo==3){
                System.out.println("Cantidad de galones que desea comprar:");
                g=sc.nextInt();
                if(g>0){
                    montProm=g*(3785*50);
                    montT+=montProm;
                    System.out.println("Monto a pagar por cliente:"+montProm);
                }
            }
        }while(tipo!=4);
        
        System.out.println("El monto total recaudado por gasolinera es: "+montT);
    }
}
