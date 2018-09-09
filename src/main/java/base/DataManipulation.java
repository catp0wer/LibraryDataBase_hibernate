package base;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import db.Author;


public class DataManipulation {

    public SessionFactory getSessionFactory(){

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }


    public void Insert(Author author){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }
}

