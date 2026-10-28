/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilmi_Mufid_praktikum9;

/**
 *
 * @author Mufid21
 */
// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}

// 8. Mencoba membuat objek langsung dari kelas Kendaraan
//public class Main {
//    public static void main(String[] args) {
//        // Percobaan instansiasi langsung dari kelas abstrak (Akan menghasilkan ERROR)
//        Kendaraan k = new Kendaraan(); 
//    }
//}