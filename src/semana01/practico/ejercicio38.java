/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01.practico;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author BRYANROY
 */
public class ejercicio38 {
    
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("COMPRAS DE LOS CLIENTES");
        boolean valor=true;
        int indice=1;
        ArrayList<cliente> clientes=new ArrayList<>();
        while(valor){
            System.out.println("1. Para realizar una venta:  ");
            System.out.println("0. Para finalizar la venta");
            int numero=leer.nextInt();
            
            switch(numero){
                case 0:
                    System.out.println("venta finalizada");
                    valor=false;
                    break;
                case 1:
                    System.out.println("Ingresa el monto de la compra del cliente "+ indice+"  :");
                    String cadena=leer.next();
                    double monto=Double.parseDouble(cadena);
                    cliente c=new cliente("cliente"+indice, monto);
                    clientes.add(c);
                    indice++;
                    break;
                    
                 default:
                     System.out.println("Opcion invalida.... Intentalo Otra vez");
            }
        }
        
        System.out.println("");
        System.out.println("\t VENTA DEL DIA");
        double sum=0;
        for(int i=0;i<clientes.size();i++){
            System.out.println(clientes.get(i).toString());
            sum+=clientes.get(i).monto_compra;
        }
        
        BigDecimal bigDecimal = new BigDecimal(sum).setScale(2, RoundingMode.UP);
        sum=bigDecimal.doubleValue();
        System.out.println("VENTA TOTAL DEL DIA: "+sum);
        System.out.println("Numero de los clientes del dia: "+clientes.size());
}
    }

class cliente{
    String nombre;
    double monto_compra;

        public cliente(String nombre, double monto_compra) {
            this.nombre = nombre;
            this.monto_compra = monto_compra;
        }

    @Override
    public String toString() {
        return "Nombre:  " + nombre + ", Monto compra: " + monto_compra;
    }   

}
