/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practica1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author BRYANROY
 */
public class CampoTexto extends JFrame{
     public CampoTexto() {
        super("CampoTexto");
        setSize(400, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ",JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);
        
    }
    public static void main(String[] arguments) {
        CampoTexto apli = new CampoTexto();
    }
}
