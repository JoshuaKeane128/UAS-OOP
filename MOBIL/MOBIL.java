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
public class MOBIL {
    String MERKMOBIL;
    int CCMESIN;

    // Konstruktor dengan parameter
    public MOBIL(String MERKMOBIL, int CCMESIN) {
        this.MERKMOBIL = MERKMOBIL;
        this.CCMESIN = CCMESIN;
    }

    // Konstruktor tanpa parameter
    public MOBIL() {
        this.MERKMOBIL = "Unknown";  // Default value
        this.CCMESIN = 0;            // Default value
    }

    // Getter dan Setter untuk MERKMOBIL
    public String getMERKMOBIL() {
        return MERKMOBIL;
    }

    public void setMERKMOBIL(String MERKMOBIL) {
        this.MERKMOBIL = MERKMOBIL;
    }

    // Getter dan Setter untuk CCMESIN
    public int getCCMESIN() {
        return CCMESIN;
    }

    public void setCCMESIN(int CCMESIN) {
        this.CCMESIN = CCMESIN;
    }

    // Menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Merk Mobil: " + MERKMOBIL);
        System.out.println("CC Mesin: " + CCMESIN);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek MOBIL dengan merk Toyota dan 2000CC
        MOBIL mobilSaya = new MOBIL("Toyota", 2000);

        // Menampilkan informasi mobil
        mobilSaya.displayInfo();
    }
}
