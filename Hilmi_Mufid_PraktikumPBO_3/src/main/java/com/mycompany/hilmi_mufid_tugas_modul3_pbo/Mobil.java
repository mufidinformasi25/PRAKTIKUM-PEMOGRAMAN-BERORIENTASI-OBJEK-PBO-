/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilmi_mufid_tugas_modul3_pbo;

/**
 *
 * @author Mufid21
 */

public class Mobil {
    // Deklarasi atribut dengan modifier private (Encapsulation)
    private String merk;
    private String model;
    private int tahun;
    private String warna; // Tambahan atribut baru

    // Constructor untuk menginisialisasi nilai atribut
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Method Getter dan Setter untuk setiap atribut
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    // Method untuk mengubah warna mobil
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method untuk menampilkan informasi lengkap mengenai mobil
    public void displayInfo() {
        System.out.println("Merk: " + merk + ", Model: " + model + ", Tahun: " + tahun + ", Warna: " + warna);
    }

    // Method untuk menyalakan mesin
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
}
