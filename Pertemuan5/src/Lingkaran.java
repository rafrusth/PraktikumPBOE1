/* Nama File : Lingkaran.java
 * Deskripsi : Class Lingkaran, SubClass Abstract Bangun Datar
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */


import java.lang.Math;

public class Lingkaran extends BangunDatar implements IResize {
    /* === ATRIBUT === */
    private double jari;

    /* === METODE === */
    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1,warna,border);
        this.jari = diameter;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * Math.pow(getJari(),2); 
    }

    public double getKeliling() {
        return 2 * Math.PI * getJari();
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override 
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * (percent / 100);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
}

