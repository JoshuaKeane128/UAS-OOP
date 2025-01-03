/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BANK;

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal 200000
        Bank bank = new Bank(200000);

        // Menampilkan informasi selamat datang
        System.out.println("Selamat Datang di Bank Cekidot Slebew");
        System.out.println("Saldo sekarang: Rp. " + bank.getSaldo());

        // Melakukan beberapa aksi pada bank
        bank.simpanUang(10000);
        bank.ambilUang(50000);
        bank.ambilUang(250000); // Coba ambil uang lebih banyak dari saldo
    }
}