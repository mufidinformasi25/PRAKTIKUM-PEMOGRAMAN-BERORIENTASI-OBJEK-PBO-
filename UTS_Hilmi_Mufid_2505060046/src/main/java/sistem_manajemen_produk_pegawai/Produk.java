/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen_produk_pegawai;

/**
 *
 * @author Mufid21
 */

// ===Kelas Produk===
public class Produk {
    // ENKAPSULASI: atribut dibuat private, jadi tidak bisa diakses
    // langsung dari luar kelas (misalnya dari Main).
    private String namaProduk; 
    private double harga;

    public Produk(String namaProduk, double harga) { // Constructor
        this.namaProduk = namaProduk; // atribut kelas (this.namaProduk) dengan parameter (namaProduk).
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaProduk() { //pintu untuk membaca
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) { // pintu untuk mengubah
        this.namaProduk = namaProduk;
    }

    public double getHarga() { // GETTER: untuk MENGAMBIL nilai
        return harga;
    }

    public void setHarga(double harga) { // SETTER: untuk MENGUBAH nilai
        this.harga = harga;
    }

        // Method ini akan di-OVERRIDE (ditulis ulang) oleh kelas turunan.
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + (long) harga);
    }
}