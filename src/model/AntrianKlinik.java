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
public class AntrianKlinik {
    private String ID_Klinik;
    private String NamaKlinik;

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * @param bulanAntrian the bulanAntrian to set
     */
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    /**
     * @return the tahunAntrian
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * @param tahunAntrian the tahunAntrian to set
     */
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    /**
     * @return the klinik
     */
    public klinik getKlinik() {
        return Klinik;
    }

    /**
     * @param klinik the klinik to set
     */
    public void setKlinik(klinik Klinik) {
        this.Klinik = Klinik;

    }
    public static ArrayList<AntrianKlinik> daftarAntrian
            = new ArrayList<AntrianKlinik>();

    public static void buatAntrian(
            int tanggal,
            int bulan,
            int tahun,
            klinik x) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(x);
        // cari antrian dalam list daftarAntri
        if (cariAntrian(tanggal, bulan, tahun, x) == null) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
    }

    public static AntrianKlinik cariAntrian(int tanggal,int bulan,int tahun,klinik klinik) {
        return null;
    }
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private klinik Klinik;

    private ArrayList<pasien> daftarPasienAntri = new ArrayList<pasien>();

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, klinik x ) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.Klinik = x;
    }

    /**
     *
     * @param tanggalAntrian
     * @param bulanAntrian
     * @param tahunAntrian
     * @param Klinik
     * @return
     */

      public static pasien CariPasien(String noRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getDaftarPasien().get(i) != null) {
                for (int j = 0; j < daftarAntrian.get(i).getDaftarPasien().size(); j++) {
                    if (daftarAntrian.get(i).getDaftarPasien().get(j).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                        return daftarAntrian.get(i).getDaftarPasien().get(j);
                    }
                }
            }
        }
        return null;
    }
    public ArrayList<pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }

    /**
     * @param daftarPasien the daftarPasienAntri to set
     */
    public void setDaftarPasien(ArrayList<pasien> daftarPasien) {
        this.daftarPasienAntri = daftarPasien;
    }

    /**
     * @return the tanggalAntrian
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public void TanggalAntrian() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy  'at' hh:mm:ss");
        System.out.println(ft.format(date));
    }

    /**
     * @return the bulanAntrian
     */
    public String toString() {
        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + Klinik.getID_Klinik()
                + Klinik.getNamaPasien();
    }
 public AntrianKlinik(String string, String tht) {
    }

//    public void Mendaftar(Pasien psn) {
//    }

 public static int cariAntrian(String string, String tht) {
        return 0;
 }
}
