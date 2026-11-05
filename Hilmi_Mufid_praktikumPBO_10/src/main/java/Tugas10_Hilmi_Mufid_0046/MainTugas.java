/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10_Hilmi_Mufid_0046;

/**
 *
 * @author Mufid21
 */
public class MainTugas {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        double hargaElektronik = 1000000;
        double hargaMakanan = 50000;

        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
    }
}
