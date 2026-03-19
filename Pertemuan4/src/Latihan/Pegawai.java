package P4.Latihan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.Period;

public abstract class Pegawai {
    /* === ATRIBUT === */
    protected String NIP;
    protected String Nama;
    protected String Jabatan;
    protected LocalDate tanggalLahir;
    protected LocalDate TMT;
    protected double gajiPokok;

    /* === METODE === */
    // Konstruktor
    public Pegawai() {

    }

    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double gajiPokok) {
        setNIP(NIP);
        setNama(Nama);
        setTanggalLahir(TL);
        setTMT(TMT);
        setGajiPokok(gajiPokok);
    }
    // Selektor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String getJabatan() {
        return Jabatan;
    }

    // Mutator
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setTanggalLahir(LocalDate TL) {
        tanggalLahir = TL;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void setGajiPokok(double Rp) {
        gajiPokok = Rp;
    }

    public abstract void setJabatan(String Jabatan);

    // Operator
    public abstract double Tunjangan();

    public String masaKerja() {
        Period P = Period.between(TMT, LocalDate.now());
        return P.getYears() + " Tahun " + P.getMonths() + " Bulan";
    }

    public void printInfo() {
        Locale Indo = new Locale("id", "ID");

        NumberFormat Rp = NumberFormat.getCurrencyInstance(Indo);
        String RpFormatGajiPokok = Rp.format(getGajiPokok());

        DateTimeFormatter FormatID = DateTimeFormatter.ofPattern("d MMMM yyyy", Indo);

        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + getTanggalLahir().format(FormatID));
        System.out.println("TMT: " + getTMT().format(FormatID));
        System.out.println("Masa Kerja: " + masaKerja());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Gaji Pokok: " + RpFormatGajiPokok);
    }

}
