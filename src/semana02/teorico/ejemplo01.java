/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

import java.util.ArrayList;

/**
 *
 * @author BRYANROY
 */
public class ejemplo01 {
    
    public static void main(String[] args){
        ArrayList<String> listaFamilia = new ArrayList<>();
        listaFamilia.add("A");
        listaFamilia.add("B");
        listaFamilia.add("C");
        listaFamilia.add("D");
        listaFamilia.add("E");
        listaFamilia.add("F");
        
        for(int i=0;i<listaFamilia.size();i++){
            System.out.println(listaFamilia.get(i));
        } 
    }
}
