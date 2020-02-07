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
public class ejercicio34 {
    
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        float mont;
        float montfinal=0;
        float cont=0;
        System.out.println("Ingrese el monto inicial:");
        mont=sc.nextFloat();
        montfinal=mont;
        for(int i=0;i<=12;i++){
            montfinal+=montfinal*0.02;
        }
        System.out.println("Luego de 1 año,el monto paso de s/."+mont+" a s/."+montfinal);
    }
    
}
