/* Nama File : Asersi2.java
 * Deskripsi : Program untuk Demo Asersi, yang akan menolak
                input jari-jari lingkaran yang bernilai nol
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

class Lingkaran {
    /* === ATRIBUT === */
    private double jariJari;

    /* === METODE === */
    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Operator
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}