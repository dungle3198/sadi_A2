package com.example.sadi_A2.service;

import com.example.sadi_A2.model.Provider;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProviderService {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Provider> getAllProviders(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Provider.class);
        return criteria.list();
    }

    public Provider getProviderById(int id)
    {
        return (Provider) sessionFactory.getCurrentSession().get(Provider.class,id);
    }

    public void addProvider(Provider provider)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(provider);
    }
    public void updateProvider(Provider provider)
    {
        this.sessionFactory.getCurrentSession().update(provider);
    }

    public void deleteProvider(Provider provider)
    {
        this.sessionFactory.getCurrentSession().delete(provider);
    }
}
