package com.example.sadi_A2.service;

import com.example.sadi_A2.model.Customer;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Customer> getAllCustomers(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Customer.class);
        return criteria.list();
    }

    public Customer getCustomerById(int id)
    {
        return (Customer) sessionFactory.getCurrentSession().get(Customer.class,id);
    }

    public void addCustomer(Customer customer)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(customer);
    }
    public void updateCustomer(Customer customer)
    {
        this.sessionFactory.getCurrentSession().update(customer);
    }

    public void deleteCustomer(Customer customer)
    {
        this.sessionFactory.getCurrentSession().delete(customer);
    }
}
