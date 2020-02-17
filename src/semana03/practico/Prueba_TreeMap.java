/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author BRYANROY
 */
public class Prueba_TreeMap {
    
    public static void main(String[] args){
        Map<Integer, String> treepMap = new TreeMap<Integer , String>();
        
        treepMap.put(1, "Leon");
        treepMap.put(5, "Cebra");
        treepMap.put(3, "Caballo");
        treepMap.put(7, "Lobo");
        treepMap.put(2, "Leona");
        treepMap.put(4, "Venado");
        
        System.out.println(treepMap);
    }
}
