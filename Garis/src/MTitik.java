/* Nama File : MTitik.java
 * Deskripsi : Main driver class Titik
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        T1.setAbsis(4); // Mengubah absis T1 dengan nilai 4
        T1.setOrdinat(3); // Mengubah ordinat T1 dengan nilai 3
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(20,19); // Menggeser T1 sejauh (3,4)
        T1.printTitik(); // Menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3,5);
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik());

        T1.printCounterTitik();
        System.out.println("Titik T1 berada di kuadran: " + T1.getKuadran());
        System.out.println("Jarak T1 ke Titik Pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 dan T2: " + T1.getJarak(T2));

        T1.refleksiX();
        System.out.println("Hasil refleksi terhadap sumbu X pada T1: ");
        T1.printTitik();

        T1.refleksiY();
        System.out.println("Hasil refleksi terhadap sumbu Y pada T2: ");
        T1.printTitik();

        (T2.getRefleksiX()).printTitik();
        (T2.getRefleksiY()).printTitik();
    }
}