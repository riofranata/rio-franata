package pbo1.pkg10118003.latihan4.kambing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Rio franata
 * Kelas     : PBO1
 * NIM       : 10118003
 * Deskripsi : Penggunaan variabel lokal
 */
public class kambing {
    public void TambahKambing () { 
        //Deklarasi Variabel Lokal
        int JumlahKambing = 0;
        
        JumlahKambing = JumlahKambing + 10;
        System.out.println("Jumlah kambing setelah ditambah : "+JumlahKambing);
}
    public static void main(String[] args) {
        kambing KambingJantan = new kambing();
        KambingJantan.TambahKambing();
        
    }
}
