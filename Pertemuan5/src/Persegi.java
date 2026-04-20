/* Nama File : Persegi.java
 * Deskripsi : Class Persegi, SubClass Abstract Bangun Datar
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

import java.lang.Math;

public class Persegi extends BangunDatar implements IResize {
    /* === ATRIBUT === */
    private double sisi;

    /* === METODE === */
    public Persegi() {
        this.jmlSisi = 4;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return sisi * 4;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2); 
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override 
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * (percent / 100);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar() {
    //     System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    // }
}

