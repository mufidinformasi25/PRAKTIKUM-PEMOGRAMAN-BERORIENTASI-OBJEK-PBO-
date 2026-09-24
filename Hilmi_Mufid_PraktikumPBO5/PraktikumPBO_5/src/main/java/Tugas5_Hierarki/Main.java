/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Hierarki;

/**
 *
 * @author Mufid21
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== BAGIAN 1: PEWARISAN HEWAN ===\n");

        Kucing kucing1 = new Kucing("Kitty");
        kucing1.tampilkanInfo();

        System.out.println();

        Anjing anjing1 = new Anjing("Rex");
        anjing1.tampilkanInfo();

        System.out.println("\n=== BAGIAN 2: HIERARKI KENDARAAN 3 LEVEL ===\n");

        Mobil mobil1 = new Mobil("Toyota Avanza", 180, 4);
        mobil1.tampilkanInfo();

        System.out.println();

        SepedaMotor motor1 = new SepedaMotor("Yamaha NMAX", 120, "4-tak");
        motor1.tampilkanInfo();
    }
}
