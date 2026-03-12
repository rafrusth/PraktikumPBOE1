package P4;

import java.lang.Math;

public class Persegi extends BangunDatar {
    /* === ATRIBUT === */
    private double sisi;

    /* === METODE === */
    public Persegi() {
        setJmlSisi(4);
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
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // @Override
    // public void printCounterBangunDatar() {
    //     System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    // }
}

