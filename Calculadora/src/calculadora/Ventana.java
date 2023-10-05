/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Ventana extends JFrame{
    
    private int botonWidth = 20;
    private int botonHeight = 30;
    
    private int pantallaWidth;
    private int pantallaHeight;
    
    
    
    
    private JPanel panel;
    
    public Ventana(){
        this.setVisible(true);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        
        
        //iniciarComponentes();
        
        
        
        
    }
    
    private void iniciarComponentes(){
        iniciarJPanel();
        iniciarBotones();
        iniciarPantalla();
    }
    
    private void iniciarJPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        //panel.setSize(this.WIDTH, this.HEIGHT);
        panel.setSize(400, 600);
        System.out.println("");
        panel.setLocation(1,1);
        this.getContentPane().add(panel);
    }
    
    private void iniciarPantalla(){
        pantallaWidth = 300;
        pantallaHeight = 30;
        
        JTextArea pantalla = new JTextArea();
        pantalla.setVisible(true);
        pantalla.setBounds(30, 30, pantallaWidth, pantallaHeight);
        pantalla.setText("Calculadora");
        panel.add(pantalla);
        panel.revalidate();
        panel.repaint();
        
    }
    
    private void iniciarBotones(){
        JButton botonUno = new JButton("1");
        botonUno.setLayout(null);
        botonUno.setEnabled(true);
        botonUno.setBounds(20, 500, 50, 40);
        panel.add(botonUno);   
        
        
        
    }

}
