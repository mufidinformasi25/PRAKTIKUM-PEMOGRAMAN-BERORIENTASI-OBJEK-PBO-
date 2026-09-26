/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_modul6;

/**
 *
 * @author Mufid21
 */
public class Pakaian extends Produk {

    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    // Override: Pakaian mendapat diskon 20% dari harga
    @Override
    public double hitungDiskon() {
        return harga * 0.20;
    }
}

