/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Entidades.Asistentes;
import Entidades.Expositores;
/**
 *
 * @author BRYANROY
 */
public class prueba1 {
    
    public static void main(String[] args){
        Asistentes asistente=new Asistentes(960328251,"Av.raymondi#324",012536,"Pedro","Suarez","pedro.suarez@hotmal.com");
        Expositores exponentes=new Expositores(561235,"Juan","Fernandez","juan.fernandez@gmail.com");
        Evento evento = new Evento("Programacion en java",3,exponentes,asistente,"3:15","6:15","baja",'G');
        
        System.out.println("Titulo Evento: "+evento.titulo);
        System.out.println("Duracion de evento: "+evento.duracionEvento+" hora");
        System.out.println("---------------------------------");
        System.out.println("DATOS DE EXPOSITOR");
        System.out.println("Codigo: "+evento.expositor.getCodigo());
        System.out.println("Nombre: "+evento.expositor.getNombre());
        System.out.println("Apellido: "+evento.expositor.getApellido());
        System.out.println("Correo: "+evento.expositor.getCorreo());
        System.out.println("---------------------------------");
        System.out.println("DATOS DE ASISTENTE");
        System.out.println("codigo: "+evento.asistente.getCodigo());
        System.out.println("Nombre: "+evento.asistente.getNombre());
        System.out.println("Apellido: "+evento.asistente.getApellido());
        System.out.println("Correo: "+evento.asistente.getCorreo());
        System.out.println("Telefono: "+evento.asistente.getTelefono());
        System.out.println("Direccion: "+evento.asistente.getDireccion());
        System.out.println("----------------------------------");
        System.out.println("Hora de inicio: "+evento.horaIngreso+" p.m.");
        System.out.println("Hora de salida: "+evento.horaSalida+" p.m.");
        System.out.println("Temporada Baja: "+evento.temporadaevento);
        System.out.println("Ubicacion: "+evento.ubicacionEvento);
        System.out.println("----------------------------------");
        evento.costoPorUbicacion();
        System.out.println("Costo: "+evento.costoentrada);
        System.out.println("Monto a pagar con IGV: "+evento.calcularTotalConIGV());
        System.out.println("Monto por temporada: "+evento.descuentoPorTemporada());
    }
}
