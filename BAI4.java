/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DELL
 */
public class BAI4 extends JFrame implements ActionListener {

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JLabel titel, firstname, lastname, contact, address, highest, spe, enroll, hobbies, sport;
    private JTextField txtfirstname, txtlastname, txtcontact, txthighest, txtspe, txtenroll, txthobbies, txtsport;
    private JScrollPane thanhcuon;
    private JTextArea txtaddress;
    private JButton btnsave, btnreset, btnexit;

    public BAI4() {
        this.setTitle("BAI4");
        this.setSize(650, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        titel = new JLabel("STUDENT REGISTRATION");
        titel.setFont(new Font("Serif", Font.BOLD, 35));
        titel.setBounds(100, 10, 600, 70);
        titel.setForeground(Color.blue);
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBorder(new TitledBorder(new LineBorder(Color.GRAY, 5), "Personal Details", TitledBorder.CENTER, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.RED));
        p1.setBounds(18, 80, 600, 250);
        firstname = new JLabel("First Name: ");
        firstname.setFont(new Font("Serif", Font.BOLD, 17));
        firstname.setBounds(50, 20, 100, 50);
        p1.add(firstname);

        lastname = new JLabel("Last Name: ");
        lastname.setFont(new Font("Serif", Font.BOLD, 17));
        lastname.setBounds(50, 60, 100, 50);
        p1.add(lastname);

        contact = new JLabel("Contact: ");
        contact.setFont(new Font("Serif", Font.BOLD, 17));
        contact.setBounds(50, 100, 100, 50);
        p1.add(contact);

        address = new JLabel("Address: ");
        address.setFont(new Font("Serif", Font.BOLD, 17));
        address.setBounds(50, 140, 100, 50);
        p1.add(address);

        txtfirstname = new JTextField();
        txtfirstname.setPreferredSize(new Dimension(350, 30));
        txtfirstname.setFont(new Font("Serif", Font.BOLD, 17));
        txtfirstname.setBounds(180, 30, 355, 35);
        p1.add(txtfirstname);

        txtlastname = new JTextField();
        txtlastname.setPreferredSize(new Dimension(350, 30));
        txtlastname.setFont(new Font("Serif", Font.BOLD, 17));
        txtlastname.setBounds(180, 70, 355, 35);
        p1.add(txtlastname);

        txtcontact = new JTextField();
        txtcontact.setPreferredSize(new Dimension(350, 30));
        txtcontact.setFont(new Font("Serif", Font.BOLD, 17));
        txtcontact.setBounds(180, 110, 355, 35);
        p1.add(txtcontact);

        txtaddress = new JTextArea(50, 0);
        txtaddress.setFont(new Font("Serif", Font.BOLD, 17));
        txtaddress.setLineWrap(true);
        thanhcuon = new JScrollPane(txtaddress);
        thanhcuon.setBounds(180, 150, 355, 80);
        p1.add(thanhcuon);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBorder(new TitledBorder(new LineBorder(Color.GRAY, 5), "Acamedic Details", TitledBorder.LEFT, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.RED));
        p2.setBounds(18, 330, 600, 160);
        highest = new JLabel("Highest Qualification: ");
        highest.setFont(new Font("Serif", Font.BOLD, 17));
        highest.setBounds(100, 20, 160, 50);
        p2.add(highest);

        spe = new JLabel("Specification: ");
        spe.setFont(new Font("Serif", Font.BOLD, 17));
        spe.setBounds(100, 60, 130, 50);
        p2.add(spe);

        enroll = new JLabel("Enroll For: ");
        enroll.setFont(new Font("Serif", Font.BOLD, 17));
        enroll.setBounds(100, 100, 130, 50);
        p2.add(enroll);

        txthighest = new JTextField();
        txthighest.setPreferredSize(new Dimension(300, 30));
        txthighest.setFont(new Font("Serif", Font.BOLD, 17));
        txthighest.setBounds(280, 30, 305, 35);
        p2.add(txthighest);

        txtspe = new JTextField();
        txtspe.setPreferredSize(new Dimension(300, 30));
        txtspe.setFont(new Font("Serif", Font.BOLD, 17));
        txtspe.setBounds(280, 70, 305, 35);
        p2.add(txtspe);

        txtenroll = new JTextField();
        txtenroll.setPreferredSize(new Dimension(300, 30));
        txtenroll.setFont(new Font("Serif", Font.BOLD, 17));
        txtenroll.setBounds(280, 110, 305, 35);
        p2.add(txtenroll);

        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBorder(new TitledBorder(new LineBorder(Color.GRAY, 5), "Extracurricular Details", TitledBorder.LEFT, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.RED));
        p3.setBounds(18, 490, 600, 125);
        hobbies = new JLabel("Hobbies: ");
        hobbies.setFont(new Font("Serif", Font.BOLD, 17));
        hobbies.setBounds(100, 20, 80, 50);
        p3.add(hobbies);

        sport = new JLabel("Sport: ");
        sport.setFont(new Font("Serif", Font.BOLD, 17));
        sport.setBounds(100, 60, 80, 50);
        p3.add(sport);

        txthobbies = new JTextField();
        txthobbies.setPreferredSize(new Dimension(360, 30));
        txthobbies.setFont(new Font("Serif", Font.BOLD, 17));
        txthobbies.setBounds(220, 30, 365, 35);
        p3.add(txthobbies);

        txtsport = new JTextField();
        txtsport.setPreferredSize(new Dimension(360, 30));
        txtsport.setFont(new Font("Serif", Font.BOLD, 17));
        txtsport.setBounds(220, 70, 365, 35);
        p3.add(txtsport);

        p4 = new JPanel();
        p4.setLayout(null);
        p4.setBorder(new TitledBorder(new LineBorder(Color.GRAY, 5)));
        p4.setBounds(18, 620, 600, 70);
        btnsave = new JButton("Save");
        btnsave.setFont(new Font("Serif", Font.BOLD, 17));
        btnsave.setBounds(100, 17, 100, 35);
        btnreset = new JButton("Reset");
        btnreset.setFont(new Font("Serif", Font.BOLD, 17));
        btnreset.setBounds(250, 17, 100, 35);
        btnexit = new JButton("Exit");
        btnexit.setFont(new Font("Serif", Font.BOLD, 17));
        btnexit.setBounds(400, 17, 100, 35);
        p4.add(btnsave);
        p4.add(btnreset);
        p4.add(btnexit);
        btnsave.addActionListener(this);
        btnreset.addActionListener(this);
        btnexit.addActionListener(this);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        });

        this.setLayout(null);
        this.add(titel);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        if (click.equals("Save")) {
            if (txtfirstname.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "First Name trống !");
                txtfirstname.requestFocus();
                return;
            }
            if (txtlastname.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Last Name trống !");
                txtlastname.requestFocus();
                return;
            }
            if (txtcontact.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Contact trống !");
                txtcontact.requestFocus();
                return;
            }
            if (txtaddress.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Address trống !");
                txtaddress.requestFocus();
                return;
            }
            if (txthighest.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Highest Qualification trống !");
                txthighest.requestFocus();
                return;
            }
            if (txtspe.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Specification trống !");
                txtspe.requestFocus();
                return;
            }
            if (txtenroll.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Enroll For trống !");
                txtenroll.requestFocus();
                return;
            }
            if (txthobbies.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Hobbies trống !");
                txthobbies.requestFocus();
                return;
            }
            if (txtsport.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Sport trống !");
                txtsport.requestFocus();
                return;
            }
            JOptionPane.showMessageDialog(null, "First Name: " + txtfirstname.getText() + "\nLast Name: " + txtlastname.getText() + "\nContact: " + txtcontact.getText() + "\nAddress: " + txtaddress.getText() + "\nHighest Qualification: " + txthighest.getText() + "\nSpecification: " + txtspe.getText() + "\nEnroll For: " + txtenroll.getText() + "\nHobbies: " + txthobbies.getText() + "\nSport: " + txtsport.getText(), "Thông tin cá nhân", JOptionPane.INFORMATION_MESSAGE);
        }
        if (click.equals("Reset")) {
            txtfirstname.setText("");
            txtlastname.setText("");
            txtcontact.setText("");
            txtaddress.setText("");
            txthighest.setText("");
            txtspe.setText("");
            txtenroll.setText("");
            txthobbies.setText("");
            txtsport.setText("");
        }
        if (click.equals("Exit")) {
            int exit = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (exit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }

}
