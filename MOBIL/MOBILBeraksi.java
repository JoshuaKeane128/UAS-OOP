/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOBIL;

/**
 *
 * @author LENOVO
 */
class Mobil {
    String merkMobil;
    int ccMesin;

    // Constructor
    public Mobil(String merkMobil, int ccMesin) {
        this.merkMobil = merkMobil;
        this.ccMesin = ccMesin;
    }
}

public class MobilBeraksi {

    public static void main(String[] args){
        // Membuat objek mobilSaya
        Mobil mobilSaya = new Mobil("VENTURER", 2500);
        
        // Menampilkan atribut mobil
        System.out.println("Merk Mobil: " + mobilSaya.merkMobil);
        System.out.println("CC Mesin: " + mobilSaya.ccMesin);
    }
}
