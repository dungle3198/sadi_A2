package com.example.sadi_A2.service;

import com.example.sadi_A2.model.Staff;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StaffService {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Staff> getAllStaffs(){
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Staff.class);
        return criteria.list();
    }

    public Staff getStaffById(int id)
    {
        return (Staff) sessionFactory.getCurrentSession().get(Staff.class,id);
    }

    public void addStaff(Staff staff)
    {
        this.sessionFactory.getCurrentSession().saveOrUpdate(staff);
    }
    public void updateStaff(Staff staff)
    {
        this.sessionFactory.getCurrentSession().update(staff);
    }

    public void deleteStaff(Staff staff)
    {
        this.sessionFactory.getCurrentSession().delete(staff);
    }
}
