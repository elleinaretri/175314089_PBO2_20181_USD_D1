/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.pasien;



/**
 *
 * @author ASUS
 */
public class TestKelasPasien {
    public static void main(String[] args) {
        
    pasien test = new pasien(
                "Puspa", // nama pasien
                "Klaten", // alamat
                "Medan", // tempat lahir
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                "19740112" // NIK
        );
        
        pasien test1 = new pasien(
                "Budi", // nama pasien
                "Klaten", // alamat
                "Klaten", // tempat lahir
                10, // tanggal lahir
                01, // bulan lahir
                1999, // tahun lahir
                "19990110" // NIK
        );
       
       pasien.tambahPasienBaru(test);
       pasien.tambahPasienBaru(test1);
  
        
        for (int i = 0; i < pasien.daftarPasienKlinik.size(); i++) {
            System.out.println("Nama : "+pasien.daftarPasienKlinik.get(i).getNama());
        }
        
        pasien cari = pasien.cariPasien("19990110");
        System.out.println("Nama Hasil Pencarian = "+cari.getNama());
    }
}
