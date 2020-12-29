package hibernatetest;

import hibernatetest.entity.Detail;
import hibernatetest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test7 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        Employee employee = new Employee("Artem","Andronnikov","IT",1500);
        Detail detail = new Detail("Moscow","213997","andf@wma.re");
        employee.setEmployeeDetail(detail);

        try {
            session.beginTransaction();

            session.save(employee);



            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
    }
}
