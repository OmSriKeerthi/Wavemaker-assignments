package com.dao;
import com.model.service;

import com.model.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class ServiceDAOImpl implements ServiceDAO{

    private static final Logger logger = LoggerFactory.getLogger(ServiceDAOImpl.class);

@Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
    @Override
    public List<service> services() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Location> locationList = session.createQuery("from services", Location.class).list();
        transaction.commit();
        session.close();
        return services();
    }

}
