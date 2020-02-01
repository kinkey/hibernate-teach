import org.hibernate.Session;
import org.hibernate.Transaction;
public class ClasaService {
    private static ClasaService instance;
    private ClasaService() {
    }
    public static ClasaService getInstance() {
        if (instance == null) {
            instance = new ClasaService();
        }
        return instance;
    }
    public Clasa getClasa(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Clasa.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public void createClasa (Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(clasa);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void updateClasa (Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(clasa);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteClasa (Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(clasa);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}