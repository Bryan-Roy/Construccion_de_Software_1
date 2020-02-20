/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana04.practico;

/**
 *
 * @author BRYANROY
 */
public class Principal {
    
    private Empresa emp;
    public Principal(){
        emp=new Empresa();
    }
    public void cargar(){
        emp.setNombreEmp("Multiservicios Porta");
        emp.setRuc("20141189850");
        

        emp.getEmpleado().setNombre("Pedro");
        emp.getEmpleado().setApellido("Panduro");
        emp.getEmpleado().setDni("77895630");
        emp.getEmpleado().setTelefono(956123540);
        
        Cliente clin1=new Cliente();
        clin1.setNombre("Roy");
        clin1.setApellido("Pizarro");
        clin1.setDni("78953206");
        clin1.setTelefono(956321056);
        emp.setCliente(clin1);
    }
    public void imprimir(){
        System.out.println(emp.toString());
    }
    public static void main(String[] args){
        
        Principal n1=new Principal();
        n1.cargar();
        n1.imprimir();
        
    }
}
