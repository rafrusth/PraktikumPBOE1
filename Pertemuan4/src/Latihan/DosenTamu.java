package P4.Latihan;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DosenTamu extends Dosen {
    /* === ATRIBUT === */
    private String NIDK;
    private LocalDate tanggalAkhirKontrak;

    /* === METODE === */
    // Konstruktor
    public DosenTamu() {

    }

    public DosenTamu(String NIDK, String NIP, String Nama, LocalDate TL, LocalDate TMT, double gajiPokok, String Fakultas, LocalDate tanggalAkhirKontrak) {
        super(NIP, Nama, TL, TMT, gajiPokok, Fakultas);
        setJabatan("Dosen Tamu");
        setNIDK(NIDK);
        setTanggalAkhirKontrak(tanggalAkhirKontrak);
    }

    // Selektor
    public String getNIDK() {
        return NIDK;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    // Mutator
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public void setTanggalAkhirKontrak(LocalDate Tanggal) {
        tanggalAkhirKontrak = Tanggal;
    }

    @Override
    public void setJabatan(String Jabatan) {
        if ("Dosen Tamu".equals(Jabatan)) {
            this.Jabatan = Jabatan;
        }
    }

    // Operator
    public long sisaKontrak() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), getTanggalAkhirKontrak());    }

    @Override
    public double Tunjangan() {
        return getGajiPokok() * 0.025;
    }

    @Override
    public void printInfo() {
        Locale Indo = new Locale("id", "ID");
        
        NumberFormat Rp = NumberFormat.getCurrencyInstance(Indo);
        DateTimeFormatter FormatID = DateTimeFormatter.ofPattern("d MMMM yyyy", Indo);

        System.out.println("NIDK: " + getNIDK());
        super.printInfo();
        System.out.println("Tanggal Akhir Kontrak: " + getTanggalAkhirKontrak().format(FormatID));
        System.out.println("Sisa Masa Kontrak: " + sisaKontrak() + " Bulan");
        System.out.println("Tunjangan " + Rp.format(Tunjangan()));
    }

}
