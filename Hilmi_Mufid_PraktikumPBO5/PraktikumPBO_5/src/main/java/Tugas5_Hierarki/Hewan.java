/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Hewan {
    // Atribut kelas induk
    protected String nama;
    protected String jenis;

    // Constructor
    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    // Method untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }
}
