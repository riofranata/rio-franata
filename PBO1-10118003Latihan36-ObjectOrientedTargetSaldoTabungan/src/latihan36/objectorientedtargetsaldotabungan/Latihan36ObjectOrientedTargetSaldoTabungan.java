/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan36.objectorientedtargetsaldotabungan;

/**
 *
 * @author Aero
 **NAMA    : Rio Franata
 *KELAS    : IF-1
 *NIM      : 10118003
 *Deskripsi Program : Program ini untuk menampilkan menu saldo tabungan
 */
public class Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
    
}
