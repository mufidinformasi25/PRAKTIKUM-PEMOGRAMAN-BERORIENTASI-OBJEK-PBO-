/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Kucing extends Hewan {

    // Constructor
    public Kucing(String nama) {
        super(nama, "Kucing"); // Memanggil constructor kelas induk Hewan
    }

    // Method tambahan untuk menampilkan suara khas kucing
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong! Meong!");
    }

    // Override method tampilkanInfo() dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas induk
        bersuara();
    }
}
