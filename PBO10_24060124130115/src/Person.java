/* 
 * File      : Person.java
 * Deskripsi : Person database model
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 Mei 2026
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
