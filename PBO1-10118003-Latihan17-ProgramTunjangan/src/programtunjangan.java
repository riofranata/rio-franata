
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
 * Deskripsi : Membuat program tunjangan
 */
public class programtunjangan {
    
    public static void main(String[] args) {
        System.out.println("____________PROGRAM TUNJANGAN____________");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        double gajipokok = scanner.nextInt();
        double tunjangan = 0;
        System.out.print("Status anda ? (Menikah/Belum)\t\t: ");
        String status = scanner.next();
        if (status.equals("Menikah")){
            tunjangan = 0.35 * gajipokok;
            System.out.println(status);
        }
        
        double totalgaji = gajipokok + tunjangan;
        System.out.println("_______HASIL PERHITUNGAN GAJI ANDA_______");
        System.out.println("Gaji Pokok \t\t: Rp. "+gajipokok);
        System.out.println("Tunjangan \t\t: Rp. "+tunjangan);
        System.out.println("Total Gaji \t\t: Rp. "+totalgaji);
           
    }
}
