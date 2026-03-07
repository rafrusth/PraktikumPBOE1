/* Nama File : Garis.java
 * Deskripsi : Class Garis yang merepresentasikan konsep Garis pada koordinat kartesius
                (dengan melibatkan class Titik, karena Garis terkomposisi atas Titik)
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 2 Maret 2026
 */

// import Titik;

public class Titik {
    /* ***** ATRIBUT ***** */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* ***** METHOD ***** */
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println(absis + "," + ordinat);
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printCounterTitik() {
        System.out.println(counterTitik);
    }

    public int getKuadran() {
        if (getAbsis() > 0 && getOrdinat() > 0) {
            return 1;
        } else if (getAbsis() < 0 && getOrdinat() > 0) {
            return 2;
        } else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } else if (getAbsis() > 0 && getOrdinat() < 0) {
            return 4;
        } else { // Titik origin (0,0)
            return 0;
        }
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(getAbsis(),2) + Math.pow(getOrdinat(),2));
    }

    public double getJarak(Titik T) {
        double absisDist = getAbsis() - T.getAbsis();
        double ordinatDist = getOrdinat() - T.getOrdinat();
        
        return Math.sqrt(Math.pow(absisDist, 2) + Math.pow(ordinatDist,2));
    }

    public void refleksiX() {
        ordinat = ordinat * -1;
    }

    public void refleksiY() {
        absis = absis * -1;
    }

    public Titik getRefleksiX() {
        double absisBaru = absis;
        double ordinatBaru = ordinat * -1; 
        
        return new Titik(absisBaru, ordinatBaru);
    }

    public Titik getRefleksiY() {
        double absisBaru = absis * -1;
        double ordinatBaru = ordinat;
        
        return new Titik(absisBaru, ordinatBaru);
    }

} // End class Titik