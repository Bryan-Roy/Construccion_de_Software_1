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
public class ejercicio22 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,j = 0,num,edad,edad_mu,edad_hom,cantidadMu,cantidadHom;
        float prom_mu,prom_hom;
        String sexo;
        x=0;
        
        edad_mu=0;
        edad_hom=0;
        
        cantidadMu=0;
        cantidadHom=0;
        
        System.out.println("Dar el numero de alumnos a introducir");
        num=sc.nextInt();
        while(x<num){
            System.out.println("Escribir F para indicar sexo femenino o una M para indicar sexo masculino");
            sexo=sc.next();
            char[]sexo_df=sexo.toCharArray();
            System.out.println("Dar la edad");
            edad=sc.nextInt();
            if(sexo_df[j] == 'F'){
                edad_mu=edad_mu+edad;
                cantidadMu=cantidadMu+1;
            }else{
                if(sexo_df[j]== 'M'){
                    edad_hom=edad_hom+edad;
                    cantidadHom=cantidadHom+1;  
                }else{
                    System.out.println("No se introdujo correctamente el tipo de sexo");
                }
            }
            x++;
        }
        prom_mu=(edad_mu/cantidadMu);
        prom_hom=(edad_hom/cantidadHom);
        
        System.out.print("El promedio de edades de alumnas es de:"+prom_mu+"\n");
        System.out.print("El promedio de edades de alumnos es de:"+prom_hom+"\n");
    }
}
