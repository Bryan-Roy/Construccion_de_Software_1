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
public class ejercicio11 {
    public static void main(String[] args) {
 
         Scanner sc=new Scanner(System.in);
         int alum,x=0,hom=0,muj=0,opc=0;
 
    System.out.println("Cuantos Alumnos desea ingresar: ");
    alum=sc.nextInt();
 
       while(x<alum){
             System.out.println("¿Eres Hombre o mujer?");
             System.out.println("1: Hombre"
                     + "\n2: Mujer"
                     + "\nElige una opcion");
             opc=sc.nextInt();
             switch(opc){
                case 1:
                    System.out.println("Hombre");
                    hom=hom+1;
                    x++;
                    break;
                case 2:
                    System.out.println("Mujer");
                    muj=muj+1;
                    x++;
                    break;
                default:
                   System.out.println("Esa opcion no existe");
                   alum=alum-1;
                   x--;
           }
        }
       System.out.println("Total de Hombres en el salon: "+hom);
       System.out.println("Total de Mujeres en el salon: "+muj);
    }
}
