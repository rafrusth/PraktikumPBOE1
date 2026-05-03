/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 30 April 2026
 */

public class MGenerik {
    public static void main(String[] args) {
        // Kamus
        Datum<Kucing> KeluargaIntiKucing;
        Datum<Kucing> KeluargaSampinganKucing;
        Datum<Anabul> KeluargaSampingan;
        Datum<Anabul> KeluargaInti;
        Datum<Integer> Six;
        Datum<Integer> Seven;
        Datum<String> Infor;
        Datum<String> Matics;
        Data<Anabul> ShelterAnabul;
        OperatorGenerik OG;
        Kucing K1;
        Anjing A1;
        Burung B1;
        Anggora AK1;
        Kembangtelon KK1;
        int i;
        int nbElm;

        // Algoritma
        K1 = new Kucing();
        AK1 = new Anggora();
        KK1 = new Kembangtelon();
        A1 = new Anjing();
        B1 = new Burung();
        OG = new OperatorGenerik();
        KeluargaIntiKucing = new Datum<Kucing>();
        KeluargaSampinganKucing = new Datum<Kucing>();
        KeluargaSampingan = new Datum<Anabul>();
        KeluargaInti = new Datum<Anabul>();
        Six = new Datum<Integer>();
        Seven = new Datum<Integer>();
        Infor = new Datum<String>();
        Matics = new Datum<String>();
        ShelterAnabul = new Data<Anabul>();

        Six.setIsi(6);
        Seven.setIsi(7);
        Infor.setIsi("Infor");
        Matics.setIsi("Matics");
        
        System.out.println();
        KeluargaIntiKucing.setIsi(K1);
        System.out.println(KeluargaIntiKucing.getIsi().getClass().getName());
        KeluargaIntiKucing.getIsi().Gerak();
        System.out.println();

        KeluargaIntiKucing.setIsi(AK1);
        System.out.println(KeluargaIntiKucing.getIsi().getClass().getName());
        KeluargaIntiKucing.getIsi().Gerak();
        KeluargaIntiKucing.getIsi().setBobot(12);
        System.out.println(KeluargaIntiKucing.getIsi().getBobot() + " kg");
        System.out.println();
        
        KeluargaSampinganKucing.setIsi(KK1);
        System.out.println(KeluargaSampinganKucing.getIsi().getClass().getName());
        KeluargaSampinganKucing.getIsi().Gerak();
        KeluargaSampinganKucing.getIsi().setBobot(67);
        System.out.println(KeluargaSampinganKucing.getIsi().getBobot() + " kg");
        System.out.println();
    
        KeluargaSampingan.setIsi(A1);
        System.out.println(KeluargaSampingan.getIsi().getClass().getName());
        KeluargaSampingan.getIsi().Gerak();
        System.out.println();

        KeluargaInti.setIsi(B1);
        System.out.println(KeluargaInti.getIsi().getClass().getName());
        KeluargaInti.getIsi().Gerak();

        ShelterAnabul.setIsi(1, B1);
        ShelterAnabul.setIsi(2, K1);
        ShelterAnabul.setIsi(3, AK1);
        ShelterAnabul.setIsi(4, KK1);
        ShelterAnabul.setIsi(5, A1);

        nbElm = ShelterAnabul.getSize();

        System.out.println("\n/* ============ DATA SHELTERANABUL ============ */");
        for (i = 1; i <= nbElm; i++) {
            System.out.println(ShelterAnabul.getIsi(i).getClass().getName());
        }

        System.out.println("\n/* ============ TUKAR ============ */\n[BEFORE]");
        System.out.println("KeluargaInti\t  = " + KeluargaInti.getIsi().getClass().getName());
        System.out.println("KeluargaSampingan = " + KeluargaSampingan.getIsi().getClass().getName());
        System.out.println("Six   = " + Six.getIsi());
        System.out.println("Seven = " + Seven.getIsi());
        System.out.println("KeluargaIntiKucing\t= " + KeluargaIntiKucing.getIsi().getClass().getName());
        System.out.println("KeluargaSampinganKucing = " + KeluargaSampinganKucing.getIsi().getClass().getName());
        System.out.println("Infor  = " + Infor.getIsi());
        System.out.println("Matics = " + Matics.getIsi());

        OG.Tukar(KeluargaSampingan, KeluargaInti);
        OG.Tukar(Six, Seven);
        OG.Tukar(KeluargaIntiKucing, KeluargaSampinganKucing);
        OG.Tukar(Infor, Matics);

        System.out.println("\n[AFTER]");
        System.out.println("KeluargaInti\t  = " + KeluargaInti.getIsi().getClass().getName());
        System.out.println("KeluargaSampingan = " + KeluargaSampingan.getIsi().getClass().getName());
        System.out.println("Six   = " + Six.getIsi());
        System.out.println("Seven = " + Seven.getIsi());
        System.out.println("KeluargaIntiKucing\t= " + KeluargaIntiKucing.getIsi().getClass().getName());
        System.out.println("KeluargaSampinganKucing = " + KeluargaSampinganKucing.getIsi().getClass().getName());
        System.out.println("Infor  = " + Infor.getIsi());
        System.out.println("Matics = " + Matics.getIsi());

        System.out.println("\n/* ============ BOBOT2 ============ */");
        System.out.println("Bobot KeluargaIntiKucing = " + KeluargaIntiKucing.getIsi().getBobot() + " kg");
        System.out.println("Bobot KeluargaSampinganKucing = " + KeluargaSampinganKucing.getIsi().getBobot() + " kg");
        System.out.println("\nBobot Kedua Kucing = " + OG.Bobot2(KeluargaIntiKucing, KeluargaSampinganKucing) + " kg");

    }
}
