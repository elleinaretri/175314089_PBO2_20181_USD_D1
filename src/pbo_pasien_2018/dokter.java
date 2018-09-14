/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien_2018;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class dokter {

   
    /**
     *
     * @author acer
     */
    private String nomorPegawai, nama, alamat, tempatLahir;
//mendeklarasikan nomorPegawai,nama,alamat, tempatLahir dengan tipe data String dan menggunakan private karena
//tidak semua kelas bisa mengaksesnya.
    private int tanggalLahir, bulanLahir, tahunLahir;
//mendeklarasikan tanggalLahir, bulanLahir, tahunLahir dengan tipe data integer dan menggunakan private karena 
//tidak semua kelas bisa mengaksesnya.

    public dokter() { //menuliskan metthode kosong

    }

    public void setNomorPegawai(String nomorPegawai) { //mengisi data dari variabel nomorPegawai melalui methode setter nomorPegawai
        this.nomorPegawai = nomorPegawai;//mengakses variabel nomorPegawai
    }

    public void setNama(String nama) {//mengisi data dari variabel nama melalui methode setter nama
        this.nama = nama;//mengakses variabel nama
    }

    public void setAlamat(String alamat) {//mengisi data dari variabel alamat melalui methode setter alamat
        this.alamat = alamat;//mengakses variabel alamat
    }

    public void setTempatLahir(String tempatLahir) {//mengisi data dari variabel tempat lahir melalui methode setter tempat lahir
        this.tempatLahir = tempatLahir;//mengakses variabel tempat lahir
    }

    public void setTanggalLahir(int tanggalLahir) {//mengisi data dari variabel tanggal lahir melalui methode setter tanggal lahir
        this.tanggalLahir = tanggalLahir;//mengakses variabel tanggal lahir

    }

    public String getNomorPegawai() {//mengambil data nomor pegawai yang sudah ditulis di methode getter nomor pegawai
        return nomorPegawai; //menuliskan nilai balik pada methode nomor pegawai
    }

    public String getNama() {//mengambil data nama yang sudah ditulis di methode getter nama
        return nama; //menuliskan nilai balik pada methode nama
    }

    public String getAlamat() { //mengambil data alamat yang sudah ditulis di methode getter alamat
        return alamat; //menuliskan nilai balik pada methode alamat
    }

    public String getTempatLahir() { ///mengambil data tempat lahir yang sudah ditulis di methode getter tempat lahir
        return tempatLahir; //menuliskan nilai balik pada methode tempat lahir
    }

    public int getTanggalLahir() { ///mengambil data tanggal lahir yang sudah ditulis di methode getter tanggal lahir
        return tanggalLahir; //menuliskan nilai balik pada methode tanggal lahir
    }

    public int getBulanLahir() { ///mengambil data bulan lahir yang sudah ditulis di methode getter bulan lahir
        return bulanLahir; //menuliskan nilai balik pada methode bulan lahir
    }

    public int getTahunLahir() { ///mengambil data tahun lahir yang sudah ditulis di methode getter tahun lahir
        return tahunLahir; //menuliskan nilai balik pada methode tahun lahir
    }

    public void setBulanLahir(int bulanLahir) {//mengisi data dari variabel bulan lahir melalui methode setter tahun lahir
        this.bulanLahir = bulanLahir;//mengakses variabel bulan lahir
    }

    public void setTahunLahir(int tahunLahir) {//mengisi data dari variabel tahun lahir  melalui methode setter tahun lahir
        this.tahunLahir = tahunLahir;//mengakses variabel tahun lahir
    }

    public void getKelahiran() { ///mengambil data kelahiran yang sudah ditulis di methode kelahiran
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        //menuliskan cara mendapatkan tanggal kelahiran
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        //menuliskan format tanggal kelahiran
        System.out.println(ft.format(tanggalKelahiran));
        //menampilkan tanggal kelahiran yang sudah diformat
    }
}

