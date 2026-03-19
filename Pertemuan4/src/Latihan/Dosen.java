/* Nama File : Dosen.java
 * Deskripsi : Abstract Class Dosen, SubClass Abstract Pegawai
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 19 Maret 2026
 */

package P4.Latihan;

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    /* === ATRIBUT === */
    protected String Fakultas;

    /* === METODE === */
    // Konstruktor
    public Dosen() {

    }

    public Dosen(String NIP, String Nama, LocalDate TL, LocalDate TMT, double gajiPokok, String Fakultas) {
        super(NIP, Nama, TL, TMT, gajiPokok);
        setFakultas(Fakultas);
    }

    // Selektor
    public String getFakultas() {
        return Fakultas;
    }

    // Mutator
    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    // Operator
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas());
    }
}
