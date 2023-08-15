/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class TestBai4 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            BAI4 b4 = new BAI4();
            b4.setVisible(true);
        } catch (Exception e) {
        }
    }
}
