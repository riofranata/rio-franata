/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan61bangunruang;

/**
 *
 * @author Aero
 * NAMA  : Rio franata
 * KELAS : IF-1
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk menghitung volume bangun ruang.
 */
public class Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = "+Math.ceil(tabung.hitungVolume()));
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    
    }
    
}
