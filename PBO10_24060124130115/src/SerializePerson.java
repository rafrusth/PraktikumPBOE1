/* 
 * File      : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 22 Mei 2026
 */

import java.io.*;

class Person implements Serializable {
    /* === ATRIBUT === */
    private String name;


    /* === OPERATOR === */
    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Setya");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek Person");
            s.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }   
}
