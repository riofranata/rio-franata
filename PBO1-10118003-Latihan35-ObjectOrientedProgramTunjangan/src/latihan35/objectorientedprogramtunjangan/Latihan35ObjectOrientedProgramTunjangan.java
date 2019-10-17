/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author Aero
 *NAMA     : Rio Franata
 *KELAS    : IF-1
 *NIM      : 10118003
 *Deskripsi Program : Program ini untuk menampilkan tampilan dari sistem
 */
public class Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);
    }
    
}
