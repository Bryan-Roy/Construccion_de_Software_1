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
public class Alumno {
    
    Scanner leer=new Scanner(System.in);
    private String nombre;
    private int edad;

    public Alumno() {
        this.nombre = "";
        this.edad = 0;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    public void llenar(){
        System.out.println("Ingresar Nombre:");
        nombre=leer.next();
        System.out.println("Digite la edad");
        edad=leer.nextInt();
    }
    public void imprimir(){
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su edad es: "+edad+" años");
    }
    public void mayoredad(){
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}
