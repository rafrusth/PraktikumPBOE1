/* 
 * File      : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 Mei 2026
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Buat koneksi, nama DB, user, password, menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                            "jdbc:mysql://localhost/pbo",
                            "root", "1123e"
                        );
        
        // MySQL query
        String query = "INSERT INTO person(name) VALUES('"+ name +"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi DB
        con.close();
    }
}
