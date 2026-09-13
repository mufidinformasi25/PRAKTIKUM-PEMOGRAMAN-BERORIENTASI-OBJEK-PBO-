/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hilmi_mufid_praktikumpbo_4;

/**
 *
 * @author Mufid21
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;              // Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;      // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;         // Bisa diakses dari mana saja

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}




// code sebelum menerapkan akses modifier
//    private String merek;
//    private String model;
//    private int tahun;
//
//    // Constructor
//    public Kendaraan(String merek, String model, int tahun) {
//        this.merek = merek;
//        this.model = model;
//        this.tahun = tahun;
//    }
//
//    // Getter dan Setter untuk merek
//    public String getMerek() {
//        return merek;
//    }
//    public void setMerek(String merek) {
//        this.merek = merek;
//    }
//
//    // Getter dan Setter untuk model
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    // Getter dan Setter untuk tahun
//    public int getTahun() {
//        return tahun;
//    }
//    public void setTahun(int tahun) {
//        this.tahun = tahun;
//    }
//}
