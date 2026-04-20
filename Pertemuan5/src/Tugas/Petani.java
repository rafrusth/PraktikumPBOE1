/* Nama File : Petani.java
 * Deskripsi : Class Petani, SubClass Abstract Manusia
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    /* === ATRIBUT === */
    private String asal_kota;
    private static int counterPetani = 0;
    
    /* === METODE === */
    // Konstruktor
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String asal_kota) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor
    public String getAsalKota() {
        return asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }
    
    // Mutator
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Operator
    @Override
    public double hitungPajak() {
        return 0;
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
        System.out.println("Kota Asal\t\t: " + getAsalKota());
        System.out.printf("Pajak\t\t\t: Rp %.2f\n",hitungPajak());

    }

}
