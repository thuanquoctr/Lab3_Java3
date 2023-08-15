/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author DELL
 */
public class BAI3 extends JFrame {
    
    private JSlider s1;
    private JPanel p1;
    private ImageIcon icon;
    private JLabel gtht;
    private JButton setvl;
    private JLabel fonsize;
    private JPanel p2;
    private JTextField txt;
    
    public BAI3() {
        this.setTitle("BAI3");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        p1 = new JPanel();
        s1 = new JSlider(JSlider.HORIZONTAL, 0, 50, 45);
        s1.setFont(new Font("Serif", Font.BOLD, 17));
        s1.setMajorTickSpacing(10);
        s1.setMinorTickSpacing(2);
        s1.setPaintTicks(true);
        s1.setPaintLabels(true);
        icon = new ImageIcon("img.jpeg");
        s1.setPreferredSize(new Dimension(550, 170));
        p1.add(s1);
        this.setLayout(new GridLayout(2, 1));
        this.add(p1);
        
        p2 = new JPanel();
        p2.setLayout(null);
        gtht = new JLabel("Giá trị hiện tại là: ");
        gtht.setFont(new Font("Serif", Font.BOLD, 17));
        gtht.setBounds(10, 20, 150, 50);
        setvl = new JButton("Set Value");
        setvl.setFont(new Font("Serif", Font.BOLD, 17));
        setvl.setBounds(190, 27, 120, 40);
        fonsize = new JLabel("Font Size");
        p2.add(fonsize);
        fonsize.setBounds(330, 50, 250, 100);
        fonsize.setFont(new Font("Serif", Font.BOLD, s1.getValue()));
        fonsize.setForeground(Color.blue);
        txt = new JTextField();
        txt.setText(String.valueOf(s1.getValue()));
        txt.setFont(new Font("Serif", Font.BOLD, 17));
        txt.setBounds(140, 27, 40, 40);
        p2.add(gtht);
        p2.add(setvl);
        p2.add(txt);
        
        s1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int vl = s1.getValue();
                txt.setText(String.valueOf(vl));
                fonsize.setFont(new Font("Serif", Font.BOLD, vl));
            }
        });
        setvl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(txt.getText()) < 0 || Integer.parseInt(txt.getText()) > 50) {
                    JOptionPane.showMessageDialog(null, "Chỉ Set Value được trong khoảng 0 --> 50");
                    txt.setText(String.valueOf(s1.getValue()));
                }
                s1.setValue(Integer.parseInt(txt.getText()));
                fonsize.setFont(new Font("Serif", Font.BOLD, s1.getValue()));
            }
        });        
        this.setLayout(new GridLayout(2, 1));
        this.add(p1);
        this.add(p2);        
    }   
}
