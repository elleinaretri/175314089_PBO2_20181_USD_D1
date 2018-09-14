/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien_2018;

/**
 *
 * @author ASUS
 */

    public class antrian {
    private int nomorAntrian = 0; //mendeklarasikan variabel nomorAntrian dengan tipe data integer dan menggunakan private
    //karena tidak semua kelas bisa mengaksesnya.
    private final int JUMLAH_MAKSIMAL_PASIEN = 50; //mendeklarasikan JUMLAH_MAKSIMAL_PASIEN dengan tipe data ineteger dan 
    //menggunakan private karena tidak semua kelas bisa mengaksesnya dan nilainya pun sudah ditentukan.
    private pasien[] daftarPasien = new pasien[JUMLAH_MAKSIMAL_PASIEN]; //membuat obyek baru yang diberi nama daftarPasien 
  
    
    public void mendaftar(pasien Pasien) throws Exception{ //membuat methode mendaftar dan diberi parameter Pasien)
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN){ //menuliskan kondisi jika nomor antrian kurang dari jumlah maks pasien
            daftarPasien [nomorAntrian] = Pasien;
            nomorAntrian++;
        } else { //mengakhiri suatu kondisi
            throw new Exception("Antrian Penuh!"); //menampilkan kondisi jika antrian penuh
            
        }
}
    }
