package com.sc3.spring.service;


import com.sc3.spring.dao.StudentDao;
import com.sc3.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService   {
    @Autowired
    StudentDao studentDao;


    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void saveStudent(Student st) {
        getStudentDao().saveStudent(st);
    }


    public List<Student> getListStudent() {
        return getStudentDao().studentList();
    }
}
