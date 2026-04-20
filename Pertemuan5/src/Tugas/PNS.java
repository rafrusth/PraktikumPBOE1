/* Nama File : PNS.java
 * Deskripsi : Class PNS, SubClass Abstract Manusia
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

package Tugas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    /* === ATRIBUT === */
    private String nip;
    private static int counterPNS = 0;
    
    /* === METODE === */
    // Konstruktor
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }
    
    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Operator
    @Override
    public double hitungPajak() {
        return 0.1 * this.getPendapatan();
    }

    public int hitungMasaKerja() {
        LocalDate tanggalSekarang = LocalDate.now();
        LocalDate tanggalMulaiKerja = getTanggalMulaiKerja();

        int intervalHari = (int) (ChronoUnit.DAYS.between(tanggalMulaiKerja, tanggalSekarang)) + 5;

        return intervalHari;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP\t\t\t: " + getNip());
        System.out.printf("Pajak\t\t\t: Rp %,.2f\n",hitungPajak());
    } 
}
