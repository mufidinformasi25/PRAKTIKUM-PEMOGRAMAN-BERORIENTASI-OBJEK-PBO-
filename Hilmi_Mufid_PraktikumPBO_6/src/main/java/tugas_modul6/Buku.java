/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_modul6;

/**
 *
 * @author Mufid21
 */
public class Buku extends Produk {

    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    // Override: Buku mendapat diskon 10% dari harga
    @Override
    public double hitungDiskon() {
        return harga * 0.10;
    }
}