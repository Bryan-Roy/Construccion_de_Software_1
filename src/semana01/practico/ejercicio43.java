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
public class ejercicio43 {
    
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de clientes:  ");
        int cantidad=cin.nextInt();
        System.out.println("Bolita Roja 40% descueto");
        System.out.println("Bolita Amarilla 25% descuento");
        System.out.println("Bolita Blanca No hay descuento");
        System.out.println("\t LISTA DE COMPRAS Y PAGOS: ");
        for(int i=0;i<cantidad;i++){
            
                
                    System.out.print("Cliente "+(i+1)+" :");
                
                double precio=0;
               
                    precio=precioaleatorio(100, 1);
                    System.out.print("  Precio total: S/"+precio);
                    
               
                String color="";
                
                   color=bolaAleatorio();
                    System.out.print("  Bolita sacada:  "+color+"   ");
                    if(color.equals("Rojo")){
                        double pagar=(double)((precio*40)/100);
                        System.out.print("Precio a Pagar:  S/"+pagar);
                    }
                    if(color.equals("Amarillo")){
                        System.out.print("Precio a Pagar:  S/"+((precio*25)/100));
                    }
                    if(color.equals("Blanco")){
                        System.out.print("Precio a Pagar:  S/"+precio);
                    }
                    System.out.println("");
                }
     
            
        }
   
    public static double precioaleatorio(double max,double min){
        BigDecimal bigDecimal = new BigDecimal((double)((max+min-1)*Math.random()+1)).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }
    public static String bolaAleatorio(){
        String[] cad={"","Rojo","Amarillo","Blanco"};
        int numero=(int)((3+1-1)*Math.random()+1);
        return cad[numero];
    }
}
