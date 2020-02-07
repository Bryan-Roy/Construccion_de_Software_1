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
//final class daddy{
 class daddy{
     void carrera(){
         System.out.println("Medicina");
     }
     void universidad(){
         System.out.println("UNAS");
     }
//     final void deporte(){
     void deporte(){
         System.out.println("Futbol");
     }
 }
class son extends daddy{
    @Override
    void carrera(){
        System.out.println("Sistemas");
    }
    void depoarte(){
        System.out.println("basket");
    }
}
public class ejemplo08 {
    
}
