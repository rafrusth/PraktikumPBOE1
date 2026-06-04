/* 
 * File      : MapMahasiswa.java
 * Deskripsi : Implementasi lambda pada Map (HashMap),
 *             digunakan sebagai parameter pada method
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 4 Juni 2026
 */

import java.util.Map;
import java.util.HashMap;

public class MapMahasiswa {
    public static void main(String[] args) {
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("24060124130167", "Stella");
        mahasiswaList.put("24060124120190", "Lex");
        mahasiswaList.put("24060124140007", "Evelyn");
        mahasiswaList.put("24060124130006", "Nuso");
        mahasiswaList.put("24060124110676", "Mas Antam");

        System.out.println("| ==== NIM ===== | == Nama ==");
        mahasiswaList.forEach((nim, nama) -> {
            System.out.println("| " + nim + " | " + nama);
        });
    }
}
