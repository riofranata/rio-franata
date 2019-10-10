
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
 * Deskripsi : Program tentang warna warna
 */
public class cakep {
    
        public static final String ANSI_RESET = "\u001B[0m";
    	public static final String ANSI_BLACK = "\u001B[30m";
    	public static final String ANSI_RED = "\u001B[31m";
    	public static final String ANSI_GREEN = "\u001B[32m";
    	public static final String ANSI_YELLOW = "\u001B[33m";
    	public static final String ANSI_BLUE = "\u001B[34m";
    	public static final String ANSI_PURPLE = "\u001B[35m";
    	public static final String ANSI_CYAN = "\u001B[36m";
    	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args) {
            
		System.out.println(ANSI_RED + "Kamu " + ANSI_GREEN + "ngerjain sendiri " + ANSI_YELLOW + "latihan 17 sampe " + ANSI_BLUE + "latihan 30 ini ?");
		System.out.print(ANSI_BLUE + "Jawab" + ANSI_RED + "(Yoi/Enggak) : " + ANSI_RESET);
		Scanner scanner = new Scanner(System.in);
		String jawab = scanner.nextLine();
		jawab = jawab.toUpperCase();
		if ( jawab.equals("YOI"))
			System.out.println(ANSI_RED+"Capek Bener."+ANSI_PURPLE+" Good Job");
		else 
			System.out.println(ANSI_RED+"Tetep cakep sih.\n"+ANSI_CYAN+"Sing penting paham konsepnya yee.\n"+ANSI_RESET+"Keep the code works dude");
		
        
    }
}
