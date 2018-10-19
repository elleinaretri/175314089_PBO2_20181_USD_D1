package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
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
public class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    
    private JTextField namaText;
    private JLabel noRekamMedisLabel;
    private JLabel alamatLabel;
    private JTextField alamatText;
    private JTextField noRekamMedisText;
    private JTextField simpanText;
    private JButton saveButton;

    public DaftarAntrianDialog(){
        init();
    }
    
//    public DaftarAntrianDialog(String judul) {
//        this.setTitle(judul);
//        init();
//        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("Formulir Daftar Antrian");
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 100, 100, 50);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(70, 115, 200, 20);
        this.add(namaText);

        noRekamMedisLabel = new JLabel ("No Rekam Medis");
        noRekamMedisLabel.setBounds(20, 60, 100, 50);
        this.add(noRekamMedisLabel);
        
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(70, 75, 200, 20);
        this.add(noRekamMedisText);
        
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(70, 115, 200, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(70, 155, 200, 20);
        this.add(alamatText);

        saveButton = new JButton("Simpan");
        saveButton.setBounds(80, 190, 100, 30);
        this.add(saveButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noRekamMedisText){
            if (pasien.cariPasien(noRekamMedisText.getText()) != null){
              namaText.setText(pasien.cariPasien(noRekamMedisText.getText()).getNama());;
              alamatText.setText(pasien.cariPasien(noRekamMedisText.getText()).getAlamat());
            } else {
                JOptionPane.showMessageDialog(null, "Nomor rekam medis : " + noRekamMedisText.getText() + " tidak ditemukan");
            }
        }
    }

}
