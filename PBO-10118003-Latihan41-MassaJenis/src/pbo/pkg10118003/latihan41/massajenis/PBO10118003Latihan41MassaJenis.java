/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118003.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rio Franatta
 * KELAS : IF 1
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk menampilkan output untuk menghitung 
 *                     massa jenis kubus.
 */
public class PBO10118003Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        Kubus kbs = new Kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(scn.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(scn.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " 
                + kbs.hitungMassaJenis(kbs.getMassa(), 
                        kbs.hitungVolume(kbs.getSisi())));
    }
    
}
