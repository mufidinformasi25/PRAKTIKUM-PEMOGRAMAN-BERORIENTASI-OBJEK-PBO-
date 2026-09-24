/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Anjing extends Hewan {

    // Constructor
    public Anjing(String nama) {
        super(nama, "Anjing"); // Memanggil constructor kelas induk Hewan
    }

    // Method tambahan untuk menampilkan suara khas anjing
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk! Guk!");
    }

    // Override method tampilkanInfo() dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas induk
        bersuara();
    }
}
