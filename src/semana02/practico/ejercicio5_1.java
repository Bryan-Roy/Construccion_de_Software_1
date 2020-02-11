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
public class ejercicio5_1 {
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        float tela,costopt,modelo,talla,venta=0,ganancia=0,pventa=0;
        int n=0;
        float ta,tb,ca,cb,ct,cc;
        ta=(float)1.50;
        tb=(float)1.80;
        ca=(float)1.80;
        cb=(float)1.95;
        ct=(float)1.04;
        cc=(float)0.30;
        System.out.println("Cuantos metros de tela tiene:");
        tela=teclado.nextInt();
        System.out.println("Cuanto cuesta el metro de tela:");
        costopt=teclado.nextInt();
        System.out.println("El modelo:"+"\n"+"1.A"+"\n"+"2.B");
        modelo=teclado.nextInt();
        System.out.println("TALLA 30,32 o 34:");
        talla=teclado.nextInt();
        float costot=tela*costopt;
        if(modelo==1){
            n=(int)(tela/ta);
            venta=(float)(costot*ca);
        }
        if(modelo==2){
            n=(int)(tela/tb);
            venta=(float)(costot*cb);
        }
        if(talla>=30){
            venta=venta*ct;
            ganancia=venta*cc;
            venta=venta+ganancia;
            pventa=venta/(float)n;
        }
        System.out.println("Se producira "+n+"\n"+"Su precio de venta es de: s/"+pventa+"\n"+"Se ganara: "+"s/"+ganancia);
    }
}
