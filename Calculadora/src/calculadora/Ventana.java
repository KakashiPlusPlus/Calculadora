/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Ventana extends JFrame{
    
    private int botonWidth = 20;
    private int botonHeight = 30;
    
    private JPanel panel;
    
    public Ventana(){
        this.setVisible(true);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setBackground(Color.yellow);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        iniciarJPanel();
        iniciarBotones();
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
    
    private void iniciarBotones(){
        JButton botonUno = new JButton("1");
        botonUno.setLayout(null);
        botonUno.setEnabled(true);
        botonUno.setBounds(20, 500, 50, 40);
        panel.add(botonUno);   
        
    }
    
}
