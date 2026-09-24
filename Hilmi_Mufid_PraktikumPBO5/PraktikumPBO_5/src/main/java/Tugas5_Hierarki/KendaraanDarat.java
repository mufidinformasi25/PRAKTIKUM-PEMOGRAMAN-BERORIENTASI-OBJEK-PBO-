/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    // Constructor
    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan); // Memanggil constructor kelas induk Kendaraan
        this.jumlahRoda = jumlahRoda;
    }

    // Override method tampilkanInfo() untuk menambahkan info jumlah roda
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas Kendaraan (level 1)
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}