/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 8 April 2026
 */

public class Kucing extends Anabul {
    /* === ATRIBUT === */
    private int bobot;

    /* === METODE === */
    // Getter
    public int getBobot() {
        return bobot;
    }

    // Setter
    public void setBobot(int val) {
        this.bobot = val;
    }

    // Operator Lainnya
    public void Gerak() {
        System.out.println("Melata");
    }

    public void Bersuara() {
        System.out.println("Meong");
    }
}