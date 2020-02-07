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
public class cuadrado {
    
    int AreaCua;
    int lado;
    
    void asignar(int x){
        this.lado=x;
    }
    public void calcular(){
        AreaCua=(int) Math.pow(lado,2);
    }
    public void imprimir3(){
        System.out.println("El area del cuadrado es: "+AreaCua);
    }
}
