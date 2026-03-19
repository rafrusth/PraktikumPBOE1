package P4.Latihan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DosenTetap extends Dosen {
    /* === ATRIBUT === */
    private String NIDN;
    private final int BUP = 65;

    /* === METODE === */
    // Konstruktor
    public DosenTetap() {

    }

    public DosenTetap(String NIDN, String NIP, String Nama, LocalDate TL, LocalDate TMT, double gajiPokok, String Fakultas) {
        super(NIP, Nama, TL, TMT, gajiPokok, Fakultas);
        setJabatan("Dosen Tetap");
        setNIDN(NIDN);
    }

    // Selektor
    public String getNIDN() {
        return NIDN;
    }

    public int getBUP() {
        return BUP;
    }

    // Mutator
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    @Override
    public void setJabatan(String Jabatan) {
        if ("Dosen Tetap".equals(Jabatan)) {
            this.Jabatan = Jabatan;
        }
    }

    // Operator
    @Override
    public double Tunjangan() {
        return getGajiPokok() * 0.02 * (getTMT().until(LocalDate.now(), ChronoUnit.YEARS));
    }

    public LocalDate tanggalPensiun() {
        return getTanggalLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        Locale Indo = new Locale("id", "ID");
        
        NumberFormat Rp = NumberFormat.getCurrencyInstance(Indo);
        DateTimeFormatter FormatID = DateTimeFormatter.ofPattern("d MMMM yyyy", Indo);

        System.out.println("NIDN: " + getNIDN());
        super.printInfo();
        System.out.println("Tanggal Pensiun: " + tanggalPensiun().format(FormatID));
        System.out.println("Tunjangan: " + Rp.format(Tunjangan()));
    }
}
