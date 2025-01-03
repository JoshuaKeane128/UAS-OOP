/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HP;

/**
 *
 * @author LENOVO
 */
public class HPBeraksi {

    public static void main(String[] args) {
        // Membuat objek dari kelas HP
        HP handphoneKu = new HP();

        // Menjalankan metode dari objek handphoneKu
        handphoneKu.hidupkanHP();
        handphoneKu.lakukanPanggilan();
        handphoneKu.kirimSMS();
        handphoneKu.matikanHP();
    }
}

