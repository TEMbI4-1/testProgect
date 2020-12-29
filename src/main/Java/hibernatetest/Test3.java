package hibernatetest;

import hibernatetest.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(Person.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try {
            session.beginTransaction();

            //List<Person> people = session.createQuery("from Person").getResultList();
            List<Person> people1 = session.createQuery("from Person where lastName='Petrov' and firstName='Vasiliy'").getResultList();

            for (Person person : people1) {
                System.out.println(person);
            }

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}

