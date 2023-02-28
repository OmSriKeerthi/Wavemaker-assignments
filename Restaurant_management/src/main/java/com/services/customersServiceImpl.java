package com.services;

import com.model.customers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class customersServiceImpl implements customersService {

    @Autowired
    private SessionFactory sessionFactory;


    public List<customers> getcustomers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<customers> customersList = session.createQuery("from customers", customers.class).list();
        transaction.commit();
        session.close();
        return customersList;
    }

    public customers create(customers customers) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customers);
        transaction.commit();
        session.close();
        return customers;
    }

    public customers getcustomersById(int customer_id){
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        customers customers = session.get(customers.class,customer_id);
        transaction.commit();
        session.close();
        return customers;
    }


    public customers updatecustomers(customers customers){
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(customers);
        transaction.commit();
        session.close();
        return customers;
    }

    public customers deletecustomersById(int customer_id){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        customers customers= session.get(customers.class,customer_id);
        session.delete(customers);
        transaction.commit();
        session.close();
        return customers;
    }

}

