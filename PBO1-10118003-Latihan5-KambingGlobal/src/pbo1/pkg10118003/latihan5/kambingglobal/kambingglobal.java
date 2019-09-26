package pbo1.pkg10118003.latihan5.kambingglobal;

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
 * Deskripsi : Penggunaan variabel global
 */
public class kambingglobal {
    //Varibel jumlahkambing menjadi variabel instance
    int JumlahKambing =50;
    
    //method untuk menampilkan jumlah kambing
public void getJumlahKambing(){
    System.out.println("Jumlah Kambing : "+JumlahKambing);
    }

public void TambahKambing(){
    JumlahKambing = JumlahKambing + 20;
    System.out.println("Jumlah Kambing Setelah Ditambah : "+JumlahKambing);
}
public static void main(String[] args) {
    kambingglobal KambingSusu = new kambingglobal();
    
    //Menampilkan jumlah Kambing yang ada saat program pertama kali berjalan
    KambingSusu.getJumlahKambing();
    
    //Menambah satu kambing
    KambingSusu.TambahKambing();
    
    //Menampilkan jumlah kambing yang ada
    KambingSusu.getJumlahKambing();
    
    }
}
