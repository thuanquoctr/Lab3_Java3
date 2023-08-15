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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DELL
 */
public class BAI2 extends JFrame implements ActionListener {

    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JLabel ho;
    private JLabel ten;
    private JLabel bietdanh;
    private JLabel matma;
    private JTextField txtho;
    private JTextField txtten;
    private JTextField txtbietdanh;
    private JPasswordField txtmatma;
    private JRadioButton nam;
    private JRadioButton nu;
    private JRadioButton khongxacdinh;
    private ButtonGroup gr1;
    private JLabel quequan;
    private JLabel sothich;
    private JLabel ghichu;
    private JComboBox cbx;
    private JCheckBox anchoi;
    private JCheckBox nhaymua;
    private JCheckBox ngunghi;
    private JScrollPane thanhcuon;
    private JTextArea txtthanhcuon;
    private JButton btnok;
    private JButton btnreset;
    private JButton btnexit;

    public BAI2() {
        this.setTitle("BAI2");
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);

        ho = new JLabel("Họ:");
        ho.setFont(new Font("Serif", Font.BOLD, 17));
        ten = new JLabel("Tên:");
        ten.setFont(new Font("Serif", Font.BOLD, 17));
        bietdanh = new JLabel("Biệt Danh:");
        bietdanh.setFont(new Font("Serif", Font.BOLD, 17));
        matma = new JLabel("Mật Mã:");
        matma.setFont(new Font("Serif", Font.BOLD, 17));
        p1 = new JPanel();
        p1.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "Họ Tên", TitledBorder.CENTER, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.RED
        ));
        p1.setBackground(Color.orange);
        p1.setLayout(null);
        p1.setBounds(20, 15, 750, 200);
        ho.setBounds(40, 40, 50, 50);
        p1.add(ho);

        ten.setBounds(400, 40, 50, 50);
        p1.add(ten);

        bietdanh.setBounds(40, 100, 80, 50);
        p1.add(bietdanh);

        matma.setBounds(400, 100, 70, 50);
        p1.add(matma);

        txtho = new JTextField();
        txtho.setPreferredSize(new Dimension(200, 38));
        txtho.setFont(new Font("Serif", Font.BOLD, 17));
        txtho.setBounds(135, 46, 205, 40);
        p1.add(txtho);

        txtten = new JTextField();
        txtten.setPreferredSize(new Dimension(200, 38));
        txtten.setFont(new Font("Serif", Font.BOLD, 17));
        txtten.setBounds(485, 46, 205, 40);
        p1.add(txtten);

        txtbietdanh = new JTextField();
        txtbietdanh.setPreferredSize(new Dimension(200, 38));
        txtbietdanh.setFont(new Font("Serif", Font.BOLD, 17));
        txtbietdanh.setBounds(135, 106, 205, 40);
        p1.add(txtbietdanh);

        txtmatma = new JPasswordField();
        txtmatma.setPreferredSize(new Dimension(200, 38));
        txtmatma.setFont(new Font("Serif", Font.BOLD, 17));
        txtmatma.setBounds(485, 106, 205, 40);
        p1.add(txtmatma);

        p2 = new JPanel();
        p2.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "Giới Tính", TitledBorder.LEFT, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.BLUE
        ));
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(null);
        p2.setBounds(20, 220, 750, 100);
        nam = new JRadioButton("Nam");
        nam.setFont(new Font("Serif", Font.BOLD, 17));
        nu = new JRadioButton("Nữ");
        nu.setFont(new Font("Serif", Font.BOLD, 17));
        khongxacdinh = new JRadioButton("Không xác định");
        khongxacdinh.setFont(new Font("Serif", Font.BOLD, 17));
        nam.setBounds(180, 47, 60, 30);
        nu.setBounds(320, 47, 50, 30);
        khongxacdinh.setBounds(420, 47, 140, 30);
        gr1 = new ButtonGroup();
        gr1.add(nam);
        gr1.add(nu);
        gr1.add(khongxacdinh);
        p2.add(nam);
        p2.add(nu);
        p2.add(khongxacdinh);

        Object[] ojtinhthanh = new Object[]{
            "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước",
            "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp",
            "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên",
            "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định",
            "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị",
            "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Thành phố Hồ Chí Minh",
            "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái"
        };
        quequan = new JLabel("Quê Quán: ");
        quequan.setFont(new Font("Serif", Font.BOLD, 17));
        sothich = new JLabel("Sở Thích: ");
        sothich.setFont(new Font("Serif", Font.BOLD, 17));
        ghichu = new JLabel("Ghi Chú: ");
        ghichu.setFont(new Font("Serif", Font.BOLD, 17));
        p3 = new JPanel();
        p3.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 5), "Thông Tin Khác", TitledBorder.LEFT, TitledBorder.TOP, new Font("Serif", Font.BOLD, 20), Color.BLUE
        ));
        p3.setBackground(Color.PINK);
        p3.setLayout(null);
        p3.setBounds(20, 325, 750, 265);
        quequan.setBounds(40, 20, 85, 50);
        sothich.setBounds(40, 70, 80, 50);
        ghichu.setBounds(40, 125, 80, 50);
        p3.add(quequan);
        p3.add(sothich);
        p3.add(ghichu);
        cbx = new JComboBox(ojtinhthanh);
        cbx.setSelectedIndex(-1);
        cbx.setFont(new Font("Serif", Font.BOLD, 17));
        cbx.setPreferredSize(new Dimension(200, 25));
        cbx.setBounds(180, 32, 205, 30);
        p3.add(cbx);
        anchoi = new JCheckBox("Ăn chơi");
        anchoi.setFont(new Font("Serif", Font.BOLD, 17));
        nhaymua = new JCheckBox("Nhảy múa");
        nhaymua.setFont(new Font("Serif", Font.BOLD, 17));
        ngunghi = new JCheckBox("Ngủ nghĩ");
        ngunghi.setFont(new Font("Serif", Font.BOLD, 17));
        anchoi.setBounds(180, 80, 100, 38);
        nhaymua.setBounds(330, 80, 100, 38);
        ngunghi.setBounds(470, 80, 100, 38);
        p3.add(anchoi);
        p3.add(nhaymua);
        p3.add(ngunghi);
        txtthanhcuon = new JTextArea(10, 0);
        txtthanhcuon.setLineWrap(true);
        txtthanhcuon.setFont(new Font("Serif", Font.BOLD, 17));
        thanhcuon = new JScrollPane(txtthanhcuon);
        thanhcuon.setBounds(180, 138, 500, 105);
        p3.add(thanhcuon);
        btnok = new JButton("OK");
        btnok.setBounds(135, 610, 100, 35);
        btnreset = new JButton("Reset");
        btnreset.setBounds(335, 610, 100, 35);
        btnexit = new JButton("Exit");
        btnexit.setBounds(535, 610, 100, 35);
        btnok.setFont(new Font("Serif", Font.BOLD, 17));
        btnreset.setFont(new Font("Serif", Font.BOLD, 17));
        btnexit.setFont(new Font("Serif", Font.BOLD, 17));
        btnok.addActionListener(this);
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
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(btnok);
        this.add(btnreset);
        this.add(btnexit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        if (click.equals("Reset")) {
            txtho.setText("");
            txtbietdanh.setText("");
            txtten.setText("");
            txtmatma.setText("");
            nam.setSelected(false);
            nu.setSelected(false);
            khongxacdinh.setSelected(false);
            gr1.clearSelection();
            anchoi.setSelected(false);
            nhaymua.setSelected(false);
            ngunghi.setSelected(false);
            cbx.setSelectedIndex(-1);
            txtthanhcuon.setText("");
            txtho.requestFocus();
        }
        if (click.equals("Exit")) {
            int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
        if (click.equals("OK")) {
            if (txtho.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Họ trống !");
                txtho.requestFocus();
                return;
            }
            if (txtten.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Tên trống !");
                txtten.requestFocus();
                return;
            }
            if (txtbietdanh.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Biệt danh trống !");
                txtbietdanh.requestFocus();
                return;
            }
            if (txtmatma.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mật mã trống !");
                txtmatma.requestFocus();
                return;
            }
            if (!nam.isSelected() && !nu.isSelected() && !khongxacdinh.isSelected()) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính !");
                return;
            }
            String gtinh = "";
            if (nam.isSelected()) {
                gtinh = "Nam";
            }
            if (nu.isSelected()) {
                gtinh = "Nữ";
            }
            if (khongxacdinh.isSelected()) {
                gtinh = "Không xác định";
            }
            String sothich = "";
            if (anchoi.isSelected()) {
                sothich += "Ăn chơi ,";
            }
            if (nhaymua.isSelected()) {
                sothich += "Nhảy múa ,";
            }
            if (ngunghi.isSelected()) {
                sothich += "Ngủ nghĩ ,";
            }
            int lastindex = sothich.lastIndexOf(",");
            String newsothich = sothich.substring(0, lastindex) + ".";
            JOptionPane.showMessageDialog(null, "Họ Tên: " + txtho.getText() + " " + txtten.getText() + "\nBiệt Danh: " + txtbietdanh.getText() + "\nGiới Tính: " + gtinh + "\nQuê Quán: " + cbx.getSelectedItem() + "\nSở Thích: " + newsothich + "\nGhi Chú: " + txtthanhcuon.getText(), "Thông tin cá nhân", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
