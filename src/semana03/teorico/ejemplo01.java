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
interface padre{
    //constantes la variables
    int CAD=14;
    //metodo son abstractos
    void dormir();
    int comer();
    int comer(int a);
    int comer(int p, float y);
}
abstract class canino{
    int x,y;
    abstract void comer();
    abstract void dormir();
    abstract void caminar();
    int suma(){
        return this.x+this.y;
    }
}

abstract class perro extends canino{
    void comerr(){}
    void dormir(){}
    void caminar(){}
}
//se crea clases abstractas para comportar 
//como super clases
public class ejemplo01 {
    public static void main(String[] args){
//        canino p1=new canino();
    }
}
