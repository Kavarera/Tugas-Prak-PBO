/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum;

import java.awt.Dialog;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author rafli
 */
public class MainForm extends JFrame {
    
    JButton Menu1 = new JButton("Menu 1");
    JButton Menu2 = new JButton("Menu 2");
    public MainForm(){
        setTitle("123210131 - Tugas 1");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        
        setLayout(null);
        Menu1.setBounds(getWidth()/2-150 , getHeight() /2 -25 ,100,50);
        Menu2.setBounds(getWidth()/2+50,getHeight()/2-25,100,50);
        
        Menu1.addActionListener(e->{
            Menu1 jd = new Menu1();
            System.out.println("DILIK");

        });
        Menu2.addActionListener(e->{
            Menu2 a = new Menu2();
            System.out.println("Menu 2 jalan");
        });
        
        add(Menu1);
        add(Menu2);
        setVisible(true);
    }
}
