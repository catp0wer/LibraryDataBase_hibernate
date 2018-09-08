package base;
import db.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibTest {
    public static void main(String[] args) {
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        author1.setId(1);
        author1.setFirst_Name("Scott");
        author1.setLast_Name("Kelly");
        author1.setYear_of_Birth("1970");

        author2.setId(2);
        author2.setFirst_Name("Stephen");
        author2.setLast_Name("Hawking");
        author2.setYear_of_Birth("1942");

        author3.setId(3);
        author3.setFirst_Name("Daniel");
        author3.setLast_Name("Kahneman");
        author3.setYear_of_Birth("1934");

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author1);
        session.save(author2);
        session.save(author3);
        session.getTransaction().commit();
        session.close();

    }
}
