/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118003.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA  : Rio Franata
 * KELAS : IF 1
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk membuat perhitungan energi kinetik.
 */
public class PBO10118003Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Energi kinetik = new Energi();
        kinetik.setMassa(0.145);
        kinetik.setKecepatan(25);
        kinetik.setKecepatanAwal(0);
        kinetik.setKecepatanAkhir(25);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik\t : " + df.format(
                           kinetik.hitungEnergiKinetik
                          (kinetik.getMassa(), kinetik.getKecepatan())));
        System.out.println("Usaha\t\t : " + df.format (kinetik.hitungUsaha
                          (kinetik.getKecepatanAwal(), 
                           kinetik.getKecepatanAkhir())));
    }
    
}
