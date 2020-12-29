package hibernatetest;

import hibernatetest.entity.Detail;
import hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test8 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        float x = 2.1f;
        double y =4.2;


        try {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
