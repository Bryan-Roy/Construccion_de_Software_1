/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.teorico;

/**
 *
 * @author BRYANROY
 */
class empresa{
    int a;
    int b;
    empleado p;
    public empresa(empleado c){
        this.p=c;
    }
}
//agregacion
class empleado{
    int a,b;
}
public class ejemplo04 {
    public static void main(String[] args){
        empresa e=new empresa(new empleado());
    }
}
