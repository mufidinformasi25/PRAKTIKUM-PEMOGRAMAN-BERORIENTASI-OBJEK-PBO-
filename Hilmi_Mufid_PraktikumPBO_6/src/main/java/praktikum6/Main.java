/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Mufid21
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme runtime: referensi bertipe Hewan, objek asli Kucing
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow (bukan "Hewan bersuara")

        Kucing kucing = new Kucing();
        kucing.makan("ikan");     // Memanggil method makan() 1 parameter dari kelas Hewan
        kucing.makan("ikan", 2);  // Memanggil method makan() 2 parameter (overloaded) dari kelas Hewan

        Anjing anjing = new Anjing();
        anjing.bersuara();           // Output: Woof
        anjing.makan("daging", 3);   // Memanggil method makan() yang overloaded pada kelas Hewan
    }
}


//public class Main {
//    public static void main(String[] args) {
//        Hewan kucing = new Kucing();
//        kucing.bersuara();       // Output: Hewan bersuara
//        kucing.makan("ikan");    // Memanggil metode makan() dari kelas Hewan
//        kucing.makan("ikan", 2); // Memanggil metode makan() yang overloaded
//    }
//}