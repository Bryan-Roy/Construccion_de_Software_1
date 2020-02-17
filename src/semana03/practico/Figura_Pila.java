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
class nodo{
    figura dato;
    nodo sgte;
    nodo ante;
    public nodo(figura fig){
        this.dato=fig;
        this.ante=this.sgte=null;
    }
}
class figura{
    private String nombre;

    public figura(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "figura:" + "\n nombre=" + nombre;
    }
}
class method {
    nodo ultimo;
    public method(){
        this.ultimo=null;
    }
    
    void mostrar(){
    nodo temp=ultimo;
    while(temp!=null){
        System.out.println(temp.dato.toString());
        temp=temp.sgte;
    }
  }
    void ingresar(figura fig){
    nodo newnodo= new nodo(fig);
    if(ultimo==null){
        ultimo=newnodo;
    }
    else{
        newnodo.sgte=ultimo;
        ultimo=newnodo;
    }
  }
    void sacarPila(){
        nodo temp=ultimo;
        if(ultimo==null){
            System.out.println("Lista vacia!!");
        }else if(temp.sgte==null){
            ultimo=null;
        }else{
          while(temp!=null){
            if(temp.sgte.sgte==null){
                temp.sgte=null;
                break;
            }
            temp=temp.sgte;
          }  
        }
    }
}
public class Figura_Pila {
    public static void main(String[] args) {
     method metodo=new method();
     metodo.ingresar(new figura("Circulo"));
     metodo.ingresar(new figura("Triangulo"));
     metodo.ingresar(new figura("Cuadrado"));
     metodo.ingresar(new figura("Rectangulo"));
     metodo.ingresar(new figura("Rombo"));
     System.out.println("------------LISTA DE FIGURAS: ---------------");
     metodo.mostrar();
     metodo.sacarPila();
     System.out.println("\n-------------SACAR POR PILA:---------");
     metodo.mostrar();
    }
}
