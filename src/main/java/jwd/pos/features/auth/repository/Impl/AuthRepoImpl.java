package jwd.pos.features.auth.repository.Impl;


import jwd.pos.features.auth.repository.AuthRepo;
import jwd.pos.model.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepoImpl implements AuthRepo {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findUserByName(String name) {
        return sessionFactory.getCurrentSession()
                .createQuery("From User u where username=:username", User.class)
                .setParameter("username",name)
                .uniqueResult();
    }
}
