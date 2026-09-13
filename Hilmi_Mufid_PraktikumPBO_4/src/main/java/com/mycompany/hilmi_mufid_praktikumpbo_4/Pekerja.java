/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilmi_mufid_praktikumpbo_4;

/**
 *
 * @author Mufid21
 */
public class Pekerja extends Manusia {
    // Atribut tambahan gaji dengan akses private
    private double gaji;

    // Constructor untuk menginisialisasi nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari kelas induk Manusia
        this.gaji = gaji;
    }

    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override method toString() untuk menampilkan semua informasi pekerja
    @Override
    public String toString() {
        return "Nama       : " + getNama() + "\n"
             + "Usia       : " + usia + " tahun\n"
             + "Pekerjaan  : " + pekerjaan + "\n"
             + "Gaji       : Rp" + String.format("%,.2f", gaji);
    }
}
