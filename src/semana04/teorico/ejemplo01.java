/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.teorico;

/**
 *
 * @author BRYANROY
 */
class Humano{
    protected String nombre;
    protected String apellido;

    public Humano(String n, String a) {
        this.nombre = n;
        this.apellido = a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString() {
        return "Humano:" + "\nnombre=" + nombre + ",apellido=" + apellido;
    }
}
class Ciudadano extends Humano{
    private String documento;

    public Ciudadano(String d, String n, String a) {
        super(n,a);
        this.documento = d;
    }
    
    public String toStringcuidadano() {
        return this.toString()+"\nCiudadano:" + "\ndocumento=" + documento;
    }
    
}
public class ejemplo01 {
    
    public static void main(String[] args){
        Ciudadano c1=new Ciudadano("123","Juan","Salaza");
        System.out.println(c1.toStringcuidadano());
    }
}
