package view;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

      public class DaftarAntrianDialog extends JDialog{
    private JLabel judulLabel, alamatLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField simpanText;
    private JButton saveButton;
    private JLabel namaLabel;
    
    public DaftarAntrianDialog(String judul){
        this.setTitle(judul);
        init();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        this.setLayout(null);
        judulLabel = new JLabel ("Formulir Daftar Antrian");
        judulLabel.setBounds(50, 50, 190, 10);
        this.add(judulLabel);
        
        namaLabel = new JLabel ("Nama");
        namaLabel.setBounds(20, 100, 50, 50);
        this.add(namaLabel);
        
        namaText = new JTextField ();
        namaText.setBounds(80, 100, 100, 30);
        this.add(namaText);
        
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 140, 50, 30);
        this.add(alamatLabel);
        
        alamatText = new JTextField();
        alamatText.setBounds(80, 140, 100, 30);
        this.add(alamatText);
        
        saveButton = new JButton("Simpan");
        saveButton.setBounds(80,190,100,30);
        this.add(saveButton);
        
    }

}

