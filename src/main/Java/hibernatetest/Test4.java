package hibernatetest;

import hibernatetest.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            List<Person> resultList = session.createQuery("from Person where id>5 and  id<8 ").getResultList();
//            for (Person person : resultList) {
//                String firstName = person.getFirstName();
//                String lastName = person.getLastName();
//                person.setFirstName(lastName);
//                person.setLastName(firstName);
//            }
            session.createQuery("update Person set lastName='Grigogev' where lastName = 'Gov'").executeUpdate();


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }

    }
}
