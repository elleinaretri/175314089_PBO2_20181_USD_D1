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


    /**
     * @param args the command line arguments
     */
   

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author acer
 */
public class pasien {

    private String noRekamMedis, nama, alamat, tempatLahir, nik;

    //mendeklarasikan noRekamMedis, nama, alamat, tempatLahir dengan tipe data String dan menggunakan private
    //karena tidak semua methode bisa menggunakannya/tersembunyi/tidak semua bisa mengakses.
    private int tanggalKelahiran, tanggalLahir, bulanLahir, tahunLahir;

    //mendeklarasikan tanggalKelahiran, tanggalLahir, bulanLahir, tahunLahir dengan tipe data integer dan menggunakan private
    //karena tidak semua methode bisa menggunakannya/tersembunyi/tidak semua bisa mengakses.
    /**
     *
     * @param tanggalLahir
     * @throws java.lang.Exception
     */
    public pasien() {
        //menuliskan methode kosong 
    }

    public pasien(String nama, String alamat, String tempatLahir, String noRekamMedis,
            int tanggalLahir, int bulanLahir, int tahunLahir, String nik, int tanggalKelahiran) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.noRekamMedis = noRekamMedis;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
        this.tanggalKelahiran = tanggalKelahiran;

    }
    public static ArrayList<pasien> daftarPasienKlinik
            = new ArrayList<pasien>();

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        //menuliskan methode set tanggalLahir untuk mengisi kondisi tanggal lahir dan menggunakan pengecualian
        if (tanggalLahir > 0 && tanggalLahir < 32) { //kondisi pertama. jika tanggalLahie lebih dari 0 dan kurang dari 32
            //maka tanggallahir tersebut dapat ditemukan. dan sistem akan memberi nilai keluaran tanggal lahir yang
            //benar
            this.tanggalLahir = tanggalLahir; //digunakan untuk mengakses  variabel tanggal lahir.
        } else { //kondisi kedua.
            throw new Exception("Tanggal Lahir yang anda masukkan salah"); //menuliskan throw new exception yang digunakan untuk 
            //mrndeteksi kesalahan-kesalahan yang mungkin terjadi. misalnya: ketika seorang pengguna memasukkan tanggal lahir kurang
            //dari 0 dan lebih dari 32
        }
    }

    public void getTanggalKelahiran() {
        //menuliskan methode get tanggalKelahiran yang berfungsi untuk mengambil data tanggalKelahiran.
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        //menuliskan suatu kondisi mengenai tanggal kelahiran.
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        //menuliskan simple date format yang digunakan untuk memformat tanggal dan waktu berdasarkan aturan yang ada
        System.out.println(ft.format(tanggalKelahiran));
        //menampilkan tanggal kelahiran yang sudah diformat.

    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        //menuliskan methode set bulanLahir untuk mengisi kondisi bulan lahir dan menggunakan pengecualian 
        if (bulanLahir > 0 && bulanLahir < 13) { //menuliskan suatu kondisi jika bulanLahir kurang dari 0 dan lebih dari 13
            this.bulanLahir = bulanLahir; //digunakan untuk mengakses variabel bulanLahir.
        } else { //mengakhiri suatu kondisi
            throw new Exception("bulan lahir yang anda masukkan salah"); //menuliskan throw new exception yang digunakan untuk 
            //mrndeteksi kesalahan-kesalahan yang mungkin terjadi. misalnya: ketika seorang pengguna memasukkan bulan lahir kurang
            //dari 1 dan lebih dari 12

        }
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        //menuliskan methode set bulanLahir untuk mengisi kondisi bulan lahir dan menggunakan pengecualian 
        if (tahunLahir > 0) { //menuliskan suatu kondisi jika tahunLahir kurang dari 0
            this.tahunLahir = tahunLahir; //digunakan untuk mengakses variabel tahunaLahir
        } else { //mengakhiri suatu kondisi
            throw new Exception("tahun lahir yang anda masukkan salah");//menuliskan throw new exception yang digunakan untuk 
            //mrndeteksi kesalahan-kesalahan yang mungkin terjadi. 

        }

    }

    public void setNama(String nama) { //mengisi data dari variabel nama melalui methode setter nama
        this.nama = nama; //mengakses variabel nama
    }

    public void setAlamat(String alamat) { //mengisi data dari variabel alamat melalui methode setter alamat
        this.alamat = alamat; //mengakses variabel alamat
    }

    public void setTempatLahir(String tempatLahir) { //mengisi data dari variabel tempat lahir melalui methode setter tempat lahir
        this.tempatLahir = tempatLahir; //mengakses variabel tempat lahir
    }

    public void setNoRekamMedis(String noRekamMedis) { //mengisi data dari variabel no rekam medis melalui methode setter no rekam medis
        this.noRekamMedis = noRekamMedis; //mengakses variabel no rekam medis
    }

    public String NoRekamMedis() { //menuliskan methode rekam medis untuk mengolah data rekam medis
        String NoRekamMedis; //mendeklarasikan variabel rekam medis mengguunakan tipe data string
        Date date = new Date(); //membuat obyek baru yang diberi nama date 
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd"); //menuliskan format tanggal,bulan dan tahun kelahiran yang akan digunakan 
        //untuk nomor rekam medis pasien
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        return noRekamMedis; //memberikan nilai balik pada methode no rekam medis
    }

    public String getNoRekamMedis() { //mengambil data no rekam medis yang sudah ditulis di methode no rekam medis
        return noRekamMedis; //menuliskan nilai balik pada methode no rekam medis
    }

    public String getNama() { //mengambil data nama yang sudah ditulis di methode nama
        return nama; //menuliskan nilai balik pada methode nama
    }

    public String getAlamat() {//mengambil data alamat yang sudah ditulis di methode alamat

        return alamat;//menuliskan nilai balik pada methode alamat
    }

    public String getTempatLahir() {//mengambil data tempat lahir yang sudah ditulis di methode tempat lahir
        return tempatLahir;//menuliskan nilai balik pada methode tempatlahir
    }

    public int getTanggalLahir() {//mengambil data tanggal lahir yang sudah ditulis di methode tanggal lahir
        return tanggalLahir;//menuliskan nilai balik pada methode tanggal lahir
    }

    public int getBulanLahir() {//mengambil data bulan lahir yang sudah ditulis di methode bulan lahir
        return bulanLahir;//menuliskan nilai balik pada methode bulan lahir
    }

    public int getTahunLahir() {//mengambil data tahun lahir yang sudah ditulis di methode tahun lahir
        return tahunLahir;//menuliskan nilai balik pada methode tahun lahir
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void tambahPasienBaru(pasien test) {

    }

    public pasien cariPasien(String noRekamMedis) {
        return null;

    }
}


