/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author ASUS
 */
class Pasien {

    public Pasien(String noRekamMedis, String nama, String alamat, String tempatLahir, String nik) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.nik = nik;
    }
    private String noRekamMedis, nama, alamat, tempatLahir, nik;

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    Pasien(){
        
    }
}
