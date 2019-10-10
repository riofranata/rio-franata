
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
 * Deskripsi : Program menampilkan waktu saat ini
 */
public class waktu {
    
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
		String waktu = date.format(dateFormatted);
		System.out.println("Waktu saat ini adalah : " + waktu);
    }
}
