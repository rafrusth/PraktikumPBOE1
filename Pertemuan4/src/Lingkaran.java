package P4;

import java.lang.Math;

public class Lingkaran extends BangunDatar{
    /* === ATRIBUT === */
    private double jari;

    /* === METODE === */
    public Lingkaran() {
        jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1,warna,border);
        jari = diameter;
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
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
}

