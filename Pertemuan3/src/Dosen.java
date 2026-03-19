/* Nama File : Dosen.java
 * Deskripsi : Class Dosen
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 5 Maret 2026
 */

public class Dosen {
    /* === ATRIBUT === */
    private String NIP;
    private String Nama;
    private String Prodi;


    /* === METODE === */
    // Konstruktor
    //= Tanpa Parameter
    public Dosen() {
        NIP = "";
        Nama = "";
        Prodi = "";
    }

    //= Parameter
    public Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // Selektor
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    // Mutator
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    // Operator
}
