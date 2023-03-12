/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum;

import BangunRuang.Balok;
import BangunRuang.Tabung;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rafli
 */
public class Menu2 extends JDialog {
    JTextField tfJari = new JTextField();
    JTextField tfTinggi = new JTextField();
    JLabel labelJari = new JLabel("Input Jari Jari");
    JLabel labelTinggi = new JLabel("Input tinggi");
    JButton btnSubmit = new JButton("Submit");
    Menu2(){
        setTitle("123210131 - Menu 2");
        setSize(700,500);
        setLayout(null);
        
        labelTinggi.setBounds(10,10,250,50);
        tfTinggi.setBounds(10,50,250,20);
        labelJari.setBounds(10,70,250,50);
        tfJari.setBounds(10,110,250,20);
        btnSubmit.setBounds(150, 200, 115, 35);
        
        add(labelTinggi);
        add(tfTinggi);
        add(labelJari);
        add(tfJari);
        
        btnSubmit.addActionListener(e->{
            Tabung tabung = new Tabung(Double.parseDouble(tfTinggi.getText()),
            Double.parseDouble(tfJari.getText()));
            System.out.println("Volume : " + tabung.GetVolume() + "\nLuas Permukaan = " +
                    tabung.GetLuasPermukaan() + "\nPersegi Panjang\n Luas = "+tabung.GetLuas() + 
                    "\nKeliling = "+ tabung.GetKeliling());
            
            
            JOptionPane.showMessageDialog(null, "Volume : " + tabung.GetVolume() + "\nLuas Permukaan = " +
                    tabung.GetLuasPermukaan() + "\n\nLingkaran : \n Luas = "+tabung.GetLuas() + 
                    "\nKeliling = "+ tabung.GetKeliling());
        });
        
        add(btnSubmit);
        
        setVisible(true);
    }    
}
