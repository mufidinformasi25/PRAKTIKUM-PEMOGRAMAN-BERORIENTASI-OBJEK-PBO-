/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class SepedaMotor extends KendaraanDarat {
    private String jenisMesin;

    // Constructor
    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan, 2); // Sepeda motor selalu beroda 2, diteruskan ke KendaraanDarat
        this.jenisMesin = jenisMesin;
    }

    // Override method tampilkanInfo() untuk menambahkan info spesifik sepeda motor
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas KendaraanDarat (level 2)
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}
