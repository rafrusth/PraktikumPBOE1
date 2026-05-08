/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 8 Mei 2026
 */

public class MKoleksi {
    public static void main(String[] args) {
        // Kamus 
        Teman T1;
        Anggora ANG1;
        Kembangtelon KB1;
        Anjing A1;
        Burung B1;
        Anabul Anoo;

        // Algoritma
        B1 = new Burung();
        KB1 = new Kembangtelon();
        ANG1 = new Anggora();
        A1 = new Anjing();
        T1 = new Teman();

        System.out.println("Nbelm: " + T1.getNbelm());

        T1.addNama("Kicau");
        System.out.println();
        System.out.println(T1.getNama(0));
        System.out.println("Nbelm: " + T1.getNbelm());

        T1.setNama(0,"Mania");
        System.out.println();
        System.out.println(T1.getNama(0));
        System.out.println("Nbelm: " + T1.getNbelm());

        T1.addNama("Stella");
        System.out.println();
        System.out.println(T1.getNama(1));
        System.out.println("Nbelm: " + T1.getNbelm());

        T1.delNama("Mania");
        System.out.println();
        System.out.println(T1.getNama(0));
        System.out.println("Nbelm: " + T1.getNbelm());

        T1.delNama("Prabowo");

        System.out.println();
        if (T1.isMember("Stella")) {
            System.out.println("Stella Ada");
        } else {
            System.out.println("Stella Tidak Ada");
        }

        if (T1.isMember("MBG")) {
            System.out.println("MBG Ada");
        } else {
            System.out.println("MBG Tidak Ada");
        }

        T1.gantiNama("Stella", "Lexy");
        System.out.println();
        System.out.println(T1.getNama(0));
        System.out.println("Nbelm: " + T1.getNbelm());

        T1.addNama("Stella");
        T1.addNama("Evelyn");
        T1.addNama("Downey");
        T1.addNama("Nuso");
        T1.addNama("Lexy");

        System.out.println();
        System.out.println("Banyak Lexy: " + T1.countNama("Lexy"));
        System.out.println("Banyak Stella: " + T1.countNama("Stella"));

        System.out.println();
        T1.showTeman();

        ANG1.setNama("Angela");
        ANG1.setBobot(67);
        KB1.setNama("Rawr");
        KB1.setBobot(66);
        A1.setNama("Robert");
        B1.setNama("Angry Bird");

        T1.enqueueAnabul(ANG1);
        T1.enqueueAnabul(KB1);
        T1.enqueueAnabul(A1);
        T1.enqueueAnabul(B1);

        System.out.println();
        Anoo = T1.dequeueAnabul();
        System.out.println("Dequeue: " + Anoo.getNama());

        Anoo = T1.getAnabul();
        System.out.println("Get Anabul: " + Anoo.getNama());

        System.out.println();
        System.out.println("Nbelm: "+ T1.getPiaraan().getNbelm());

        if (T1.isMember(A1)) {
            System.out.printf("%s Ada\n\n", A1.getNama());
        } else {
            System.out.printf("%s Tidak Ada\n\n", A1.getNama());
        }

        T1.showAnabul();
        System.out.println();
        System.out.println("Banyak Keluarga Kucing: " + T1.countKucing());
        System.out.println("Bobot Keluarga Kucing: " + T1.bobotKucing());

        System.out.println();
        T1.showJenisAnabul();
    }
}
