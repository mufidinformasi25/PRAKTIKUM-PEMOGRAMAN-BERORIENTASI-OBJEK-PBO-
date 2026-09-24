/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Mufid21
 */
public class SepedaMotor extends Kendaraan {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil method dari kelas induk
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}