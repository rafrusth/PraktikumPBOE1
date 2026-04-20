/* Nama File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
                Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

public class AngkaSial {
    /* === METODE === */
    // Operator
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    // Main Driver
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}
