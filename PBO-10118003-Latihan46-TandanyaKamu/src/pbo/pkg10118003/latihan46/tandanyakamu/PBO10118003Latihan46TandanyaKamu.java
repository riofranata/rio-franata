/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118003.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rio Franata
 * KELAS : IF 1
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk menampilkan output Tandanya Kamu.
 */
public class PBO10118003Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Age age = new Age(2019);

        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}
