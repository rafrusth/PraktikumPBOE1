/* Nama File : Asersi1.java
 * Deskripsi : Program untuk Menunjukkan Asersi
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x Bilangan Positif");
        } else {
            assert(x < 0): "Ada Kesalahan Kode";
            System.out.println("x Bilangan Negatif");
        }
    }
}
