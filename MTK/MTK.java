/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MTK;

/**
 *
 * @author LENOVO
 */
public class MTK {
    
    // Operasi untuk tipe data int
    public int PERTAMBAHAN(int a, int b) {
        return a + b;
    }

    public int PENGURANGAN(int a, int b) {
        return a - b;
    }

    public int PEMBAGIAN(int a, int b) {
        return a / b;
    }

    public int PERKALIAN(int a, int b) {
        return a * b;
    }

    public int MODULUS(int a, int b) {
        return a % b;
    }

    // Operasi untuk tipe data double
    public double PERTAMBAHAN(double a, double b, double c) {
        return a + b + c;
    }

    public double PENGURANGAN(double a, double b, double c) {
        return a - b - c;
    }

    public double PEMBAGIAN(double a, double b, double c) {
        return a / b / c;
    }

    public double PERKALIAN(double a, double b, double c) {
        return a * b * c;
    }

    public double MODULUS(double a, double b, double c) {
        return a % b % c;
    }

    // Metode main untuk menjalankan aplikasi
    public static void main(String[] args) {
        MTK mtk = new MTK();
        
        // Menggunakan metode dengan tipe data int
        System.out.println("Pertambahan (int): " + mtk.PERTAMBAHAN(5, 3));
        System.out.println("Pengurangan (int): " + mtk.PENGURANGAN(5, 3));
        System.out.println("Pembagian (int): " + mtk.PEMBAGIAN(6, 3));
        System.out.println("Perkalian (int): " + mtk.PERKALIAN(5, 3));
        System.out.println("Modulus (int): " + mtk.MODULUS(5, 3));
        
        // Menggunakan metode dengan tipe data double
        System.out.println("Pertambahan (double): " + mtk.PERTAMBAHAN(5.5, 3.2, 2.3));
        System.out.println("Pengurangan (double): " + mtk.PENGURANGAN(5.5, 3.2, 2.3));
        System.out.println("Pembagian (double): " + mtk.PEMBAGIAN(6.0, 3.0, 2.0));
        System.out.println("Perkalian (double): " + mtk.PERKALIAN(5.0, 3.0, 2.0));
        System.out.println("Modulus (double): " + mtk.MODULUS(5.5, 3.2, 2.3));
    }
}
