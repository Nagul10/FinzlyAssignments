
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.configure("hibernate.cfg.xml");
        return configuration.buildSessionFactory();
    }

    public static void main(String[] args) {

        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Read
        Employee employee1 = session.get(Employee.class,1001);
        System.out.println(employee1);
        transaction.commit();



        // Create
        transaction = session.beginTransaction();
        Employee employee2 = new Employee();
        employee2.setId(1002);
        employee2.setName("Ethan");
        employee2.setSalary("50000");
        session.save(employee2);
        transaction.commit();

        // Update
        transaction = session.beginTransaction();
        Employee employee3 = new Employee();
        employee3.setId(1002);
        employee3.setName("Ethan");
        employee3.setSalary("70000");
        session.update(employee3);
        transaction.commit();

        // Delete
        transaction = session.beginTransaction();
        Employee employee4 = new Employee();
        employee4.setId(1002);
        session.delete(employee4);
        transaction.commit();

        session.close();
    }
}
