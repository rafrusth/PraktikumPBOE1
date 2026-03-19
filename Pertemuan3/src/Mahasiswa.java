/* Nama File : Mahasiswa.java
 * Deskripsi : Class Mahasiswa
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 5 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /* === ATRIBUT === */
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<Matakuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan Kendaraan;
    
    /* === METODE === */
    // Konstruktor
    //= Tanpa Parameter
    public Mahasiswa() {
        NIM = "";
        Nama = "";
        Prodi = "";
        listMatKul = new ArrayList<>();
    }

    //= Parameter
    public Mahasiswa(String NIM, String Nama, String Prodi, ArrayList<Matakuliah> Matkul) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatKul = Matkul;

    }

    // Selektor
    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public Dosen getDoswal() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    public ArrayList<Matakuliah> getMatakuliah() {
        return listMatKul;
    }

    // Mutator
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void setDoswal(Dosen Doswal) {
        dosenWali = Doswal;
    }

    public void setKendaraan(Kendaraan Kendaraan) {
        this.Kendaraan = Kendaraan;
    }

    public void setMatkul(ArrayList<Matakuliah> listMatkul) {
        this.listMatKul = listMatkul;
    }

    // Operator
    public void addMatKul(Matakuliah newMatkul) {
        listMatKul.add(newMatkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (Matakuliah Matkul : listMatKul) {
            totalSKS += Matkul.getSKS();
        }
        
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatKul.size();
    }

    public void printMhs() {
        System.out.println("NIM: " + getNIM());
        System.out.println("Nama: " + getNama());
        System.out.println("Prodi: " + getProdi());
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + getNIM());
        System.out.println("Nama: " + getNama());
        System.out.println("Prodi: " + getProdi());
        System.out.println("Dosen Wali: " + getDoswal().getNama());
        System.out.println("List Matakuliah: ");
        for (Matakuliah Matkul : listMatKul) {
            System.out.println("Nama: " + Matkul.getNama());
            System.out.println("SKS: " + Matkul.getSKS());
        }
        System.out.println("Kendaraan: " + getKendaraan().getJenis() + " (" +getKendaraan().getPlat() + ")");
    }
}
