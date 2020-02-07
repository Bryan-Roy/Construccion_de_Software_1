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
public class ejercicio16 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int menos=0;
        int mas=0;
        int ptc,ppc = 0,ma= 0,me = 0,c = 0;
        
        for(int i=1;i<=25;i++){
            System.out.println("Ingrese el total de puntos contaminantes del auto");
            ptc=sc.nextInt();
            ppc = ppc+ptc;
            if(c==1){
                me=ptc;
                ma=ptc;
            }
            else{
                if(ptc<me){
                    me=ptc;
                }
                if(ptc>ma){
                    ma=ptc;
                }
            }
        }
        ppc=ppc/5;
        System.out.println("El promedio es: "+ppc);
        System.out.println("Menores puntos contaminantes: "+me);
        System.out.println("Mayores puntos contaminantes: "+ma);
    }
}
