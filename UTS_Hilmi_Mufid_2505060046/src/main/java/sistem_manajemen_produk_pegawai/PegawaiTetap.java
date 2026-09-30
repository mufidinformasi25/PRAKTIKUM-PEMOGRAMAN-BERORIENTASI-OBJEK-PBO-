/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen_produk_pegawai;

/**
 *
 * @author Mufid21
 */

// ===== Kelas Turunan 1 dari Pegawai =====
public class PegawaiTetap extends Pegawai {
    private double tunjangan;

    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override // menulis ulang method milik kelas induk di kelas turunan, dengan nama dan parameter yang sama, tetapi isinya berbeda.
    public void tampilkanInfo() {
        super.tampilkanInfo();  // Cetak Nama Pegawai dan Gaji (dari induk)
        System.out.println("Tunjangan: " + (long) tunjangan);
    }
}
