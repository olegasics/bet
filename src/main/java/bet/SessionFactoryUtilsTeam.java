package bet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtilsTeam {
    private static volatile SessionFactory sessionFactory;

    private SessionFactoryUtilsTeam() {
    }

    public static SessionFactory getInstance() {
        if (sessionFactory == null) {
            synchronized (SessionFactoryUtilsTeam.class) {
                if (sessionFactory == null) {
                    sessionFactory = new Configuration()
                            .configure("hibernate.cfg.xml")
                            .buildSessionFactory();
                }
            }
        }

        return sessionFactory;
    }
}
