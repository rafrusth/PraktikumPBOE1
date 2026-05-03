/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 3 Mei 2026
 */

public class Data<G> {
    /* === ATRIBUT === */
    private Datum<G>[] ruang;
    private int banyak;

    /* === METODE === */
    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (Datum<G>[]) new Datum[100];
        this.banyak = 0;
    }

    public G getIsi(int indeks) {
        if (indeks < 1 || indeks > 100) {
            throw new IllegalArgumentException("Indeks di luar range array [1..100]");
        }
        return ruang[indeks - 1].getIsi();
    }

    public void setIsi(int indeks, G objek) {
        if (indeks < 1 || indeks > 100) {
            throw new IllegalArgumentException("Indeks di luar range array [1..100]");
        }
        if (ruang[indeks - 1] == null) {
            ruang[indeks - 1] = new Datum<G>();
        }
        ruang[indeks - 1].setIsi(objek);
        banyak++;
    }

    public int getSize() {
        return banyak; 
    }
}
