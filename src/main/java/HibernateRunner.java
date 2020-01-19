import org.hibernate.Session;

import java.util.Properties;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();



        //Save Account
        //session.save(account);
        //Save Employee
        //emp.setAccount(account);
        //session.save(emp);

        session.getTransaction().commit();

        HibernateUtil.shutdown();

    }
}
