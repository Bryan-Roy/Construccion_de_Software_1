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
public class rectangulo {
    
    int AreaRec;
    int base;
    int altura;
    public void asigna(int x,int y){
        this.base=x;
        this.altura=y;
    }
    public void area_del_rectangulo(){
        AreaRec=base*altura;
    }
    public void imprimir1(){
        System.out.println("El area del rectangulo es: "+AreaRec);
    }
}

