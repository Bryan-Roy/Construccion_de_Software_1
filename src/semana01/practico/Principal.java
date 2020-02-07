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
public class Principal {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de autos: ");
        int numA = leer.nextInt();
        
        Auto autos[];
        autos = new Auto[numA];
        
        System.out.println("Ingrese las placas de los "+numA+" autos (4 dígitos):");
        for(int i=0;i<numA;i++){
            autos[i] = new Auto();
            System.out.println("Auto "+(i+1)+" - Placa: ");
            autos[i].setPlaca(leer.next());
            System.out.println("--------------------");
            
            autos[i].registrarColor();
        }
        
        System.out.println("COLORES DE LAS CALCOMANÍAS DE LOS AUTOS:");
        for(int i=0;i<numA;i++){
            System.out.println("Auto - Placa: "+autos[i].getPlaca()+" - Color: "+autos[i].getColorCalcomania());
            System.out.println("--------------------");
        }  
    }  
}
