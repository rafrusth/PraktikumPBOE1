/* Nama File : MTitik.java
 * Deskripsi : Main class Titik
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(4); // Mengubah absis T1 dengan nilai 4
        T1.setOrdinat(3); // Mengubah ordinat T1 dengan nilai 3
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(20,19); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser
    }
}