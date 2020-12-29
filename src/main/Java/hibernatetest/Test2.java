package hibernatetest;

import hibernatetest.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {


    SessionFactory factory = new Configuration()
            .addAnnotatedClass(Person.class)
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {
        session.beginTransaction();
        Person person = session.get(Person.class, 12);

        session.getTransaction().commit();

        System.out.println(person);



    }catch (Exception e){

    }finally {
        session.close();
        factory.close();
    }




    }
}
