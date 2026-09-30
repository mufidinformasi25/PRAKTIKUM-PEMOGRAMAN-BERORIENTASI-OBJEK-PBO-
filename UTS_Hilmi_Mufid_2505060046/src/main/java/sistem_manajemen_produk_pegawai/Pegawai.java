/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen_produk_pegawai;

/**
 *
 * @author Mufid21
 */

// ===== Kelas Induk: Pegawai =====
public class Pegawai {
    // Enkapsulasi: atribut bersifat private
    private String namaPegawai;
    private double gaji;

    public Pegawai(String namaPegawai, double gaji) {
    // ENKAPSULASI: atribut private, hanya bisa diakses lewat getter/setter
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + (long) gaji);
    }
}
