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
public class InputDialog2 extends JFrame{
    public InputDialog2() {

      String response = JOptionPane.showInputDialog(null,
      "¿Cual es tu Email?",
      "Escribe tu Email",
      JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] arguments) {
        InputDialog2 dialog = new InputDialog2();
    }
}
