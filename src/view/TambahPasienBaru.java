/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.pasien;

/**
 *
 * @author ASUS
 */
public class TambahPasienBaru extends JDialog implements ActionListener {

    private JLabel judulLabel, namaLabel, noRekamMedisLabel, alamatLabel, jenisKelaminLabel, tanggalLahirLabel, bulanLahirLabel,
            tahunLahirLabel;
    private JTextField namaText, noRekamMedisText, alamatText;
    private JButton saveButton;
    private JRadioButton priaRadioButton, wanitaRadioButton;
    private JComboBox tanggalComboBox, bulanComboBox, tahunComboBox;
    private ButtonGroup groupButtonGroup;

    private String tanggalArray[]
            = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String bulanArray[]
            = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    private String tahunArray[]
            = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001"};

    public TambahPasienBaru(String form_Tambah_Pasien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TambahPasienBaru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("Formulir Daftar Antrian");
        judulLabel.setBounds(140, 10, 200, 20);
        this.add(judulLabel);
        
         namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 90, 100, 50);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(120, 105, 200, 20);
        this.add(namaText);

        noRekamMedisLabel = new JLabel("NIK");
        noRekamMedisLabel.setBounds(20, 50, 100, 50);
        this.add(noRekamMedisLabel);

        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(120, 65, 200, 20);
        this.add(noRekamMedisText);

       

        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(20, 130, 100, 50);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(120, 145, 200, 20);
        this.add(alamatText);

        jenisKelaminLabel = new JLabel("Jenis Kelamin");
        jenisKelaminLabel.setBounds(20, 165, 100, 50);
        this.add(jenisKelaminLabel);

        priaRadioButton = new JRadioButton("Pria", true);
        priaRadioButton.setBounds(120, 180, 50, 20);
        this.add(priaRadioButton);

        wanitaRadioButton = new JRadioButton("Wanita", true);
        wanitaRadioButton.setBounds(120, 200, 120, 20);
        this.add(wanitaRadioButton);

        groupButtonGroup = new ButtonGroup();
        groupButtonGroup.add(priaRadioButton);
        groupButtonGroup.add(wanitaRadioButton);

        tanggalLahirLabel = new JLabel("Tanggal");
        tanggalLahirLabel.setBounds(20, 230, 80, 20);
        this.add(tanggalLahirLabel);

        tanggalComboBox = new JComboBox(tanggalArray);
        tanggalComboBox.setBounds(75, 230, 40, 20);
        this.add(tanggalComboBox);

        bulanLahirLabel = new JLabel("Bulan");

        bulanLahirLabel.setBounds(120, 230, 80, 20);
        this.add(bulanLahirLabel);

        bulanComboBox = new JComboBox(bulanArray);

        bulanComboBox.setBounds(160, 230, 40, 20);
        this.add(bulanComboBox);

        tahunLahirLabel = new JLabel("Tahun");

        tahunLahirLabel.setBounds(210, 230, 80, 20);
        this.add(tahunLahirLabel);

        tahunComboBox = new JComboBox(tahunArray);

        tahunComboBox.setBounds(250, 230, 90, 20);
        this.add(tahunComboBox);

        saveButton = new JButton("SIMPAN");

        saveButton.setBounds(140, 300, 100, 30);
        this.add(saveButton);

        saveButton.addActionListener(this);

    }
    

    /**
     * digunakan untuk melakukan tindakan dimana menggunakan implements dari
     * kelas ActionListener dengan membuat method actionPerformed dengan
     * parameter e bertipe data ActionEvent
     *
     * @param e ActionEvent
     */
    public void actionPerformed(pasien pasien) {
        if (pasien.getSource() == saveButton) {
            pasien daftar = new pasien();
            daftar.setNama(namaText.getText());
            daftar.setAlamat(alamatText.getText());
            daftar.setNoRekamMedis(noRekamMedisText.getText());
            pasien.tambahPasienBaru(daftar);
            JOptionPane.showMessageDialog(null, namaText.getText() + "\nAnda Terdaftar");
            this.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
