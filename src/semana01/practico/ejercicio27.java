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
public class ejercicio27 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int peso_ult,bas = 0,total_peso,pro_bas;
        int cont,i=1,acu=0;
        for(i=1;i<=5;i++){
            System.out.println("Cual es el peso de la ultima vez:");
            peso_ult=sc.nextInt();
            for(cont=1;cont<=10;cont++){
                System.out.println("Introduzca el peso en la bascula #"+cont+":");
                bas=sc.nextInt();
                acu=(acu+bas);
            }
            pro_bas=acu/10;
            total_peso=pro_bas-peso_ult;
            if(total_peso>0){
                System.out.print("Subio de peso y la cantidad de kilos que subio es: "+total_peso+"Kilos"+"\n");
            }else{
                System.out.print("Bajo de peso y la cantidad de kilos que bajo es: "+total_peso+"Kilos"+"\n");
            }
        }

    } 
}
