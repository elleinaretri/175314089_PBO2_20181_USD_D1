package view;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.pasien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

  

/**
 *
 * @author ASUS
 */

    public class LatihanDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JTextField namaText;

    public LatihanDialog() {
        init();
    }

    public LatihanDialog(String title) {
        this.setTitle(title);
        init();
    }

    /**
     * Fungsi inisialisasi atribut
     */
    public void init() {
        this.setLayout(null);
        // label nama
        namaLabel = new JLabel("Nama");
        // pengaturan posisi label : posisi 50,250, lebar 50, tinggi 10
        namaLabel.setBounds(50, 250, 250, 20);
        namaLabel.setFont(new Font(null,Font.PLAIN,18));
        this.add(namaLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object tambahButton = null;
        if(e.getSource()==tambahButton){
            pasien baru = new pasien();
            baru.setNama(namaText.getText());
//            baru.setAlamat(alamatText.getText());
            
//            pasien.tambahPasienBaru(baru);
            
            this.dispose();
        }
    }
}


