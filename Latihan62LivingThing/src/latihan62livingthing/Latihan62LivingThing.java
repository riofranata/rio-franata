/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan62livingthing;

/**
 *
 * @author Aero
 * NAMA  : Rio Franata
 * KELAS : IF-1
 * NIM   : 10118003
 * Deskripsi Program : Program ini untuk membuat tampilan override abstract.
 */
public class Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   Human human = new Human();
        human.setNama("Rio Franata");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}