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
public class MATEMATIKA {

    // Method Penjumlahan
    public int PERTAMBAHAN(int a, int b) {
        return a + b;
    }

    // Method Pengurangan
    public int PENGURANGAN(int a, int b) {
        return a - b;
    }

    // Method Perkalian
    public int PERKALIAN(int a, int b) {
        return a * b;
    }

    // Method Pembagian
    public int PEMBAGIAN(int a, int b) {
        if (b != 0) {
            return a / b;  // Pembagian aman jika pembagi bukan 0
        } else {
            System.out.println("Error: Pembagi tidak boleh nol");
            return 0; // Mengembalikan nilai default saat pembagian dengan nol
        }
    }

    // Method Modulus (Sisa Bagi)
    public int MODULUS(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Pembagi tidak boleh nol");
            return 0;
        }
    }

    // Method Perpangkatan
    public int PERPANGKATAN(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Method Akar Kuadrat
    public double AKAR(int a) {
        return Math.sqrt(a);
    }

    // Main Method
    public static void main(String[] args) {
        MATEMATIKA math = new MATEMATIKA();
        
        // Tes operasi Penjumlahan
        System.out.println("Penjumlahan: 5 + 3 = " + math.PERTAMBAHAN(5, 3));
        
        // Tes operasi Pengurangan
        System.out.println("Pengurangan: 5 - 3 = " + math.PENGURANGAN(5, 3));
        
        // Tes operasi Perkalian
        System.out.println("Perkalian: 5 * 3 = " + math.PERKALIAN(5, 3));
        
        // Tes operasi Pembagian
        System.out.println("Pembagian: 5 / 2 = " + math.PEMBAGIAN(5, 2));
        
        // Tes operasi Modulus
        System.out.println("Modulus: 5 % 3 = " + math.MODULUS(5, 3));
        
        // Tes operasi Perpangkatan
        System.out.println("Perpangkatan: 5^3 = " + math.PERPANGKATAN(5, 3));
        
        // Tes operasi Akar Kuadrat
        System.out.println("Akar Kuadrat: sqrt(25) = " + math.AKAR(25));
    }
}
