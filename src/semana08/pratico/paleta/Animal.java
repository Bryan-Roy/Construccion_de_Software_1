/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.pratico.paleta;

/**
 *
 * @author BRYANROY
 */
public class Animal {
    
    private String codigo;
    private String nombre;
    private String sexo;
    
//    public Animal(){
//        this.codigo="";
//        this.nombre="";
//        this.sexo="";
//    }
    public Animal(String codigo, String nombre, String sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "codigo:" + codigo + "\nAnimal:" + nombre + "\nsexo:" + sexo;
    }
    
}
