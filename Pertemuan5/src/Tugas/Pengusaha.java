/* Nama File : Pengusaha.java
 * Deskripsi : Class Pengusaha, SubClass Abstract Manusia
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    /* === ATRIBUT === */
    private String npwp;
    private static int counterPengusaha = 0;

    /* === METODE === */
    // Konstruktor
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String npwp) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor
    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    // Mutator
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Operator
    @Override
    public double hitungPajak() {
        return 0.15 * this.getPendapatan();
    }

    public int hitungMasaKerja() {
        LocalDate tanggalSekarang = LocalDate.now();
        LocalDate tanggalMulaiKerja = getTanggalMulaiKerja();

        int intervalHari = (int) (ChronoUnit.DAYS.between(tanggalMulaiKerja, tanggalSekarang)) + 1;

        return intervalHari;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP\t\t\t: " + getNpwp());
        System.out.printf("Pajak\t\t\t: Rp %,.2f\n",hitungPajak());
    }
}
