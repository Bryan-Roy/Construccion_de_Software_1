/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.TreeSet;

/**
 *
 * @author BRYANROY
 */
class Articulo implements Comparable<Articulo>{
    
    private int numero_articulo;
    private String descripcion;
    
    public Articulo(int num, String desc){
        numero_articulo=num;
        descripcion=desc;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    @Override
    public int compareTo(Articulo t) {
        return numero_articulo - t.numero_articulo;
    }
    
}
public class Prueba_TreeSet {
    
    public static void main(String[] args){
        
        Articulo primero=new Articulo(1, "Primer articulo");
        Articulo segundo=new Articulo(2, "Segundo articulo");
        Articulo tercero=new Articulo(3, "Tercer articulo");
        Articulo cuarto=new Articulo(4, "Cuarto articulo");
        
        TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
        
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(cuarto);
        ordenaArticulos.add(primero);
        ordenaArticulos.add(tercero);
        
        for(Articulo art:ordenaArticulos){
            System.out.println(art.getDescripcion());
        }
    }
}
