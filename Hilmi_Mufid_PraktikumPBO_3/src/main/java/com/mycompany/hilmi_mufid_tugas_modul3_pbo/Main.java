/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilmi_mufid_tugas_modul3_pbo;

/**
 *
 * @author Mufid21
 */
public class Main {
    public static void main(String[] args) {
        // Menciptakan dua object dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");

        System.out.println("=== Informasi Awal Mobil ===");
        // Menampilkan informasi kedua object
        mobil1.displayInfo();
        mobil2.displayInfo();

        System.out.println("\n=== Status Mesin ===");
        // Memanggil method startEngine pada setiap object
        mobil1.startEngine();
        mobil2.startEngine();

        System.out.println("\n=== Perubahan Warna Mobil ===");
        // Mengubah warna mobil1 menggunakan setter
        mobil1.setWarna("Merah");
        
        // Menampilkan perubahan warna pada displayInfo()
        System.out.println("Setelah warna diubah:");
        mobil1.displayInfo();
    }
}
