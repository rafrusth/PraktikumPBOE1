/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 25 April 2026
 */

package Inclusion;

abstract class Civitasakademika {
    /* === ATRIBUT === */
    private String Nama;

    /* === METODE === */
    // Konstruktor
    public Civitasakademika() {
        this.Nama = "";
    }

    public Civitasakademika(String nama) {
        this.Nama = nama;
    }

    // Getter
    public abstract String getNomor();

    public String getNama() {
        return Nama;
    }
    
    // Setter
    public void setNama(String nama) {
        this.Nama = nama;
    }
}

class Dosen extends Civitasakademika {
    /* === ATRIBUT === */
    private String NIP;

    /* === METODE === */
    // Konstruktor
    public Dosen() {
        super();
        this.NIP = "";
    }

    public Dosen(String nama, String nip) {
        super(nama);
        this.NIP = nip;
    }

    // Getter
    public String getNomor() {
        return NIP;
    }

    // Setter
    public void setNIP(String nip) {
        this.NIP = nip;
    }
}

class Mahasiswa extends Civitasakademika {
    /* === ATRIBUT === */
    private String NIM;
    private Dosen Dosenwali;

    /* === METODE === */
    // Konstruktor
    public Mahasiswa() {
        super();
        this.NIM = "";
        this.Dosenwali = null;
    }

    public Mahasiswa(String nama, String nim, Dosen dosenwali) {
        super(nama);
        this.NIM = nim;
        this.Dosenwali = dosenwali;
    }

    // Getter
    public String getNomor() {
        return NIM;
    }

    public Dosen getDosenwali() {
        return Dosenwali;
    }

    // Setter
    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setWali(Dosen dosen) {
        this.Dosenwali = dosen;
    }

    // Operator Tambahan
    public void tampilDataMahasiswa() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("NIM\t\t: " + getNomor());
        System.out.println("Dosen Wali\t: " + getDosenwali().getNama() + " (NIP: " + getDosenwali().getNomor() + ")\n");
    }
}

class Seminar {
    /* === ATRIBUT === */
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    /* === METODE=== */
    // Konstruktor
    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakPeserta = 0;
    }

    // Getter
    public int countPeserta() {
        return banyakPeserta;
    }

    // Setter
    public void registrasi(Civitasakademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        } else { // {banyakPeserta >= 100}
            System.out.println("Banyak peserta mencapai limit");
        }
    }

    // Operator Tambahan
    public int countMahasiswa() {
        int counter = 0;
        for (int i = 0; i < countPeserta(); i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                counter++;
            }
        }
        // {End i traversal}
        return counter;
    }

    public void tampilPeserta() {
        for (int i = 0; i < countPeserta(); i++) {
            System.out.println(pesertas[i].getNama() + " (" + pesertas[i].getNomor() + ")");
        }
        // {End i traversal}
    }
}

public class MCivitasakademika {
    public static void main(String[] args) {
        // Kamus
        Dosen D1, D2;
        Mahasiswa M1, M2, M3, M4, M5;
        Seminar S1;

        // Algoritma
        D1 = new Dosen("Aki Hayakawa", "22312314231");
        D2 = new Dosen();

        M1 = new Mahasiswa();
        M2 = new Mahasiswa("Reze", "240601271893940", D2);
        M3 = new Mahasiswa("Hirofumi Yoshida","24060127190302",D1);
        M4 = new Mahasiswa("Asa Mitaka","24060127180293",D2);
        M5 = new Mahasiswa("Famine Devil","24060127130892",D1);

        S1 = new Seminar();

        D2.setNama("Michiko Tendo");
        D2.setNIP("348482001");

        M1.setNama("Denji");
        M1.setNIM("24060127130921");
        M1.setWali(D1);

        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        System.out.println();
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();

        System.out.println("Jumlah Peserta Seminar\t\t: " + S1.countPeserta());
        System.out.println("Jumlah Mahasiswa pada Seminar\t: " + S1.countMahasiswa());
        S1.tampilPeserta();
    }
}
