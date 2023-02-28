package com.services;

import com.model.waiter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class waiterServiceImpl implements waiterService {

    @Autowired
    private SessionFactory sessionFactory;


    public List<waiter> getwaiter() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<waiter> waiterList = session.createQuery("from waiter", waiter.class).list();
        transaction.commit();
        session.close();
        return waiterList;
    }

    public waiter create(waiter waiter) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(waiter);
        transaction.commit();
        session.close();
        return waiter;
    }

    public waiter getwaiterById(int waiter_id){
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        waiter waiter = session.get(waiter.class,waiter_id);
        transaction.commit();
        session.close();
        return waiter;
    }


    public waiter updatewaiter(waiter waiter){
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(waiter);
        transaction.commit();
        session.close();
        return waiter;
    }

    public waiter deletewaiterById(int waiter_id){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        waiter waiter= session.get(waiter.class,waiter_id);
        session.delete(waiter);
        transaction.commit();
        session.close();
        return waiter;
    }

}

