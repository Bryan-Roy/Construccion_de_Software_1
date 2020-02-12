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
public class Evento {
    
    String titulo;
    int duracionEvento;
    Expositores expositor;
    Asistentes asistente;
    String horaIngreso;
    String horaSalida;
    String temporadaevento;
    double costoentrada;
    char ubicacionEvento;
    MisConstantes constantes;

    public Evento(String titulo, int duracionEvento, Expositores expositor, Asistentes asistente, String horaIngreso, String horaSalida, String temporadaevento, char ubicacionEvento) {
        this.titulo = titulo;
        this.duracionEvento = duracionEvento;
        this.expositor = expositor;
        this.asistente = asistente;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.temporadaevento = temporadaevento;
        this.costoentrada = 0.0;
        this.ubicacionEvento = ubicacionEvento;
    }
    
    public void costoPorUbicacion(){
        if(this.ubicacionEvento == 'P'){
            this.costoentrada=constantes.platinum;
        }else
            if(this.ubicacionEvento == 'G'){
                this.costoentrada=constantes.gold;
            }else
                if(this.ubicacionEvento == 'V'){
                this.costoentrada=constantes.VIP;
            }
    }
    public double calcularTotalConIGV(){
        costoentrada=costoentrada+(costoentrada*constantes.IGV);
        return costoentrada;
    }
    public double descuentoPorTemporada(){
        double descuento=0.0;
        if(temporadaevento == "alta" ){
            descuento = costoentrada*0.05;
        }
        if(temporadaevento == "baja"){
            descuento = costoentrada*0.10;
        }
        return descuento;
    }
}
