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
public class ejercicio14 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float por1,por2,por3,edad;
        int ani ,x=1,i = 0,mue=0,srng1=0,srng2=0,srng3=0;
        while(x>0){
            System.out.println("Digite el numero correspondiente al animal que desea estudiar"+"\n1.Elefante.\n2.Jirafas.\n3.Chimpances");
            System.out.println("Elija la opcion:");
            ani=sc.nextInt();
            if(ani==1){
                i=5;
                x--;
            }
            else
                if(ani==2){
                    i=15;
                    x--;
                }
            else
                    if(ani==3){
                        i=40;
                        x--;
                    }
        }
        System.out.println("Digite la edad(en anyos)");
        for(int j=1;j<=i;j++){
            mue++;
            System.out.println("Muestra #"+j);
            edad=sc.nextInt();
                if(edad<=1)
                   srng1++;
            else
                if(edad<3)
                   srng2++;
            else
                if(edad>=3)
                    srng3++;
        }
        System.out.print("\n");
        por1=srng1*100/mue;
        por2=srng2*100/mue;
        por3=srng3*100/mue;
        System.out.print("Porncentaje entre 0 y 1 anyo= "+por1+"%"+"\n");
        System.out.print("Porncentaje mayor que  1 y menor que 3 anyo= "+por2+"%"+"\n");
        System.out.print("Porncentaje con 3 o mas anyo= "+por3+"%"+"\n");
    }
}
