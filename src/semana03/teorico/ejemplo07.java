/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.teorico;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author BRYANROY
 */
class bag<t> implements Iterable<t>{
    ArrayList<t> lista=new ArrayList<>();
    int tope;
    public bag(int x){
        this.tope=x;
    }
    void add(t p){
        if(lista.size()<=tope)
            lista.add(p);
        else
            throw new RuntimeException("Esta lleno");
    }
    @Override
    public Iterator<t> iterator(){
        return null;
    }  
}

public class ejemplo07 {
    public static void main(String[] args){
        bag<golosina> bolsitag=new bag(5);
        bag<chocolatina> bolsitac=new bag(5);
        golosina g1=new golosina("chicle");
        golosina g2=new golosina("caramelo");
        golosina g3=new golosina("tofis");
        chocolatina c1=new chocolatina("koka");
        chocolatina c2=new chocolatina("keke");
        chocolatina c3=new chocolatina("koko");
        bolsitac.add(c1);
        bolsitac.add(c2);
        bolsitac.add(c3);
        bolsitag.add(g1);
        bolsitag.add(g2);
        bolsitag.add(g3);
        for(golosina g:bolsitag){
            System.out.println(g.getMarca());
        }
        for(chocolatina c:bolsitac){
            System.out.println(c.getNombre());
        }
    }
}
