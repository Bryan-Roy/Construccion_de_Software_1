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
public class ejercicio23 {
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n,cal,pesG = 0,alG = 0,numH = 0,acu=0;
        float acu2 = 0,p1 = 0;
        System.out.println("Ingrese el numero de gallinas:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("GALLINA #"+i);
            System.out.println("Ingrese el peso de la gallina #"+i+":");
            pesG=sc.nextInt();
            System.out.println("Ingrese la altura de la gallina #"+i+":");
            alG=sc.nextInt();
            System.out.println("Ingrese el numero de huevos que pone la gallina #"+i+":");
            numH=sc.nextInt();
            cal=(pesG*alG)/numH;
            acu=acu+cal;
            acu2=(float)(acu2+acu)/n;
            if(acu>=15){
                p1=(float) (1.2*acu2);
            }
            else{
                if(acu>8 && acu<15){
                    p1=(float)(1.00*acu2);
                }else{
                    if(acu<=8){
                        p1=(float)(0.80*acu2);
                    }
                }
            }
        }
        System.out.print("EL precio por kilo de huevo es: "+p1+"$"+"\n");
    }
}
