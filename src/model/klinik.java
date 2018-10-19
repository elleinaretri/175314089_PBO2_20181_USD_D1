/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */

    public class klinik {

    /**
     *
     */
        
//    public static ArrayList < klinik> daftarKlinik = new ArrayList< klinik >{
//        public static void tambahklinik(klinik klinik){
//            daftarKlinik.add(klinik);
//        }
//        
//    public static klinik cariKlinik (String namaKlinik){
//        for (int i = 0; i < daftarKlinik.size(); i++) {
//            if (daftarKlinik.get(i).equalsIgnoreCase(namaKlinik))
//            {
//                
//            }
//        }
//        return null;
//            
//        
//    }
    private String ID_Klinik; //mendeklarasikan ID_Klinik menggunakan tipe data String dan menggunakan private karena
    //tidak semua kelas bisa mengaksesnya
    private String namaPasien; //mendeklarasikan namaPasien menggunakan tipe data String dan mmenggunakan private karena 
    //tidak semua kelas bisa mengaksesnya
    //Object getNamaKlinik;

    public klinik(String ID_Klinik, String namaPasien) {  //menuliskan methode klinik yang diberi parameter String ID_Klinik dan 
        //String namaPasien
        this.ID_Klinik = ID_Klinik; //mengakses variabel ID_Klinik
        this.namaPasien = namaPasien; //mengakses variabel nama pasien
    }

    public klinik() { //menuliskan methode kosong
    }

    public String getID_Klinik() { //mengambil data ID_Klinik yang sudah ditulis di methode getter ID_Klinik
        return ID_Klinik;//menuliskan nilai balik pada methode ID_Klinik
    }

    public void setID_Klinik(String ID_Klinik) { //mengisi data dari variabel ID_Klinik melalui methode setter ID_Klinik
        this.ID_Klinik = ID_Klinik; //mengakses variabel ID_Klinik
    }

    public String getNamaPasien() { ///mengambil data nama pasien yang sudah ditulis di methode getter nama pasien
        return namaPasien;//menuliskan nilai balik pada methode NamaPasien
    }

    public void setNamaPasien(String namaPasien) { //mengisi data dari variabel nama pasien melalui methode setter nama pasien
        this.namaPasien = namaPasien; //mengakses variabel ID_Klinik
    }

   
   
}



