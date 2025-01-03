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
public class MAHASISWABeraksi {
    public static void main(String[] args) {
        // Membuat objek mahasiswaUnmer dari kelas MAHASISWA
        MAHASISWA mahasiswaUnmer = new MAHASISWA();

        // Memanggil method membaca untuk menunjukkan kegiatan membaca buku
        mahasiswaUnmer.membaca();
        
        // Memanggil method menyontek untuk menunjukkan kegiatan menyontek
        mahasiswaUnmer.menyontek();
        
        // Memanggil method modifikasi untuk menunjukkan kegiatan memodifikasi IoT
        mahasiswaUnmer.modifikasi();
    }
}
