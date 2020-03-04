/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica2;

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
