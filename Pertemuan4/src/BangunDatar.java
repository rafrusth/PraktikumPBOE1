/* Nama File : BangunDatar.java
 * Deskripsi : Abstract Class Bangun Datar
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 12 Maret 2026
 */

package P4;

public /* final */ class BangunDatar {
    /* === ATRIBUT === */
    protected int jlmSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    /* === METODE ===  */
    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jlmSisi, String warna, String border) {
        this.jlmSisi = jlmSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jlmSisi;
    }

    public void setJmlSisi(int sisi) {
        jlmSisi = sisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public /*final*/ void printInfo() {
        System.out.println("Jumlah Sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}