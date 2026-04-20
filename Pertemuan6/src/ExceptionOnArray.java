/* Nama File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 April 2026
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Clean Up Code...");
        }
    }
}
