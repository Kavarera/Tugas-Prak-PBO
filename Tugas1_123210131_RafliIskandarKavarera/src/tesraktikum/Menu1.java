/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author rafli
 */
public class Menu1 extends JDialog {
    
    JTextField tfPanjang = new JTextField();
    JTextField tfLebar = new JTextField();
    JTextField tfTinggi = new JTextField();
    JLabel labelPanjang = new JLabel("Input panjang");
    JLabel labelLebar = new JLabel("Input lebar");
    JLabel labelTinggi = new JLabel("Input tinggi");
    Menu1(){
        setTitle("123210131 - Menu 1");
        setSize(700,500);
        setLayout(null);
        
        labelTinggi.setBounds(100,10,100,650);
        
        add(labelTinggi);
        
        
        setVisible(true);
    }
}
