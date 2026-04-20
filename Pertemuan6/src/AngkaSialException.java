/* Nama File : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

public class AngkaSialException extends Exception {
    /* === METODE === */
    // Konstruktor
    public AngkaSialException() {
        super("Jangan masukkan angka 13 karena angka sial!");
    }
}
