/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

/**
 *
 * @author BRYANROY
 */
public class Ordenador {
    
    int contraseña;
    cpu p1;
    pantalla p2;
    teclado p3;
    raton p4;
    
    public Ordenador(cpu a,pantalla b,teclado c,raton d){
        this.p1=a;
        this.p2=b;
        this.p3=c;
        this.p4=d;
    }
}
