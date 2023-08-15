/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class BAI1 extends JFrame implements ActionListener {

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JButton btnred;
    private JButton btngreen;
    private JButton btnyellow;
    private JButton btnnorth;
    private JButton btnsouth;
    private JButton btnwest;
    private JButton btneast;
    private JButton btncenter;
    private JTextField txttext;

    public BAI1() {
        this.setTitle("BAI1");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnred = new JButton("Red");
        btngreen = new JButton("Green");
        btnyellow = new JButton("Yellow");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 60));
        p1.add(btnred);
        p1.add(btngreen);
        p1.add(btnyellow);

        btnnorth = new JButton("North");
        btnsouth = new JButton("South");
        btnwest = new JButton("West");
        btneast = new JButton("East");
        btncenter = new JButton("Center");
        p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(btnnorth, BorderLayout.NORTH);
        p2.add(btnsouth, BorderLayout.SOUTH);
        p2.add(btnwest, BorderLayout.WEST);
        p2.add(btneast, BorderLayout.EAST);
        p2.add(btncenter, BorderLayout.CENTER);

        txttext = new JTextField("Chào các bạn sinh viên Fpoly, Java 3");
        txttext.setForeground(Color.BLUE);
        txttext.setFont(new Font("Serif", Font.BOLD, 17));
        txttext.setPreferredSize(new Dimension(620, 50));
        p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 45));
        p3.add(txttext);

        p4 = new JPanel();
        p4.setBackground(Color.magenta);
        p4.setLayout(new GridLayout(2, 5, 5, 5));
        for (int i = 1; i <= 10; i++) {
            JButton btn = new JButton();
            p4.add(btn);
        }

        btnred.addActionListener(this);
        btngreen.addActionListener(this);
        btnyellow.addActionListener(this);
        btnnorth.addActionListener(this);
        btnsouth.addActionListener(this);
        btnwest.addActionListener(this);
        btneast.addActionListener(this);
        btncenter.addActionListener(this);

        this.setLayout(new GridLayout(4, 1));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        if (click.equals("Red")) {
            p1.setBackground(Color.red);
        }
        if (click.equals("Green")) {
            p1.setBackground(Color.green);
        }
        if (click.equals("Yellow")) {
            p1.setBackground(Color.yellow);
        }
        if (click.equals("North")) {
            for (int i = 0; i < 10; i++) {
                JButton btn = (JButton) p4.getComponent(i);
                if (btn.getText().isEmpty()) {
                    btn.setText("North");
                    return;
                }
            }
        }
        if (click.equals("South")) {
            for (int i = 0; i < 10; i++) {
                JButton btn = (JButton) p4.getComponent(i);
                if (btn.getText().isEmpty()) {
                    btn.setText("South");
                    return;
                }
            }
        }
        if (click.equals("West")) {
            for (int i = 0; i < 10; i++) {
                JButton btn = (JButton) p4.getComponent(i);
                if (btn.getText().isEmpty()) {
                    btn.setText("West");
                    return;
                }
            }
        }
        if (click.equals("East")) {
            for (int i = 0; i < 10; i++) {
                JButton btn = (JButton) p4.getComponent(i);
                if (btn.getText().isEmpty()) {
                    btn.setText("East");
                    return;
                }
            }
        }
        if (click.equals("Center")) {
            for (int i = 0; i < 10; i++) {
                JButton btn = (JButton) p4.getComponent(i);
                if (btn.getText().isEmpty()) {
                    btn.setText("Center");
                    return;
                }
            }
        }
    }
}
