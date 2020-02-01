import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class NoteService {

    private ElevService elevService = ElevService.getInstance();

    private static NoteService instance;

    public NoteService() {
    }

    public static NoteService getInstance() {
        if (instance == null) {
            instance = new NoteService();
        }
        return instance;
    }

    public List<Note> getNoteByIdElev(Integer idElev){
        Elevi elev = elevService.getElev(idElev);

        return elev.note;
    }

    public Note getNote(Note id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Note.class, id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void createNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(note);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void updateNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(note);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(note);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}