
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
 * Deskripsi : Program mengganti kata
 */
public class gantikata {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("________Program Mengganti Kata________");
		System.out.print("Masukkan Kalimat : ");
		String kata = scanner.nextLine();
		System.out.print("Ganti Kata : ");
		String kataawal = scanner.next();
		System.out.print("Menjadi Kata : ");
		String katabaru = scanner.next();
		String kataganti= kata.replace(kataawal, katabaru);
		System.out.println("\n");
		System.out.println("________Hasil Formattin________");
		System.out.println("Kalimat Awal : " + kata );
		System.out.println("Kalimat Baru : " + kataganti);
    }
}
