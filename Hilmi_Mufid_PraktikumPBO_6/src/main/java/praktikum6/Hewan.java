/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Mufid21
 */
public class Hewan {public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Overloading method makan() - versi 1 parameter
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    // Overloading method makan() - versi 2 parameter
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}