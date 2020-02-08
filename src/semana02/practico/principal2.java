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
public class principal2 {
    
    public static void main(String[] args){
        Scanner num1=new Scanner(System.in);
        int numero1,numero2,numero3;
        System.out.println("--------------Para el rectangulo y triangulo----------------");
        System.out.println("Ingresar Base:");
        numero1=num1.nextInt();
        System.out.println("Ingresar Altura:");
        numero2=num1.nextInt();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ingresar el lado del cuadrado:");
        numero3=num1.nextInt();
        System.out.println("-----------------------RESULTADOS-----------------------------");
        rectangulo area1=new rectangulo();
        triangulo area2=new triangulo();
        cuadrado area3=new cuadrado();
        
        area1.asigna(numero1, numero2);
        area1.area_del_rectangulo();
        area2.Area_del_Triangulo(numero1, numero2);
        area3.asignar(numero3);
        area3.calcular();
        
        area1.imprimir1();
        area2.imprimir2();
        area3.imprimir3();
        
    }
}
