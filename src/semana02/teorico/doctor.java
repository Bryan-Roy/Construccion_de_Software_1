/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana02.teorico;

/**
 *
 * @author BRYANROY
 */
public class doctor {
    private int  id;
    private String name;

    public doctor(int x, String cad) {
        this.id = x;
        this.name = cad;
    }
    
    @Override
    public String toString() {
        return "Id=" + this.id + ", Nombre=" + this.name;
    }
    
}
