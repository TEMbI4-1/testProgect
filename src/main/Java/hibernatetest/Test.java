package hibernatetest;


import hibernatetest.entity.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();



        Person person = new Person("Sergey","Gov","Tambovskaya 10","541023","Iran", 'M');
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            e.printStackTrace();
        }finally {
            session.close();
            factory.close();
        }


    }
}
