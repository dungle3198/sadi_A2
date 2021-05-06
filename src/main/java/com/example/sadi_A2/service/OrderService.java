package com.example.sadi_A2.service;

import com.example.sadi_A2.model.Order;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrderService {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Order> getAllOrders(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Order.class);
        return criteria.list();
    }

    public Order getOrderById(int id)
    {
        return (Order) sessionFactory.getCurrentSession().get(Order.class,id);
    }

    public void addOrder(Order order)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(order);
    }
    public void updateOrder(Order order)
    {
        this.sessionFactory.getCurrentSession().update(order);
    }

    public void deleteOrder(Order order)
    {
        this.sessionFactory.getCurrentSession().delete(order);
    }
}
