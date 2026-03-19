/* Nama File : MMatakuliah.java
 * Deskripsi : Driver Class Matakuliah
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 5 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] Args) {
        Mahasiswa M1 = new Mahasiswa();
        M1.setNIM("1123");
        M1.setNama("Markiplier");
        M1.setProdi("Informatika");

        Dosen D1 = new Dosen("543", "Tarno", "Informatika");

        Kendaraan K1 = new Kendaraan();
        K1.setPlat("D2382JKL");
        K1.setJenis("Motor");

        Matakuliah MK1 = new Matakuliah();
        MK1.setID("21");
        MK1.setNama("Analisis Kewarnaan");
        MK1.setSKS(5);

        M1.printMhs();
        System.out.println("");

        M1.setDoswal(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(MK1);

        M1.printDetailMhs();

    }
}
