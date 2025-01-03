/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEPEDA;

/**
 *
 * @author LENOVO
 */

public class SEPEDABeraksi {
    public static void main(String[] args) {
       SEPEDA sepedaJoshua = new SEPEDA(0); // Berikan nilai awal gir = 0
        
       sepedaJoshua.setGir(2);
       System.out.println("GIR SEPEDA SEKARANG: " + sepedaJoshua.getGir());
        
       sepedaJoshua.setGir(3);
       System.out.println("GIR SEPEDA SEKARANG: " + sepedaJoshua.getGir());
    }
}

