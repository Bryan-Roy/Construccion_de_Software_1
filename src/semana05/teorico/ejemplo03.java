/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana05.teorico;

/**
 *
 * @author BRYANROY
 */
abstract class padres{
    int x;
    int y;
    String saludar(){
        return "buenos dias";
    }
    abstract void cortepelo();
}
class hijas extends padres{
    String saludar(){
        return "Good Morning";
    }
    void cortepelo(){
        
    }
}
public class ejemplo03 {
    
    public static void main(String[] args){
        padres p=new hijas();
        System.out.println(p.saludar());
    }
}
