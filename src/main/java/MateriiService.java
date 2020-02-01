import org.hibernate.Session;
import org.hibernate.Transaction;
public class MateriiService {
    private static MateriiService instance;
    public MateriiService() {
    }
    public static MateriiService getInstance() {
        if (instance == null) {
            instance = new MateriiService();
        }
        return instance;
    }
    public Materii getMaterie(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Materii.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public void CreateMaterie(Materii materie) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(materie);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void updateMaterie(Materii materie) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(materie);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteMaterie(Materii materie) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(materie);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}