package com.services;

import com.model.chef;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class chefServiceImpl implements chefService {

    @Autowired
    private SessionFactory sessionFactory;


    public List<chef> getchef() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<chef> chefList = session.createQuery("from chef", chef.class).list();
        transaction.commit();
        session.close();
        return chefList;
    }

    public chef create(chef chef) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(chef);
        transaction.commit();
        session.close();
        return chef;
    }

    public chef getchefById(int chef_id){
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        chef chef = session.get(chef.class,chef_id);
        transaction.commit();
        session.close();
        return chef;
    }


    public chef updatechef(chef chef){
        Session session= sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(chef);
        transaction.commit();
        session.close();
        return chef;
    }

    public chef deletechefById(int chef_id){
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        chef chef= session.get(chef.class,chef_id);
        session.delete(chef);
        transaction.commit();
        session.close();
        return chef;
    }

}
