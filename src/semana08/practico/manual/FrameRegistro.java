/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practico.manual;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author BRYANROY
 */
public class FrameRegistro extends JFrame{
    JLabel lblnombre, Lista,lblcantidad,lblNcant;
    JButton btnagregar,btnmostrar,btnsalir;
    JTextArea txalista;
    
    FrameAnimal fr=new FrameAnimal();
    public FrameRegistro(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("VENTANA ");
        setSize(430,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblnombre=new JLabel("REGISTRO ANIMAL");
        lblnombre.setFont(new Font("Serif", Font.ITALIC, 24));
        lblnombre.setBounds(40, 10,310 , 30);
        
        btnagregar=new JButton("AGREGAR");
        btnagregar.setBounds(20, 50, 90, 20);
        
        btnmostrar=new JButton("MOSTRAR");
        btnmostrar.setBounds(130, 50, 95, 20);
        
        btnsalir=new JButton("SALIR");
        btnsalir.setBounds(245, 50, 90, 20);
        
        Lista=new JLabel("Lista de Animales: ");
        Lista.setBounds(20,90 , 160, 20);
        
        txalista=new JTextArea();
        txalista.setFont(new Font("Serif", Font.BOLD, 14));
        txalista.setBounds(90, 130, 180, 300);
        
        lblcantidad=new JLabel("Cantidad:");
        lblcantidad.setBounds(20, 450, 60, 20);
        
        lblNcant=new JLabel("Nª");
        lblNcant.setBounds(80, 450, 30, 20);
        
        add(lblnombre);
        add(btnagregar);
        add(btnmostrar);
        add(btnsalir);
        add(Lista);
        add(txalista);
        add(lblcantidad);
        add(lblNcant);
        
        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonAgregarActionPerformed(e);
            }
        });
        
        btnmostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonMostrarActionPerformed(e);
            }
        });
        
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonSalirActionPerformed(e);
            }
        });
    }
    
    private void botonAgregarActionPerformed(ActionEvent e){
        fr.setVisible(true);
    }
    
    private void botonMostrarActionPerformed(ActionEvent e){
        txalista.setText(fr.mostrar());
        lblNcant.setText(fr.cantidad());
    }
    
    private void botonSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new FrameRegistro();
    }
}
