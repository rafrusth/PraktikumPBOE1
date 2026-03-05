public class Matakuliah {
    /* === ATRIBUT === */
    private String idMatKul;
    private String Nama;
    private int SKS;

    /* === METODE === */
    // Konstruktor 
    //= Tanpa Parameter
    public Matakuliah() {
        idMatKul = "";
        Nama = "";
        SKS = 0;
    }

    //= Parameter
    public Matakuliah(String ID, String Nama, int SKS) {
        idMatKul = ID;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    // Selektor
    public String getID() {
        return idMatKul;
    }

    public String getNama() {
        return Nama;
    }

    public int getSKS() {
        return SKS;
    }

    // Mutator
    public void setID(String ID) {
        idMatKul = ID;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    // Operator
}
