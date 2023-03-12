/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum;

import BangunRuang.Balok;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    JButton btnSubmit = new JButton("Submit");
    Menu1(){
        setTitle("123210131 - Menu 1");
        setSize(700,500);
        setLayout(null);
        
        labelTinggi.setBounds(10,10,250,50);
        tfTinggi.setBounds(10,50,250,20);
        labelLebar.setBounds(10,70,250,50);
        tfLebar.setBounds(10,110,250,20);
        labelPanjang.setBounds(10,130,250,50);
        tfPanjang.setBounds(10,170,250,20);
        btnSubmit.setBounds(150, 200, 115, 35);
        
        add(labelTinggi);
        add(tfTinggi);
        add(labelLebar);
        add(tfLebar);
        add(labelPanjang);
        add(tfPanjang);
        
        btnSubmit.addActionListener(e->{
            Balok balok = new Balok(Double.parseDouble(tfTinggi.getText()),
            Double.parseDouble(tfLebar.getText()), Double.parseDouble(tfPanjang.getText())
                );
            System.out.println("Volume : " + balok.GetVolume() + "\nLuas Permukaan = " +
                    balok.GetLuasPermukaan() + "\nPersegi Panjang\n Luas = "+balok.getLebar() + 
                    "\nKeliling = "+ balok.GetKeliling());
            System.out.println(balok.getLebar() + " " + balok.getPanjang());
            
            
            
            JOptionPane.showMessageDialog(null, "Volume : " + balok.GetVolume() + "\nLuas Permukaan = " +
                    balok.GetLuasPermukaan() + "\nPersegi Panjang\n Luas = "+balok.GetLuas()+ 
                    "\nKeliling = "+ balok.GetKeliling());
        });
        
        add(btnSubmit);
        
        setVisible(true);
    }
}
