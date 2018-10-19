/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.AntrianKlinik;
import model.klinik;

/**
 *
 * @author ASUS
 */
public class TestAntrianKlinik {

    public static void main(String[] args) {
        AntrianKlinik antrian = new AntrianKlinik("009", "THT");
        AntrianKlinik antrian2 = new AntrianKlinik("006", "Mata");
        AntrianKlinik antrian3 = new AntrianKlinik("004", "Penyakit Dalam");

        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(i));
        }
        System.out.println("    ");

        Pasien psn = new Pasien();
        psn.setNama("Puspa");
        psn.setNoRekamMedis("1000");
        psn.setAlamat("Klaten");

        Pasien psn2 = new Pasien();
        psn2.setNama("Adi");
        psn2.setNoRekamMedis("1100");
        psn2.setAlamat("Klaten");

        Pasien psn3 = new Pasien();
        psn3.setNama("Budi");
        psn3.setNoRekamMedis("1110");
        psn3.setAlamat("Klaten");
        
        
        int index = AntrianKlinik.cariAntrian(26, 8, 2018, new klinik("002", "mata"));
        
        if (index >= 0){
            
        }
//
//        int indeksAntrian = AntrianKlinik.cariAntrian("009", "THT");
//        if (indeksAntrian >= 0) {
//            AntrianKlinik.daftarAntrian.getMendaftar(psn);
//            AntrianKlinik.daftarAntrian.getMendaftar(psn2);
//            AntrianKlinik.daftarAntrian.Mendaftar(psn3);
//            AntrianKlinik.daftarAntrian.get(indeksAntrian);
//        }
//
//        System.out.println(AntrianKlinik.CariPasien("0090").getNama());
//        System.out.println("");
//
//        System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getID_Klinik() + "  "
//                + AntrianKlinik.daftarAntrian.get(indeksAntrian).getKlinik().getNamaPasien());
//        
//                for (int i = 0; i < AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().size(); i++) {
//            System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getDaftarPasien().get(i).getNama());
//        }
//        System.out.println("");
//
//    }
}
       
        


