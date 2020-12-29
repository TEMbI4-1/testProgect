package hibernatetest;


import hibernatetest.entity.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();



        Person person = new Person("Viktor","Pelevin",
                "Splitska ulica 1","1000","Slovenia", 'F', LocalDate.of(1968,01,25));
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            System.out.println("Done");

        } catch (HibernateException e) {
            e.printStackTrace();
        }finally {
            session.close();
            factory.close();
        }


    }
}
