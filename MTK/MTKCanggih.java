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
    // Kelas MTKCanggih dengan metode matematika
    public class MTKCanggih {

        // Metode untuk operasi dengan tipe data int
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

        // Metode untuk operasi dengan tipe data double
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

        // Metode main untuk menjalankan program
        public static void main(String[] args) {
            MTKCanggih kalkulator = new MTKCanggih();

            // Menggunakan operasi dengan tipe data int
            System.out.println("Pertambahan int: " + kalkulator.PERTAMBAHAN(5, 3));
            System.out.println("Pengurangan int: " + kalkulator.PENGURANGAN(5, 3));
            System.out.println("Pembagian int: " + kalkulator.PEMBAGIAN(5, 3));
            System.out.println("Perkalian int: " + kalkulator.PERKALIAN(5, 3));
            System.out.println("Modulus int: " + kalkulator.MODULUS(5, 3));

            // Menggunakan operasi dengan tipe data double
            System.out.println("Pertambahan double: " + kalkulator.PERTAMBAHAN(5.5, 3.3, 2.2));
            System.out.println("Pengurangan double: " + kalkulator.PENGURANGAN(5.5, 3.3, 2.2));
            System.out.println("Pembagian double: " + kalkulator.PEMBAGIAN(5.5, 3.3, 2.2));
            System.out.println("Perkalian double: " + kalkulator.PERKALIAN(5.5, 3.3, 2.2));
            System.out.println("Modulus double: " + kalkulator.MODULUS(5.5, 3.3, 2.2));
        }
    }
