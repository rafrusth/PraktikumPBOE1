/* Nama File : Manusia.java
 * Deskripsi : Abstraksi, Class Manusia
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

package Tugas;

import java.time.LocalDate;

public abstract class Manusia {
    /* === ATRIBUT === */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /* === METODE === */
    // Konstruktor
    protected Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0.0;
        counterMns++;
    }

    protected Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalMulaiKerja(LocalDate tanggal) {
        this.tgl_mulai_kerja = tanggal;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Operator
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("\nNama\t\t\t: " + getNama());
        System.out.println("Tanggal Mulai Kerja\t: " + getTanggalMulaiKerja());
        System.out.println("Alamat\t\t\t: " + getAlamat());
        System.out.printf("Pendapatan\t\t: Rp %,.2f\n" ,getPendapatan());
        System.out.println("Masa Kerja\t\t: " + hitungMasaKerja() + " Hari");
    }
}