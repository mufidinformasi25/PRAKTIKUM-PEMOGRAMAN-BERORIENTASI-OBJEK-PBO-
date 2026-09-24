/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Mobil extends KendaraanDarat {
    private int jumlahPintu;

    // Constructor
    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan, 4); // Mobil selalu beroda 4, diteruskan ke KendaraanDarat
        this.jumlahPintu = jumlahPintu;
    }

    // Override method tampilkanInfo() untuk menambahkan info spesifik mobil
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas KendaraanDarat (level 2)
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}