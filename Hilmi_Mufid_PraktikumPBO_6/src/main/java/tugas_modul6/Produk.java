/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_modul6;

/**
 *
 * @author Mufid21
 */
public abstract class Produk {
    protected String nama;
    protected double harga;

    // Constructor
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Method abstrak: setiap kelas turunan WAJIB punya cara diskon sendiri
    public abstract double hitungDiskon();

    // Method untuk menghitung harga akhir setelah dikurangi diskon
    public double hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}