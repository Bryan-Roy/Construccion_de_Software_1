/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author BRYANROY
 */
public class InputDialog extends JFrame{
    public InputDialog() {

      String respuesta = JOptionPane.showInputDialog(null,
      "Escribe tu nombre:");
    }

    public static void main(String[] arguments) {
        InputDialog dialog = new InputDialog();
    }
}
//    public static void main(String[] arguments) {
//        int a=Integer.parseInt(JOptionPane.showInputDialog("INSERTE NUMERO 1:"));
//        int b=Integer.parseInt(JOptionPane.showInputDialog("INSERTE NUMERO 2:"));
//        int result=a+b;
//        JOptionPane.showMessageDialog(null,"El resultado de la suma de: "+a+" + "+b+" = "+result);
//    } 

