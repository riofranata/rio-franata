
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
 * Deskripsi : Program menampilkan huruf besar dan huruf kecil
 */
public class huruf {
    
    public static void main(String[] args) {
        System.out.print("Masukkan Kalimat : ");
		Scanner scanner = new Scanner(System.in);
		String kalimat = scanner.nextLine();
		System.out.println("________Hasil Formatting________");
		System.out.println("Huruf Besar : " + kalimat.toUpperCase() );
		System.out.println("Huruf Kecil : " + kalimat.toLowerCase() );
    }
}
