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
public class triangulo {
    
    int AreaTri;
    
    public void Area_del_Triangulo(int b,int a){
        AreaTri=(int)(b*a)/2;
    }
    public void imprimir2(){
        System.out.println("El area del triangulo es: "+AreaTri);
    }
}
