/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana08.practico.manual;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author BRYANROY
 */
public class FrameAnimal extends JFrame{
    
    JLabel lblRegistroMascota,lblAnimal,lblsexo;
    JTextField txtcodigo,txtanimal,txtsexos;
    JButton btnregistrar;
    
    ArrayList<Animal> animales;
    public FrameAnimal(){
        iniciarComponentes();
        animales=new ArrayList<>();
    }
    
    public void iniciarComponentes(){
        setLayout(null);
        setTitle("REGISTRO");
        setSize(370, 270);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblRegistroMascota=new JLabel("Registro de Animales");
        lblRegistroMascota.setFont(new Font("Serif",Font.BOLD, 20));
        lblRegistroMascota.setBounds(70, 10, 180, 30);
        
        lblAnimal=new JLabel("Animal:");
        lblAnimal.setBounds(20, 60, 70, 20);
        
        lblsexo=new JLabel("Sexo:");        
        lblsexo.setBounds(20, 90, 70, 20);
        
        
        txtanimal=new JTextField();
        txtanimal.setBounds(100, 60, 120, 20);
        
        txtsexos=new JTextField();
        txtsexos.setBounds(100, 90, 50, 20);
        
        
        btnregistrar=new JButton("REGISTRAR");
        btnregistrar.setFont(new Font("Serif", Font.BOLD, 18));
        btnregistrar.setBounds(100, 160, 140, 30);
        
        add(lblRegistroMascota);
        add(lblAnimal);
        add(lblsexo);
        add(txtanimal);
        add(txtsexos);
        add(btnregistrar);
        
        btnregistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonRegistrarActionPerformed(e);
            }
        });
    }
    
    private void botonRegistrarActionPerformed(ActionEvent e){
     
            Animal anim = new Animal(txtanimal.getText(), txtsexos.getText());
//            Fecha fech = new Fecha(entero, entero1, entero2);
            animales.add(anim);

            txtanimal.setText("");
            txtsexos.setText("");

            setVisible(false);
        }
     public String mostrar(){
        String cad="";
        for (int i = 0; i < animales.size(); i++) {
            cad+=animales.get(i).toString()+" \n ";
        }
        return cad;
    }
    public String cantidad(){
        return String.valueOf(animales.size());
    }
}
    
