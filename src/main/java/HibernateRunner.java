import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Random;

public class HibernateRunner {

    public static void main(String[] args) {
        ElevService elevService = ElevService.getInstance();

        Elevi elev = elevService.getElev(6);

        Elevi elevNou = new Elevi();
        elevNou.numeElev = "omu' nou din scoala "
                + new Random().nextInt(1000);
        elevNou.idClasa = 2;

        elevService.createElev(elevNou);

        System.out.println(elev);

        Elevi cincidoicinci = elevService.getElev(525);

        System.out.println(cincidoicinci);

        HibernateUtil.shutdown();
    }


    public static Clasa getClasa(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Clasa clasa = session.find(Clasa.class, id);
            return clasa;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public static Materii getMaterii(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Materii materii = session.find(Materii.class, id);
            return materii;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static Profesori getProfesori(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Profesori profi = session.find(Profesori.class, id);
            return profi;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }



}
