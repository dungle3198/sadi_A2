package com.example.sadi_A2.service;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.sadi_A2.model.Category;

import java.util.List;

@Transactional
@Service
public class CategoryService {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public List<Category> getAllCategories(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Category.class);
        return criteria.list();
    }
    public Category getCategoryById(String id)
    {
        return (Category) sessionFactory.getCurrentSession().get(Category.class,id);
    }


}
