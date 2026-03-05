public class Kendaraan {
    /* === ATRIBUT === */
    private String noPlat;
    private String Jenis;
    
    /* === METODE === */
    // Konstruktor
    //= Tanpa Parameter
    public Kendaraan() {
        noPlat = "";
        Jenis = "";
    }

    //= Parameter
    public Kendaraan(String Plat, String Jenis) {
        noPlat = Plat;
        this.Jenis = Jenis;
    }

    // Selektor
    public String getPlat() {
        return noPlat;
    }

    public String getJenis() {
        return Jenis;
    }

    // Mutator
    public void setPlat(String Plat) {
        noPlat = Plat;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    // Operator
}
