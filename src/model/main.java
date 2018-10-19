/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class main {
     public static void main(String[] args) {
       
        pasien pasien1 = new pasien(); //membuat obyek baru yang diberi nama pasien1
        pasien pasien2 = new pasien(); //membuat obyek baru yang diberi nama pasien2
        dokter dokterku= new dokter(); //membuat obyek baru yang diberi nama dokterku
        AntrianPasien AP = new AntrianPasien(); //membuat obyek baru yang diberi nama AP
        klinik klinikk = new klinik("1234", "Sejahtera"); //membuat obyek baru yang diberi nama klinikk
        
        try { //untuk mendeteksi error
            pasien1.setNama("Yakobus Petrus"); // mengisi data nama 
            pasien1.setTempatLahir("Klaten");  //mengisi data tempat lahir
            pasien1.setAlamat("Pandanrejo, Klaten"); //mengisi data alamat
            pasien1.setTanggalLahir(15); //mengisi data tgl lahir
            pasien1.setBulanLahir(9); //mengisi data bulan lahir
            pasien1.setTahunLahir(1990); //mengisi data tahun lahir
            
            pasien2.setNama("Matius Wahyu");// mengisi data nama 
            pasien2.setTempatLahir("Klaten");//mengisi data tempat lahir
            pasien2.setAlamat("Perumahan Anggrek, Ketandan, Klaten");//mengisi data alamat
            pasien2.setTanggalLahir(19);//mengisi data tgl lahir
            pasien2.setBulanLahir(5);//mengisi data bulan lahir
            pasien2.setTahunLahir(2000); //mengisi data tahun lahir
            
            dokterku.setNama("Bambang Wibawa");// mengisi data nama 
            dokterku.setAlamat("Paingan, Maguwoharjo, Depok, Sleman, Yogyakarta");//mengisi data alamat
            dokterku.setNomorPegawai("19960505");//mengisi data nomor pegawai
            dokterku.setTempatLahir("Kalimantan Timur");//mengisi data tempat lahir
            dokterku.setTanggalLahir(12);//mengisi data tgl lahir
            dokterku.setBulanLahir(2);//mengisi data bulan lahir
            dokterku.setTahunLahir(1989);//mengisi data tahun lahir
            
            AP.Mendaftar(pasien1); //berisikan data pasien1
            AP.Mendaftar(pasien2); //berisikan data pasien2
            AP.setKlinik(klinikk); //berisikan data klinik
            
        } catch (Exception ex) { //untuk mendeteksi error
            System.out.println(ex);
        }
        System.out.println(AP.getKlinik().getNamaPasien());
        System.out.println("ID Klinik : " + AP.getKlinik().getID_Klinik());
        System.out.println("");
        
        for (int i = 0; i < AP.getDaftarPasien().size(); i++) { //melakukan perulangan untuk menampilkan data
            AP.TanggalAntrian();
            System.out.println("Pasien " + "ke-" +(i+1) +" " + AP.getDaftarPasien().get(i).getNama());
            System.out.println("");
            System.out.print("                 ");
            System.out.println("-DATA PASIEN-"); //mencetak DATA PASIEN
            System.out.println("=================================================");
            System.out.println("Nama Pasien \t : " + AP.getDaftarPasien().get(i).getNama()); //mencetak nama pasien
            System.out.println("Tempat Lahir \t : " + AP.getDaftarPasien().get(i).getTempatLahir()); //mencetak tempat lahir pasien
            System.out.print("Tanggal Lahir \t : "); //mencetak tgl lahir pasien
            AP.getDaftarPasien().get(i).getTanggalKelahiran(); //mencetak tanggal kelahiran
            System.out.println("");
            System.out.println("Alamat Pasien \t : " + AP.getDaftarPasien().get(i).getAlamat()); //mencetak alamat pasien
            System.out.print("No Rekam Medis \t : " + AP.getDaftarPasien().get(i).NoRekamMedis());  //mencetak nomor rekam medis   
            System.out.println("");
            System.out.print("                 ");
            System.out.println("-DATA DOKTER-"); //menampilkan data dokter
            System.out.println("=================================================");
            System.out.println("Nama Dokter \t : " + dokterku.getNama()); //mencetak nama dokter
            System.out.println("Nomor Pegawai \t : " + dokterku.getNomorPegawai()); //mencetak nomor pegawai dokter
            System.out.println("Tempat Lahir \t : " + dokterku.getTempatLahir()); //mencetak tempat lahir dokter
            System.out.print("Tanggal Lahir \t : "); //mencetak tgl lahir
            dokterku.getKelahiran();
            System.out.println("");
            System.out.println("Alamat Dokter \t : " + dokterku.getAlamat()); //mencetak alamat dokter
            System.out.println("");
            
        }
    }
}
