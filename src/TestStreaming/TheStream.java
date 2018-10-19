/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStreaming;
import java.io.File;
import model.pasien;
/**
 *
 * @author ASUS
 */
public class TheStream {
      public static void main(String[] args) {
        pasien test = new pasien();
        test.setNoRekamMedis("001");
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        pasien test1 = new pasien();
        test1.setNoRekamMedis("002");
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
        
        pasien.tambahPasienBaru(test);
        pasien.tambahPasienBaru(test1);
        
        pasien.simpanDaftarPasien(new File("daftar.txt"));
    }
}

