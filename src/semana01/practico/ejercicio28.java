/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author BRYANROY
 */
public class ejercicio28 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float tc = 0, pm, s = 0, pa, sm = 0, pg, sg = 0, ptg,c1,c2,c3;
        int g,m = 0,n = 0;
        System.out.println("Digite la cantidad de grupos:");
        g=sc.nextInt();
        for(int i=1;i<=g;i++){
            System.out.println("Digite la cantidad de alumnos del grupo "+i+":");
            n=sc.nextInt();
           for(int j=1;j<=n;j++){
               System.out.println("Digite la cantidad de materias del alumno "+j+":");
               m=sc.nextInt();
           }
               System.out.println("Digite la calificacion 1:");
               c1=sc.nextFloat();
               System.out.println("Digite la calificacion 2:");
               c2=sc.nextFloat();
               System.out.println("Digite la calificacion 3:");
               c3=sc.nextFloat();
               tc=c1+c2+c3;
        }
        pm=tc/3;
        s=s+pm;
        pa=s/m;
        sm=sm+pa;
        pg=sm/n;
        sg=sg+pg;
        ptg=sg/g;
        System.out.println("El promedio total del alumno es:"+pa);
        System.out.println("El promedio total del grupo es:"+pg);
        System.out.println("El promedio total de los grupos es:"+ptg);
    }
}
