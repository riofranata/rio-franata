/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33.objectorienteduserlogin;

/**
 *
 * @author Aero
 * NAMA    : Rio Franata
 *KELAS    : IF-1
 *NIM      : 10118003
 *Deskripsi Program : Program ini untuk membuat data aku
 */
public class User {
    
    private static String username;
    private static String password;
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        username = "rio";
        password = "franata";
        statusAkun = parPassword.equals(password) && parUserName.equals(username);
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUserName){
        if (status==true) {
            System.out.println("\n****** HALLO "+parUserName.toUpperCase()+" ****** ");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }

    public void pengecekkanLogin(String parUserName, String parPassword){
        cekAkun(parUserName,parPassword);
        hasilLogin(statusAkun,parUserName);
   
    } 
}
