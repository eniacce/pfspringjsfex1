package com.sc3.managedbean;


import com.sc3.spring.model.Student;
import com.sc3.spring.service.StudentService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "student")
@RequestScoped
public class StudentManagedBean implements Serializable{

    @ManagedProperty(value = "#{studentService}")
    StudentService studentService;


    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void deneme(){
        List<Student> listStudent = getStudentService().getListStudent();


        System.out.println("Deneme");
    }

}
