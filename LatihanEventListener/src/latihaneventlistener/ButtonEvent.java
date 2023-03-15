/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaneventlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class ButtonEvent extends JFrame implements ActionListener {
    
    JTextField fnama = new JTextField();
    JLabel lnama = new JLabel("Nama : ");
    JLabel loutput = new JLabel("Output : ");
    
    
    
    public ButtonEvent(){
        setTitle("Latihan Button Event");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(fnama);
        add(lnama);
        add(loutput);
        lnama.setBounds(20,20,100,30);
        fnama.setBounds (120,20,100,30);
        loutput.setBounds(20,100,100,30);
        
        fnama.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                loutput.setText("output : "+fnama.getText());
                if(loutput.getText().length()>=1000)
                {
                    
                     JOptionPane.showMessageDialog(null,"Text Kepanjangan BOOOOOSSSSSS");
                     loutput.setText("");
                     fnama.setText("");
                }
            }
        });
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                int r = JOptionPane.showConfirmDialog(null, "Yakin udahan bos?","Konfirmasi",JOptionPane.YES_NO_OPTION);
                System.out.println(r);
                if(r == JOptionPane.YES_OPTION)
                {
                    dispose();
                }
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
