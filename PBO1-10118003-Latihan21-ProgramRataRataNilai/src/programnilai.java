
import java.util.Scanner;

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
 * Deskripsi : Program rata rata nilai
 */
public class programnilai {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int jumlah = scanner.nextInt();
        double ratarata;
        ratarata = 0;
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            ratarata += scanner.nextInt();
        }
        
        ratarata /= jumlah;
        System.out.println("Maka, Rata-rata Nilainya adalah " + ratarata);
        
    }
}
