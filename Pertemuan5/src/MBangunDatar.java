/* Nama File : MBangunDatar.java
 * Deskripsi : Driver Class Bangun Datar dan Subclassnya
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar B1 = new Persegi(5, "Biru", "Continuous");
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(4, "Merah", "Continuous");
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(6.7, "Hitam", "Dot-dot");

        // Persegi
        System.out.println("Sisi P1: " + P1.getJmlSisi());
        P1.setSisi(5);

        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Diagonal P2: " + P2.getDiagonal());

        // Lingkaran
        System.out.println("\nJari-jari L2: " + L2.getJari());
        L1.setJari(6.76767);
        System.out.println("Jari-jari L1 sekarang: " + L1.getJari());

        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());

        System.out.println();
        P2.printInfo();
        System.out.println();
        L2.printInfo();
        System.out.println();
        B1.printInfo();

        // Operasi
        if (P1.isEqualLuas(L2)) {
            System.out.println("Luas(P1) == Luas(L2)");
        } else {
            System.out.println("Luas(P1) != Luas(L2)");
        }

        if (B1.isEqualKeliling(P1)) {
            System.out.println("Keliling(B1) == Keliling(P1)\n");
        } else {
            System.out.println("Keliling(B1) != Keliling(P1)\n");
        }

        P1.zoomIn();
        L2.zoom(200);
        
        P1.printInfo();
        System.out.println();
        L2.printInfo();
        System.out.println();

    }
}
