/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilmi_mufid_praktikumpbo_4;

/**
 *
 * @author Mufid21
 */
public class Manusia {
     // Atribut dengan akses modifier berbeda sesuai ketentuan soal
    private String nama;       // Hanya bisa diakses dalam kelas ini
    protected int usia;        // Bisa diakses di package yang sama dan subclass
    public String pekerjaan;   // Bisa diakses dari mana saja

    // Constructor untuk menginisialisasi nama, usia, dan pekerjaan
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter untuk atribut private nama
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut private nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}
