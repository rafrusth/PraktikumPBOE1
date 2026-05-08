/* 
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 8 Mei 2026
 */

import java.util.*;

public class Teman {
    /* === ATRIBUT === */
    private int nbelm;
    private List<String> Lnama;
    private Piaraan piara;

    /* === METODE === */
    public Teman() {
        // Kamus Lokal

        // Algoritma
        this.nbelm = 0;
        this.Lnama = new ArrayList<String>();
        this.piara = new Piaraan();
    }

    public int getNbelm() {
        // Kamus Lokal

        // Algoritma
        return nbelm;
    }

    public String getNama(int indeks) {
        // Kamus Lokal

        // Algoritma
        if (indeks < 0 || indeks >= nbelm) {
            throw new IllegalArgumentException("Mengakses di luar range indeks");
        }
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama) {
        // Kamus Lokal

        // Algoritma
        if (indeks < 0 || indeks >= nbelm) {
            throw new IllegalArgumentException("Mengakses di luar range indeks");
        }
        Lnama.set(indeks, nama);
    }

    public void addNama(String nama) {
        // Kamus Lokal

        // Algoritma
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        // Kamus Lokal

        // Algoritma
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        // Kamus Lokal

        // Algoritma
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        // Kamus Lokal

        // Algoritma
        if (Lnama.contains(nama)) {
            Lnama.set(Lnama.indexOf(nama), namabaru);
        }
    }

    public int countNama(String nama) {
        // Kamus Lokal
        int temp, i;

        // Algoritma
        temp = 0;
        for (i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                temp++;
            }
        }
        // {End i traversal}
        return temp;
    }

    public void showTeman() {
        // Kamus Lokal

        // Algoritma
        for (String nama: Lnama) {
            System.out.println(nama);
        }
        // {End for each}
    }

    /* b. Tambahkan operator dalam kelas Teman disertai aplikasinya, antara lain :
        i.   getNbelm(),
        ii.  enqueueAnabul(anabul)   {menambah elemen akhir},
        iii. isMember(anabul) 
        iv.  getAnabul()             {mengambil data anabul pertama dalam antrean}, 
        v.   dequeueAnabul()         {mengambil anabul pertama sekaligus mengeluarkannya dari antrean} !
    */

    public Piaraan getPiaraan() {
        return piara;
    }

    public void enqueueAnabul(Anabul hewan) {
        piara.getLanabul().offer(hewan);
        piara.inkremenNbelm();
    }

    public boolean isMember(Anabul hewan) {
        return piara.getLanabul().contains(hewan);
    }

    public Anabul getAnabul() {
        return piara.getLanabul().peek();
    }

    public Anabul dequeueAnabul() {
        piara.dekremenNbelm();
        return piara.getLanabul().poll();
    }

    public void showAnabul() {
        for (Anabul x: piara.getLanabul()) {
            System.out.println(x.getNama());
        }
    }

    public int countKucing() {
        // Kamus Lokal
        int hasil;

        // Algoritma
        hasil = 0;
        for (Anabul x: piara.getLanabul()) {
            if (x instanceof Kucing) {
                hasil++;
            }
        }
        // {End for each}
        return hasil;
    }

    public int bobotKucing() {
        // Kamus Lokal
        int hasil;
        Kucing K;
        
        // Algorittma
        hasil = 0;
        for (Anabul x: piara.getLanabul()) {
            if (x instanceof Kucing) {
                K = (Kucing) x;
                hasil = hasil + K.getBobot();
            }
        }
        // {End for each}
        return hasil;
    }

    public void showJenisAnabul() {
        for (Anabul x: piara.getLanabul()) {
            System.out.println(x.getNama() + " (" + x.getClass().getName() + ")");
        }
    }
}