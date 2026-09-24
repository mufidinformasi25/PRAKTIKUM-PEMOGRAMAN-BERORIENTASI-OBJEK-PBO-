/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    // Constructor
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // Method untuk menampilkan informasi dasar kendaraan
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan      : " + kecepatan + " km/jam");
    }
}
