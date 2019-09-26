package pbo1.pkg10118003.latihan11.formating;

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
 * Deskripsi : Penggunaan format atau printf
 */
public class formating {
    
        public static void main(String[] args) {
        
            int i = 3546764;
            int iMinus =-i;
            System.out.println("i : " +i);
            System.out.printf("%%d : %d%n", i);
            System.out.printf("%%10d : %10d%n", i);
            System.out.printf("%%+10d : %+10d%n", i);
            System.out.printf("%%+10d : %+10d%n", iMinus);
            System.out.printf("%%,10d : %,10d%n", i);
            System.out.printf("%%-10d : %-10d%n", i);
            double f = 5675482.982;
            System.out.println("f : " + f);
            System.out.printf("%%f : %f%n", f);
            System.out.printf("%%.2f : %.2f%n", f);
            System.out.printf("%%12.2f : %12.2f%n", f);
            System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
}
