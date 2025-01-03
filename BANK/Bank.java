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
public class Bank {
    private int saldo;

    // Konstruktor untuk mengatur saldo awal
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo sekarang: Rp. " + saldo);
    }

    // Method untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo sekarang: Rp. " + saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
        }
    }

    // Method untuk mendapatkan saldo
    public int getSaldo() {
        return saldo;
    }
}
