package hibernatetest;

import hibernatetest.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Person.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 16);
//            session.delete(person);
            session.createQuery("delete Person where lastName='Pelevin'").executeUpdate();

            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
