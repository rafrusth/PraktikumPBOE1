/* Nama File : Tendik.java
 * Deskripsi : Class Tendik, SubClass Abstract Pegawai
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 19 Maret 2026
 */

package P4.Latihan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Tendik extends Pegawai {
    /* === ATRIBUT === */
    private String Bidang;
    private final int BUP = 55;

    /* === METODE === */
    // Konstruktor
    public Tendik() {

    }

    public Tendik(String NIP, String Nama, LocalDate TL, LocalDate TMT, double gajiPokok, String Bidang) {
        super(NIP, Nama, TL, TMT, gajiPokok);
        setJabatan("Tendik");
        setBidang(Bidang);
    }

    // Selektor
    public String getBidang() {
        return Bidang;
    }

    public int getBUP() {
        return BUP;
    }

    // Mutator
    public void setBidang(String Bidang) {
        if ("Akademik".equals(Bidang) || "Kemahasiswaan".equals(Bidang) || "Sumber Daya".equals(Bidang)) {
            this.Bidang = Bidang;
        }
    }

    @Override
    public void setJabatan(String Jabatan) {
        if ("Tendik".equals(Jabatan)) {
            this.Jabatan = Jabatan; 
        }
    }

    // Operator
    @Override
    public double Tunjangan() {
        return getGajiPokok() * 0.01 * (getTMT().until(LocalDate.now(), ChronoUnit.YEARS));
    }

    public LocalDate tanggalPensiun() {
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        Locale Indo = new Locale("id", "ID");
        
        NumberFormat Rp = NumberFormat.getCurrencyInstance(Indo);
        DateTimeFormatter FormatID = DateTimeFormatter.ofPattern("d MMMM yyyy", Indo);

        super.printInfo();
        System.out.println("Tanggal Pensiun: " + tanggalPensiun().format(FormatID));
        System.out.println("Bidang: " + getBidang());
        System.out.println("Tunjangan: " +  Rp.format(Tunjangan()));
    }


}
