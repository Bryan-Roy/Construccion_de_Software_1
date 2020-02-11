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
public class ejercicio03 {
    
    public static void main(String[] args){
        int x;
        x=-1+4*7-27/3;
        if(x%2!=0){
            x+=4;
        }else{
            x*=4;
        }
        System.out.println("Valor de X="+x);
    }
}
