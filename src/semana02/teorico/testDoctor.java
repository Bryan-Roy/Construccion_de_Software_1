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
public class testDoctor {
    public static void main(String[] args){
        ArrayList <doctor> listaDoctor=new ArrayList<>();
        listaDoctor.add(new doctor(1,"Juan"));
        listaDoctor.add(new doctor(2,"Maria"));
        listaDoctor.add(new doctor(3,"Antonio"));
        listaDoctor.add(new doctor(4,"Nela"));
        for(doctor datos:listaDoctor){
            System.out.println(datos.toString());
        }
    }
}
