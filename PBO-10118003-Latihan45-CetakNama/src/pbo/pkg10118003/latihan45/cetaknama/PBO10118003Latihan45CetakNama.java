/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118003.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rio Franatta
 * KELAS : IF 
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk menampilkan output Cetak Nama.
 */
public class PBO10118003Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scn.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
