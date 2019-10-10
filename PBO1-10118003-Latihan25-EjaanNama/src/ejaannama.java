
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
 * Deskripsi : Program ejaan nama
 */
public class ejaannama {
    
    public static void main(String[] args) {
        System.out.print("Masukkan nama depan anda untuk di eja : ");
		Scanner scanner = new Scanner(System.in);
		String namaLengkap = scanner.next();
		System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
		for(int i = 0; i < namaLengkap.length(); i ++)
			System.out.println("Huruf ke-" + (i+1) + " : " + namaLengkap.charAt(i));
    }
}
