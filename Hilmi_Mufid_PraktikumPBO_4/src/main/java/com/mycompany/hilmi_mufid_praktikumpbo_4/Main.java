/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilmi_mufid_praktikumpbo_4;

/**
 *
 * @author Mufid21
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja1 = new Pekerja("Budi Santoso", 28, "Software Engineer", 8500000);

        System.out.println("=== Informasi Awal Pekerja ===");
        System.out.println(pekerja1.toString());

        // Mengubah nama pekerja menggunakan setter
        pekerja1.setNama("Budi Santoso, S.Kom.");

        System.out.println("\n=== Informasi Setelah Nama Diubah ===");
        System.out.println(pekerja1.toString());

        // Mencoba akses langsung atribut nama, usia, dan gaji dari objek pekerja
        System.out.println("\n=== Percobaan Akses Langsung Atribut ===");

        //System.out.println(pekerja1.nama);  // ERROR: nama bersifat private, tidak bisa diakses langsung
        System.out.println("Usia (protected, diakses langsung, 1 package): " + pekerja1.usia);
        //System.out.println(pekerja1.gaji);  // ERROR: gaji bersifat private, tidak bisa diakses langsung
        System.out.println("Pekerjaan (public, diakses langsung): " + pekerja1.pekerjaan);
    }
}