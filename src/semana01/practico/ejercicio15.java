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
public class ejercicio15 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        float suma=0;
        float kl,vkl,tp=0;
        float desc=0,gt=0,gtot=0;
        for(int i=-1;i<15;i++){
            System.out.println("Cuantos Kilos compraste:");
            kl=sc.nextInt();
            System.out.println("Ingrese valor del kilo");
            vkl=sc.nextInt();
            if(kl>10){
                tp=kl*vkl;
                desc=(float)(tp*0.15);
                gt=(float)(tp-desc);
                System.out.println("Su total a pagar es "+gt);
            }else{
                gt=(float)(kl*vkl);
                System.out.println("Su total a pagar es "+gt);
            }
            suma=(float)(suma+gt);
        }
         System.out.print("\n");
         gtot=(float)(gt*gt);
         System.out.print("Las ganancias de la tienda son: "+gtot+"\n");
    }
}
