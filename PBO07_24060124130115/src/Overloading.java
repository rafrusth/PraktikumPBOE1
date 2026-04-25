/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 23 April 2026
 */

class Mahasiswa {
    /* === ATRIBUT === */
    private String NIM;
    private String Nama;
    private String Programstudi;

    /* === METODE === */
    // Konstruktor
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.Nama = nama;
        this.Programstudi = prodi;
    }

    public Mahasiswa(Mahasiswa mahasiswa) {
        this.NIM = mahasiswa.NIM;
        this.Nama = mahasiswa.Nama;
        this.Programstudi = mahasiswa.Programstudi;
    }

    // Selektor
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProgramStudi() {
        return Programstudi;
    }

    // Mutator
    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String programstudi) {
        this.Programstudi = programstudi;
    }

    public void setProgramStudi(Mahasiswa mahasiswa) {
        this.Programstudi = mahasiswa.Programstudi;
    }

    // Operator Lain
    public void cetakInfo() {
        System.out.println("NIM\t\t: " + getNIM());
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("Program Studi\t: " + getProgramStudi());
        System.out.println();
    }
}

public class Overloading {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("24060127130034", "Stella", "Informatics");
        Mahasiswa M3 = new Mahasiswa(M2);

        System.out.println();
        M1.cetakInfo();
        M2.cetakInfo();
        M3.cetakInfo();

        M3.setProgramStudi("Computer Science");
        M3.cetakInfo();

        M2.setProgramStudi();
        M2.cetakInfo();

        M1.setProgramStudi(M3);
        M1.setNama("Joe");
        M1.setNIM("24060127130223");
        M1.cetakInfo();

        String nimM1 = M1.getNIM();
        String namaM2 = M2.getNama();
        String prodiM3 = M3.getProgramStudi();
        System.out.printf("%s\n%s\n%s\n\n", nimM1, namaM2, prodiM3);
    }
}
