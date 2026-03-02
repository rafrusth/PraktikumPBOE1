/* Nama File : MGaris.java
 * Deskripsi : 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 2 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T0 = new Titik(1,2);
        Titik T1 = new Titik(3,4);
        T0.printTitik();
        T1.printTitik();

        Garis G1 = new Garis();
        G1.printGaris();
        G1.setT0(T1);
        G1.setT1(T0);
        G1.printGaris();

        Garis G2 = new Garis(T0, T1);
        G2.printGaris();
        System.out.println("Panjang Garis G2: " + G2.panjangGaris());

        System.out.println("Gradien G2: " + G2.Gradien());

        System.out.println("Titik Tengah G2: ");
        G2.titikTengah().printTitik();




    }
}
