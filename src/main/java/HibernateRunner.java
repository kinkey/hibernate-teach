import org.hibernate.Session;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Elevi elev = session.find(Elevi.class, 5);
        System.out.println(elev);

        Elevi newElev = new Elevi();
        newElev.numeElev = "dinHibernate";
        newElev.idClasa = 2;

        session.save(newElev);

        System.out.println(newElev);

        newElev.numeElev = "updatedDinHibernate";

        session.saveOrUpdate(newElev);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
