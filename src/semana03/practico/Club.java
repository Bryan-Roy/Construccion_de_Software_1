/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana03.practico;

/**
 *
 * @author BRYANROY
 */
public class Club {
    
    private Socio socio1,socio2,socio3;

    public Club(){
        socio1=new Socio();
        socio2=new Socio();
        socio3=new Socio();
    }
    
    public void mayorAntiguo(){
        System.out.println("El Socio mas Antiguo es:");
        if(socio1.retornarAntiguo()>socio2.retornarAntiguo() && socio1.retornarAntiguo()>socio3.retornarAntiguo()){
            socio1.imprimir();
        }else{
            if(socio2.retornarAntiguo()>socio3.retornarAntiguo() && socio2.retornarAntiguo()>socio1.retornarAntiguo()){
                socio2.imprimir();
            }
            else{
                socio3.imprimir();
            }
        }
    }
    
}
