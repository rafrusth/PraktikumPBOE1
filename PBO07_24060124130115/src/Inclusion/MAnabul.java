/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 25 April 2026
 */

package Inclusion;

class Anabul {
    /* === ATRIBUT === */
    private String Nama;

    /* === METODE === */
    // Getter
    public String getNama() {
        return Nama;
    }

    // Setter
    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Operator Tambahan
    public void Gerak() {

    }

    public void Bersuara() {

    }
}

class Kucing extends Anabul {
    /* === ATRIBUT === */

    /* === METODE === */
    public void Gerak() {
        System.out.println("Melata");
    }

    public void Bersuara() {
        System.out.println("Meong");
    }
}

class Anjing extends Anabul {
    /* === ATRIBUT === */

    /* === METODE === */
    public void Gerak() {
        System.out.println("Melata");
    }

    public void Bersuara() {
        System.out.println("Guk-Guk");
    }
}

class Burung extends Anabul {
    /* === ATRIBUT === */

    /* === METODE === */
    public void Gerak() {
        System.out.println("Terbang");
    }

    public void Bersuara() {
        System.out.println("Cuit");
    }
}

public class MAnabul {
    public static void main(String[] args) {
        // Kamus
        Anabul A1;

        // Algoritma
        System.out.println("\n[Anabul]");
        A1 = new Anabul();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Kucing]");
        A1 = new Kucing();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Anjing]");
        A1 = new Anjing();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");

        System.out.println("[Burung]");
        A1 = new Burung();
        A1.Gerak();
        A1.Bersuara();
        System.out.println("");
    }
}
