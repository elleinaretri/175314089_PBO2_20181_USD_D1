/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class TestMainFrame {
    public static void main(String[] args) {
        MainFrame test = new MainFrame();
        test.setSize(400, 500);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
