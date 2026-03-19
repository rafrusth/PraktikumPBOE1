/* Nama File : MPegawai.java
 * Deskripsi : Driver Class Pegawai
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 18 Maret 2026
 */

package P4.Latihan;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        Tendik P1 = new Tendik("1123", "Markiplier", LocalDate.of(2000, 2, 13), LocalDate.of(2023, 6, 2), 120000000, "Akademik");
        DosenTetap DTP1 = new DosenTetap("2322111", "232144", "Stella", LocalDate.of(2001,6,7), LocalDate.of(2019,4,3), 400000000, "Ilmu Komputer");
        DosenTamu DTM1 = new DosenTamu("1412414", "1343999", "Lex", LocalDate.of(2000,8,6), LocalDate.of(2020, 9, 24), 90000000, "Makanan Bergizi Gratis", LocalDate.of(2028, 9, 24));

        P1.printInfo();
        System.out.println();

        P1.setNIP("9022");
        P1.setNama("Sawit");
        P1.setTanggalLahir(LocalDate.of(1967, 6, 7));
        P1.setTMT(LocalDate.of(2021, 2, 7));
        P1.setGajiPokok(300000000);

        P1.printInfo();
        System.out.println();

        DTP1.printInfo();
        System.out.println();

        DTM1.printInfo();
        System.out.println();
    }
}
