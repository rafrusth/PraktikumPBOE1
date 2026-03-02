/* Nama File : Garis.java
 * Deskripsi : 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 2 Maret 2026
 */

public class Garis {
    /* === ATRIBUT === */
    private Titik T0;
    private Titik T1;
    private static int counterGaris = 0;

    /* === METODE === */
    // Konstruktor
    //// Parameter
    public Garis(Titik T0, Titik T1) {
        this.T0 = T0;
        this.T1 = T1;
        counterGaris++;
    }

    //// Tanpa Parameter
    public Garis() {
        this.T0 = new Titik(0,0);
        this.T1 = new Titik(1,1);
        counterGaris++;
    }

    // Selektor
    public Titik getT0() {
        return T0;
    } 

    public Titik getT1() {
        return T1;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    public void setT0(Titik T) {
        T0 = T;
    }

    public void setT1(Titik T) {
        T1 = T;
    }

    // Operator
    public double panjangGaris(Garis G) {
        double absisDist = (G.getT0()).getAbsis() - (G.getT1()).getAbsis();
        double ordinatDist = (G.getT0()).getOrdinat() - (G.getT1()).getOrdinat();
        
        return Math.sqrt(Math.pow(absisDist, 2) + Math.pow(ordinatDist, 2));
    }

}