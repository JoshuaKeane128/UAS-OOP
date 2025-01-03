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
public class MTKBeraksi {
    public static void main(String[] args) {
        MTK mtk = new MTK();
        MTKCanggih mtkCanggih = new MTKCanggih();
        
        System.out.println("PERTAMBAHAN: " + mtk.PERTAMBAHAN(23, 24));
        System.out.println("PENGURANGAN: " + mtk.PENGURANGAN(23, 24));
        System.out.println("PEMBAGIAN: " + mtk.PEMBAGIAN(23, 24));
        System.out.println("PERKALIAN: " + mtk.PERKALIAN(23, 24));
        System.out.println("MODULUS: " + mtk.MODULUS(23, 24));
        
        System.out.println("Pertambahan: " + mtk.PERTAMBAHAN(12.5, 28.7, 14.2));
        System.out.println("Pengurangan: " + mtk.PENGURANGAN(12.5, 28.7, 14.2));
        System.out.println("Pembagian: " + mtk.PEMBAGIAN(12.5, 28.7, 14.2));
        System.out.println("Perkalian: " + mtk.PERKALIAN(12.5, 28.7, 14.2));
        System.out.println("Modulus: " + mtk.MODULUS(12.5, 28.7, 14.2));
        

    }
}

