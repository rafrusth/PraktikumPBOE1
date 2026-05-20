/* 
 * File      : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 Mei 2026
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Setya");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
