/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 8 Mei 2026
 */

import java.util.*;

public class Piaraan {
    /* === ATRIBUT === */
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /* === METODE === */
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    public int getNbelm() {
        return nbelm;
    }

    public Queue<Anabul> getLanabul() {
        return Lanabul;
    }

    public void inkremenNbelm() {
        nbelm++;
    }

    public void dekremenNbelm() {
        nbelm--;
    }
}
