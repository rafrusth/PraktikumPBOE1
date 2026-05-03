/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 1 Mei 2026
 */

public class OperatorGenerik {
    /* === METODE === */
    public <T> void Tukar(Datum<T> a, Datum<T> b) {
        // Kamus Lokal
        T temp;

        // Algoritma
        temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> int Bobot2(Datum<T> kucing1, Datum<T> kucing2) {
        // Kamus Lokal
        T WK1;
        T WK2;
        int hasil;

        // Algoritma
        WK1 = kucing1.getIsi();
        WK2 = kucing2.getIsi();

        hasil = WK1.getBobot() + WK2.getBobot();
        return hasil;
    }
}
