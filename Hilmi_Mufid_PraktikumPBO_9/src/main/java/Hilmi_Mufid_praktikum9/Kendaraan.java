/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilmi_Mufid_praktikum9;

/**
 *
 * @author Mufid21
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    // Metode abstrak (tanpa bodi)
    abstract void berjalan();

    // Metode biasa dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}