/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEPEDA;

/**
 *
 * @author LENOVO
 */
public class SEPEDA {
    private int gir;

    // Konstruktor untuk menginisialisasi gir
    public SEPEDA(int girAwal) {
        this.gir = girAwal;
    }

    // Metode untuk menambah gir
    public void setGir(int pertambahanGir) {
        // Mengecek agar pertambahan gir tidak membuat nilai gir negatif
        if (gir + pertambahanGir >= 0) {
            gir = gir + pertambahanGir;
        } else {
            System.out.println("Gir tidak bisa menjadi negatif");
        }
    }

    // Metode untuk mendapatkan jumlah gir
    public int getGir() {
        return gir;
    }

    // Metode untuk mereset nilai gir ke 0
    public void resetGir() {
        gir = 0;
    }

    // Metode untuk mencetak status gir sepeda
    public void printStatus() {
        System.out.println("Jumlah gir sepeda saat ini: " + gir);
    }

    public static void main(String[] args) {
        SEPEDA sepeda1 = new SEPEDA(3); // Sepeda dengan gir awal 3
        sepeda1.printStatus();
        
        sepeda1.setGir(2); // Menambah 2 gir
        sepeda1.printStatus();

        sepeda1.setGir(-1); // Mengurangi 1 gir
        sepeda1.printStatus();

        sepeda1.resetGir(); // Mereset gir ke 0
        sepeda1.printStatus();
    }
}
