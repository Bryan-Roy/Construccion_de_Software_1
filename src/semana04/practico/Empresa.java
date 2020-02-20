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
public class Empresa {
    
    private String nombreEmp;
    private String ruc;
    private Cliente cliente;
    private Empleado empleado;

    public Empresa() {
        super();
        this.nombreEmp = "";
        this.ruc = "";
        this.empleado=new Empleado();
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "***********" + nombreEmp +"**************"+"\nruc: " + ruc +"\n"+"*********************************************"
                +"\n"+"\nEmpleado:" + empleado+"\n"+"\nCliente:" + cliente;
    }
        
}
