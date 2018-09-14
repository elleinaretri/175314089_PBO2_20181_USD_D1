/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien_2018;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class AntrianPasien {


    /**
     *
     * @author ASUS
     */
    private klinik Klinik; //mendeklarasikan Klinik dengan tipe data klinik dan menggunakan private karena tidak semua
    //kelas bisa mengaksesnya

    public AntrianPasien(klinik Klinik) {
        this.Klinik = Klinik; //mengakses variabel ID_Klinik
    }

    public AntrianPasien() { //menuliskan methode kosong 
    }

    private ArrayList<pasien> daftarPasien = new ArrayList<pasien>();

    public klinik getKlinik() { //mengambil data klinik yang sudah ditulis di methode getter klinik
        return Klinik; //menuliskan nilai balik pada methode klinik
    }

    public void setKlinik(klinik Klinik) { //mengisi data dari variabel klinik melalui methode setter klinik
        this.Klinik = Klinik; //mengakses variabel Klinik
    }

    public ArrayList<pasien> getDaftarPasien() { //mengambil data daftar pasien yang sudah ditulis di methode daftar pasien
        return daftarPasien; //menuliskan nilai balik pada methode daftar pasien
    }

    public void setDaftarPasien(ArrayList<pasien> daftarPasien) { //mengisi data dari variabel daftar pasien melalui methode setter daftar pasien
        this.daftarPasien = daftarPasien; //mengakses variabel daftar pasien
    }

    public void TanggalAntrian() { //membuat methode tanggal antrian
        Date date = new Date(); //membuat obyek baru yang diberi nama 'date'
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy"); //menuliskan format tanggal antrian
        System.out.println(ft.format(date)); //menampilkan hasil format tanggal antrian

    }

    public void Mendaftar(pasien Pasien) { //membuat methode mendaftar
        daftarPasien.add(Pasien); //menambahkan pasien ke daftar pasien
    }
}


