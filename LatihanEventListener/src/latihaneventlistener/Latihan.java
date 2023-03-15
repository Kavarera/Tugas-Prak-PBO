/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaneventlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Latihan extends JFrame implements ActionListener,ItemListener {

    String kls[] = {"A","B","C","D","F","G","H"};
    JTextField fnama = new JTextField();
    JTextField fnim = new JTextField();
    JComboBox<String> cbkelas = new JComboBox<String>(kls);
    JLabel lnama = new JLabel("Nama : ");
    JLabel lnim = new JLabel("Nim : ");
    JLabel lkelas = new JLabel("Kelas : ");
    JLabel lmk = new JLabel("Mata Kuliah : ");
    ButtonGroup bbg = new ButtonGroup();
    JRadioButton rbPbo = new JRadioButton("Prak PBO");
    JRadioButton rbScpk = new JRadioButton("Prak SCPK");
    JLabel lnama2 = new JLabel("Nama : ");
    JLabel lnim2 = new JLabel("Nim : ");
    JLabel lkelas2 = new JLabel("Kelas : ");
    JLabel lmk2 = new JLabel("Mata Kuliah : ");
    JButton bSave = new JButton("Save");
    public Latihan(){
        setTitle("Data Diri");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,900);
        setLocationRelativeTo(null);
        setVisible(true);
        bbg.add(rbPbo);
        bbg.add(rbScpk);
        
        //init rb button
        rbPbo.setActionCommand("Praktikum PBO");
        rbScpk.setActionCommand("Praktikum SCPK");
        // add
        add(fnama);
        add(fnim);
        add(cbkelas);
        add(rbPbo);
        add(rbScpk);
        add(bSave);
        add(lnama);
        add(lnim);
        add(lkelas);
        add(lmk);
        add(lnama2);
        add(lnim2);
        add(lkelas2);
        add(lmk2);
        
        lnama.setBounds(10,10,50,20);
        fnama.setBounds(60,10,50,20);
        lnim.setBounds(10,35,50,20);
        fnim.setBounds(60,35,50,20);
        lkelas.setBounds(10,60,50,20);
        cbkelas.setBounds(60,60,50,20);
        lmk.setBounds(10,85,190,20);
        rbPbo.setBounds(95,85,130,20);
        rbScpk.setBounds(250,85,130,20);
        bSave.setBounds(150,135,100,20);
        lnama2.setBounds(10,190,250,20);
        lnim2.setBounds(10,245,250,20);
        lkelas2.setBounds(10,300,250,20);
        lmk2.setBounds(10,355,250,20);
        System.out.println("init");
        bSave.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(cbkelas.getSelectedItem().toString());
        if(e.getSource()==bSave){
            System.out.println("diklick");
            lnama2.setText("Nama : "+ fnama.getText());
            lnim2.setText("NIM : " + fnim.getText());
            lkelas2.setText("Kelas : "+ cbkelas.getSelectedItem().toString());
            
            lmk2.setText("Mata Kuliah : " + bbg.getSelection().getActionCommand());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getSource());
    }
    
}
