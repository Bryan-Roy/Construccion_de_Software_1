/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Scanner;

/**
 *
 * @author BRYANROY
 */
public class Socio {
    
    Scanner leer=new Scanner(System.in);
    private String nombre;
    private int antiguoClub;

    
    public Socio(){
        System.out.println("Ingresar el Nombre de Socio:");
        nombre=leer.next();
        System.out.println("Años de Antiguedad:");
        antiguoClub=leer.nextInt();
    }
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Año de Antiguedad es de : "+antiguoClub+" años");
    }
    public int retornarAntiguo(){
        return antiguoClub;
    }
}
