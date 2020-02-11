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
public class ejercicio5_2 {
    
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int cobro=0,horas;
        System.out.println("Ingrese el valor de horas");
        horas=leer.nextInt();
        if(horas<=2){
            cobro=horas*5;
        }
        if(horas>2 && horas<=5){
            cobro=2*5+(horas-2)*4;
        }
        if(horas>10){
            cobro=2*5+3*4+3*5+(horas-10)*2;
        }
        System.out.println("Valor de cobro es:"+"\n"+"s/."+cobro);
    }
}
