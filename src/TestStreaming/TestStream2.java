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

    public class TestStream2 {
    public static void main(String[] args) {
        pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < pasien.getDaftarPasien().size(); i++) {
            System.out.println(pasien.getDaftarPasien().get(i).toString());
           
        }
    }
}

