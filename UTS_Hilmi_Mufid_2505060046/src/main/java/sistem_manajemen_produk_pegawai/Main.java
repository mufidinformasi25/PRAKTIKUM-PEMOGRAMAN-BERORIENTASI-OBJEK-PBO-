/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen_produk_pegawai;

/**
 *
 * @author Mufid21
 */
public class Main {
    public static void main(String[] args) { 
        // Polimorfisme: referensi kelas induk memegang objek kelas turunan
        Produk produk1 = new Elektronik("Laptop", 15000000, 2); // polymorphism (dynamic)
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");

        Pegawai pegawai1 = new PegawaiTetap("Hilmi Mufid", 5000000, 1000000);  // sunnah Compile-time (static)/ovrload
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        System.out.println("1. Output Produk");
        produk1.tampilkanInfo(); // memanggil tampilkanInfo() milik Elektronik

        System.out.println();
        System.out.println("2. Output Pegawai");
        pegawai1.tampilkanInfo(); // memanggil tampilkanInfo() milik PegawaiTetap

        System.out.println();
        System.out.println("3. Output Polimorfisme");
        produk2.tampilkanInfo(); // memanggil tampilkanInfo() milik Makanan
        pegawai2.tampilkanInfo(); // memanggil tampilkanInfo() milik PegawaiKontrak => termasuk dynamic
    }
}