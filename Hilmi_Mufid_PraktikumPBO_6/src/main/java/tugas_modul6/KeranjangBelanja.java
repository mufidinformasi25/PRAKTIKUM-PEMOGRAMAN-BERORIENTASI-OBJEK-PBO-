/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_modul6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mufid21
 */
public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    // Constructor
    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }

    // Method untuk menambahkan produk ke keranjang
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    // Method untuk menampilkan rincian setiap produk di keranjang
    public void tampilkanRincian() {
        for (Produk p : daftarProduk) {
            System.out.printf("%-20s Harga: Rp%-10.0f Diskon: Rp%-10.0f Setelah Diskon: Rp%.0f%n",
                    p.getNama(), p.getHarga(), p.hitungDiskon(), p.hargaSetelahDiskon());
        }
    }

    // Method untuk menghitung TOTAL harga seluruh produk setelah diskon
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : daftarProduk) {
            // Polimorfisme: p.hitungDiskon() otomatis memanggil versi
            // sesuai jenis objek aslinya (Buku, Elektronik, atau Pakaian)
            total += p.hargaSetelahDiskon();
        }
        return total;
    }
}
