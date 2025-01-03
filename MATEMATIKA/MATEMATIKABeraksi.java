/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MATEMATIKA;

/**
 *
 * @author LENOVO
 */
public class MATEMATIKABeraksi {
    public static void main(String[] args) {
        // Membuat objek matematikaArfan dari kelas MATEMATIKA
        MATEMATIKA matematikaArfan = new MATEMATIKA();
        
        // Menampilkan hasil Penjumlahan
        System.out.println("PERTAMBAHAN: 5 + 10 = " + matematikaArfan.PERTAMBAHAN(5, 10));
        
        // Menampilkan hasil Pengurangan
        System.out.println("PENGURANGAN: 30 - 30 = " + matematikaArfan.PENGURANGAN(30, 30));
        
        // Menampilkan hasil Perkalian
        System.out.println("PERKALIAN: 4 * 8 = " + matematikaArfan.PERKALIAN(4, 8));
        
        // Menampilkan hasil Pembagian
        System.out.println("PEMBAGIAN: 25 / 5 = " + matematikaArfan.PEMBAGIAN(25, 5));
    }
}
