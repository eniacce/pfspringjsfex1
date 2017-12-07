package com.sc3.spring.dao;

import com.sc3.spring.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class StudentDao {

    @Autowired
    SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void saveStudent(Student st) {
        getSessionFactory().getCurrentSession().save(st);

    }

    @Transactional
    public List<Student> studentList() {
        return getSessionFactory().getCurrentSession().createQuery("from Student").list();
    }
}
