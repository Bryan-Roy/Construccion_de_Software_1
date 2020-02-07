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
public class ejercicio30 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mayor=0;
        int not=0;
        int i;
        for(i=1;i<=5;i++){
            System.out.println("Ingrese el promedio del control "+i+":");
             not=sc.nextInt();
            if(not>mayor){
                mayor=not;
                not=mayor;
            }
     }
        System.out.println("EL promedio mayor es:"+not);  
    }
}
