/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.practico;

/**
 *
 * @author BRYANROY
 */
public class ejercicio01 {
    int suma;
    int multiplicacion;
    int division;

    public void sumar(int numero1, int numero2){
        suma=numero1+numero2;
    }
    public void multiplicar(int numero1, int numero2){
        multiplicacion=numero1*numero2;
    }
    public void dividir(int numero1,int numero2){
        division=numero1/numero2;
    }
    public void imprimir(){
        System.out.println("La suma es: "+suma);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
