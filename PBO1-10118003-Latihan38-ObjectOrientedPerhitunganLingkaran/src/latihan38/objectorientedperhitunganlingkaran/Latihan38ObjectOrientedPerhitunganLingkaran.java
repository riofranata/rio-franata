/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author Aero
 *NAMA     : Rio Franata
 *KELAS    : IF-1
 *NIM      : 10118003
 * Deskripsi Program : Program ini untuk menampilkan tampilan program 
 *                     perhitungan lingkaran.
 */
public class Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
