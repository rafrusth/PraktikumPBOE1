package P4;

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(4, "Merah", "Continuous");
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(6.7, "Hitam", "Dot-dot");

        System.out.println("Sisi P1: " + P1.getJmlSisi());
        P1.setSisi(5);

        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling P1: " + P1.getKeliling());
        System.out.println("Diagonal P2: " + P2.getDiagonal());

        System.out.println("Jari-jari L2: " + L2.getJari());
        L1.setJari(6.76767);
        System.out.println("Jari-jari L1 sekarang: " + L1.getJari());

        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());

        P2.printInfo();
        L2.printInfo();

    }
}
