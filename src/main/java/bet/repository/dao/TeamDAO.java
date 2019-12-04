package bet.repository.dao;

import bet.entity.Team;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@Transactional
public class TeamDAO {

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Criteria criteria;



    public Team create(Team entity) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();

            return entity;
        }
    }

    public Team findById(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Team.class, id);

        }
    }

    public Team findByObject(Object o) {
        try(Session session = sessionFactory.openSession()) {
            return session.get(Team.class, (Serializable) o);
        }
    }

    public Team findByField(String field, Object key) {
        try (Session session = sessionFactory.openSession()) {
            criteria =  session.createCriteria(Team.class)
                    .add(Restrictions.eq(field, key));
            return (Team) criteria.uniqueResult();
        }
    }

    public List<Team> findAllField(){
        try(Session session = sessionFactory.openSession()) {
            return session.createCriteria(Team.class).list();
        }
    }

    public void update(Team entity) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        }
        //return entity;
    }

    public void delete(Team entity) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        }
    }

    public boolean isExist(Object o) {
        //TODO  сделать поиск по логину
        return findByObject(o) != null;
    }


}
