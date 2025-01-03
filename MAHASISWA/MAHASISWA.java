/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAHASISWA;

/**
 *
 * @author LENOVO
 */
public class MAHASISWA {

    // Method membaca untuk menunjukkan kegiatan mahasiswa membaca buku
    public void membaca() {
        System.out.println("MAHASISWA UNMER BACA BUKU DI PERPUSTAKAAN");
    }

    // Method menyontek untuk menunjukkan kegiatan mahasiswa yang menyontek
    public void menyontek() {
        System.out.println("MAHASISWA NYONTEK SAAT UJIAN CODING");
    }

    // Method modifikasi untuk menunjukkan kegiatan mahasiswa memodifikasi IoT
    public void modifikasi() {
        System.out.println("MAHASISWA MEMODIFIKASI IOT");
    }

    // Main method untuk menguji kelas MAHASISWA
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        MAHASISWA mahasiswa = new MAHASISWA();
        
        // Memanggil method-method untuk mendemonstrasikan kegiatan mahasiswa
        mahasiswa.membaca();    // Menampilkan kegiatan membaca
        mahasiswa.menyontek();   // Menampilkan kegiatan menyontek
        mahasiswa.modifikasi();  // Menampilkan kegiatan modifikasi IoT
    }
}
