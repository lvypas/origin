package org.lvypas.bws;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This a start point for Bike weight solution application.
 */
public class AppStart {

    /**
     * Main method. Start an application.
     * @param args is a array of String values.
     */
    public static void main(final String[] args) {

        SessionFactory sessionFactory;
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                    applySettings(configuration.getProperties()).
                    buildServiceRegistry();
            sessionFactory = configuration.
                    buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        FrontWheel fWheel = (FrontWheel) context.getBean("fWheel");
        RearWheel rWheel = (RearWheel) context.getBean("rWheel");
        Frame frame = (Frame) context.getBean("frame");
        Bike bike = (Bike) context.getBean("bike");

        session.save(fWheel);
        session.save(rWheel);
        session.save(frame);
        session.save(bike);

        session.getTransaction().commit();
        session.close();

    }
}
