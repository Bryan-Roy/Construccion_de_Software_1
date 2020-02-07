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
public class ejercicio25 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int calificaciones,n,acu=0;
        String nom;
        float prom = 0;
        System.out.println("Ingresar la cantidad de alumnos que desea registrar:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
         System.out.println("Alumno #"+i+":");
         System.out.print("Nombre: ");
         nom=sc.next();
         System.out.print("Calificacion: ");
         calificaciones=sc.nextInt();
         acu=acu+calificaciones;
        }
        prom=(float)((prom+acu)/n);
        System.out.println("");
        System.out.print("El promedio de calificaciones es: "+prom+"\n");
    }
}
