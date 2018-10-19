/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
import javax.swing.JButton;

/**
 *
 * @author Elleina
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

    public pasien(String nama, String alamat, String tempatLahir,
            int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
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

    public static void tambahPasienBaru(pasien test) {
        daftarPasienKlinik.add(test);
    }

    public static pasien cariPasien(String noRekamMedis) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (noRekamMedis == null ? daftarPasienKlinik.get(i).getNoRekamMedis() == null
                    : noRekamMedis.equals(daftarPasienKlinik.get(i).getNoRekamMedis())) {

                return daftarPasienKlinik.get(i);

            }

        }

        return null;

    }

    public JButton getSource() {
        return null;
    }
    
}
//    private static ArrayList<Pasien> daftarPasien= 
//            new ArrayList<Pasien>();
//    
//    public static void tambahPasien(Pasien pasien){
//        getDaftarPasien().add(pasien);
//    }
//    
//    public static Pasien cariPasien(String noRM){
//        for (int i = 0; i < getDaftarPasien().size(); i++) {
//            if(getDaftarPasien().get(i).getNoRM().equalsIgnoreCase(noRM))
//                return getDaftarPasien().get(i);
//        }
//        return null;
//    }
//    
//    private String nama;
//    private int tanggalLahir;
//    private int bulanLahir;
//    private int tahunLahir;
//    private String alamat;
//    private String noRM;
//    private String nik;
//
//    public pasien(String nama) {
//        this.nama = nama;
//    }
//    
//    public pasien(String noRM,String nama) {
//        this.nama = nama;
//        this.noRM = noRM;
//    }
//
//    public pasien() {
//    }
//
//    /**
//     * @return the nama
//     */
//    public String getNama() {
//        return nama;
//    }
//
//    /**
//     * @param nama the nama to set
//     */
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    
//    public int getUsia(){
//        Date today = new Date();
//        Date tglLahir = new Date(
//                getTahunLahir()-1900, // tahun lahir
//                getBulanLahir()-1, // bulan lahir
//                getTanggalLahir() // tanggal lahir
//        );
//        return today.getYear() - tglLahir.getYear();
//    }
//
//    /**
//     * @return the alamat
//     */
//    public String getAlamat() {
//        return alamat;
//    }
//
//    /**
//     * @param alamat the alamat to set
//     */
//    public void setAlamat(String alamat) {
//        this.alamat = alamat;
//    }
//
//    /**
//     * @return the noRM
//     */
//    public String getNoRM() {
//        return noRM;
//    }
//
//    /**
//     * @param noRM the noRM to set
//     */
//    public void setNoRM(String noRM) {
//        this.noRM = noRM;
//    }
//
//    /**
//     * @return the nik
//     */
//    public String getNik() {
//        return nik;
//    }
//
//    /**
//     * @param nik the nik to set
//     */
//    public void setNik(String nik) {
//        this.nik = nik;
//    }
//
//    /**
//     * @return the daftarPasien
//     */
////    public static ArrayList<Pasien> getDaftarPasien() {
////        return daftarPasien;
////    }
////
////    /**
////     * @param aDaftarPasien the daftarPasien to set
////     */
////    public static void setDaftarPasien(ArrayList<Pasien> aDaftarPasien) {
////        daftarPasien = aDaftarPasien;
////    }
////
////    /**
////     * @param tanggalLahir the tanggalLahir to set
////     */
////    public void setTanggalLahir(int tanggalLahir) {
////        this.tanggalLahir = tanggalLahir;
////    }
////
////    /**
////     * @return the bulanLahir
////     */
////    public int getBulanLahir() {
////        return bulanLahir;
////    }
////
////    /**
////     * @param bulanLahir the bulanLahir to set
////     */
////    public void setBulanLahir(int bulanLahir) {
////        this.bulanLahir = bulanLahir;
////    }
////
////    /**
////     * @return the tahunLahir
////     */
////    public int getTahunLahir() {
////        return tahunLahir;
////    }
////
////    /**
////     * @param tahunLahir the tahunLahir to set
////     */
////    public void setTahunLahir(int tahunLahir) {
////        this.tahunLahir = tahunLahir;
////    }
////
////    /**
////     * @return the tanggalLahir
////     */
////    public int getTanggalLahir() {
////        return tanggalLahir;
////    }
////}
