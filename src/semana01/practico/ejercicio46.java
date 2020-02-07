/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class ejercicio46 {
    
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        float desc,acu=0,m=1,prec=0,total1=0,total2=0,total=0;
        int etiq,n;
        float art;
        String nombre;
        System.out.println("BIENVENIDO A LA TIENDA ENANO S.A.");
        while(m==1){
            System.out.println("Nombre del articulo");
            nombre=cin.next();
            System.out.println("Precio del articulo");
            art=cin.nextFloat();
            System.out.println("Cuantos articulos va a comprar");
            n=cin.nextInt();
            System.out.println("El articulo tiene etiqueta roja?");
            System.out.println("PRESIONAR"+"\n"+"1.SI"+"\n"+"2.NO");
            etiq=cin.nextInt();
            prec=art*n;
            if(etiq==1){
                desc=(float)(prec*0.20);
                prec=prec-desc;
                total1+=prec;
                System.out.println("Precio por los "+n+" "+ nombre +" "+"es: "+"s/"+prec);
                System.out.println("Control de calidad"+" es: "+"s/"+total1);
            }else{
                total2=total2+prec;
                System.out.println("Precio por los "+n+""+ nombre+" "+"es: "+"s/"+prec);
                System.out.println("Control de calidad"+" es: "+"s/"+total2);
            }
            System.out.println("Va seguir comprando?"+"\n"+"1.SI"+"\n"+"2.NO");
            m=cin.nextInt();
        }
        total=total1+total2;
        System.out.println("Cantidad total a pagar es:"+" s/"+total);
    }
}
