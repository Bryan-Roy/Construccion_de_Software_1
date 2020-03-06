/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practico.manual;


/**
 *
 * @author BRYANROY
 */
public class Animal {
    static int idx = 1;
    private String name;
    private int id;
    private String sexo;

    public Animal(String name,String sexo) {
        this.name = name;
        this.id= idx++;
        this.sexo = sexo;
        
    }

    public static int getIdx() {
        return idx;
    }

    public static void setIdx(int idx) {
        Animal.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "id="+id+"\nAnimal=" + name +"\nsexo:" + sexo;
    }

    
}
