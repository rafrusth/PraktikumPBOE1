/* 
 * File      : DAOManager.java
 * Deskripsi : Pengelola DAO dalam program
 * Pembuat   : Rafif Setya Imaduddin (24060124130115)
 * Tanggal   : 20 Mei 2026
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
