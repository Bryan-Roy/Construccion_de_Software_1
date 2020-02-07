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
public class ejercicio42 {
    
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        float cat1=0,cat2=0,cat3=0,cat4=0,cat5=0,precio;
        float mont1=0,montT1=0,mont2=0,montT2=0,mont3=0,montT3=0,mont4=0,montT4=0,mont5=0,montT5 = 0;
        int edad;
        int m=1;
        System.out.println("BIENVENIDO AL SISTEMA TEATRAL");
        while(m==1){
            System.out.println("Digite la edad de la persona:");
            edad=n.nextInt();
            if(edad>=5){
                System.out.println("Digite el precio de entrada:");
                precio=n.nextInt();
                if(edad>=5 && edad<=14){
                    cat1=(float)(precio*0.35);
                    mont1=precio-cat1;
                    montT1+=mont1;
                }
                if(edad>=15 && edad<=19){
                    cat2=(float)(precio*0.25);
                    mont2=precio-cat2;
                    montT2+=mont2;
                }
                if(edad>=20 && edad<=45){
                    cat3=(float)(precio*0.10);
                    mont3=precio-cat3;
                    montT3+=mont3;
                }
                if(edad>=46 && edad<=65){
                    cat4=(float)(precio*0.25);
                    mont4=precio-cat3;
                    montT4+=mont4;
                }
                if(edad>=66){
                    cat5=(float)(precio*0.35);
                    mont5=precio-cat5;
                    montT5+=mont5;
                }
            }else{
                System.out.println("La edad de la persona es menor de 5 años no puede ingresar");
            }
            System.out.println("1.Si desea continuar"+"\n"+"2.Si desea salir");
            m=n.nextInt();
        }
        System.out.println("la categoria 1 obtuvo s/"+montT1);
        System.out.println("la categoria 2 obtuvo s/"+montT2);
        System.out.println("la categoria 3 obtuvo s/"+montT3);
        System.out.println("la categoria 4 obtuvo s/"+montT4);
        System.out.println("la categoria 5 obtuvo s/"+montT5);
    }
}
