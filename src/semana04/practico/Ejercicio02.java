/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

import java.util.ArrayList;

/**
 *
 * @author BRYANROY
 */

class Disco extends generos{
    
    private String titulo;
    private String autor;

    public Disco(String titulo, String autor, String genero, String formato, double valors) {
        super(genero, formato, valors);
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        
        return "\nDisco:"+ "\nTitulo:" + titulo + "\nAutor:" + autor +this.toStringValor()+this.toStringForm()+this.toStringGen()+"\n";
    }
    
}
class generos extends formatos{
    
    protected String genero;

    public generos(String genero, String formato, double valors) {
        super(formato, valors);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toStringGen() {
        return "\ngenero:" + genero;
    }
    
}
class formatos extends valor{
    
    protected String formato;

    public formatos(String formato, double valors) {
        super(valors);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String toStringForm() {
        return "\nformato:" + formato;
    }
    
}
class valor{
    
    protected double valors;

    public valor(double valors) {
        this.valors = valors;
    }

    public double getValors() {
        return valors;
    }

    public void setValors(double valors) {
        this.valors = valors;
    }

    public String toStringValor() {
        return "\nvalor:" + valors;
    }
    
}
class ListaMultimedia{
    ArrayList<Disco> Lista=new ArrayList<>(20);
    public void agregar(Disco dist){
        Lista.add(dist);
        
    }
    public void mostrar(){
        System.out.println("-----------------LISTA DE DISCOS-----------------");
        System.out.println(Lista.toString());       
    }
        
}
public class Ejercicio02 {
    
    public static void main(String[] args){
        ListaMultimedia list=new ListaMultimedia();
        list.agregar(new Disco("Cantare","Pablo Olivares","Rock","mp3",20));
        list.agregar(new Disco("Por un amor","Juan Montes","Balada","mp3",15));
        
        list.mostrar();
    }
}
