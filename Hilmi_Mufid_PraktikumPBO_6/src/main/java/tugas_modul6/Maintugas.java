/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_modul6;

/**
 *
 * @author Mufid21
 */
public class Maintugas {
    public static void main(String[] args) {
        // Membuat beberapa objek dari kelas turunan Produk
        Buku buku1 = new Buku("Laskar Pelangi", 85000);
        Elektronik elektronik1 = new Elektronik("Headphone Bluetooth", 350000);
        Pakaian pakaian1 = new Pakaian("Kemeja Flanel", 150000);

        // Membuat keranjang belanja dan menambahkan produk ke dalamnya
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        System.out.println("=== Rincian Belanja ===");
        keranjang.tampilkanRincian();

        System.out.println("\n=== Total Akhir ===");
        System.out.printf("Total harga setelah diskon: Rp%.0f%n", keranjang.hitungTotalHarga());
    }
}
