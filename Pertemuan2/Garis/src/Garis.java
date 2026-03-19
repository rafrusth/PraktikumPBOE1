/* Nama File : Garis.java
 * Deskripsi : Class Garis yang merepresentasikan konsep Garis pada koordinat kartesius
                (dengan melibatkan class Titik, karena Garis terkomposisi atas Titik)
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 27 Februari 2026
 */

public class Garis {
    /* === ATRIBUT === */
    private Titik T0;
    private Titik T1;
    private static int counterGaris = 0;

    /* === METODE === */
    // Konstruktor
    //= Parameter
    public Garis(Titik T0, Titik T1) {
        this.T0 = T0;
        this.T1 = T1;
        counterGaris++;
    }

    //= Tanpa Parameter
    public Garis() {
        T0 = new Titik(0,0);
        T1 = new Titik(1,1);
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
    public double panjangGaris() {
        double absisDist = getT0().getAbsis() - getT1().getAbsis();
        double ordinatDist = getT0().getOrdinat() - getT1().getOrdinat();
        
        return Math.sqrt(Math.pow(absisDist, 2) + Math.pow(ordinatDist, 2));
    }

    public double Gradien() {
        double deltaOrdinat = getT1().getOrdinat() - getT0().getOrdinat();
        double deltaAbsis = getT1().getAbsis() - getT0().getAbsis();

        return deltaOrdinat / deltaAbsis;
    }

    public Titik titikTengah() {
        double midAbsis = (getT0().getAbsis() + getT1().getAbsis()) / 2;
        double midOrdinat = (getT0().getOrdinat() + getT1().getOrdinat()) / 2;

        return new Titik(midAbsis, midOrdinat);
    }

    public boolean isSejajar(Garis G) {
        return Gradien() == G.Gradien();
    }

    public boolean isTegakLurus(Garis G) {
        return Gradien() * G.Gradien() == -1;
    }

    public void printGaris() {
        System.out.println("\nTitik T0: ");
        getT0().printTitik();
        System.out.println("Titik T1: ");
        getT1().printTitik();
    }

}