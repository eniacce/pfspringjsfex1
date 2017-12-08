package com.sc3.managedbean;


import com.sc3.spring.model.Student;
import com.sc3.spring.service.StudentService;
import org.springframework.validation.BindingResult;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "student")
@RequestScoped
public class StudentManagedBean implements Serializable {

    @ManagedProperty(value = "#{studentService}")
    StudentService studentService;
    BindingResult br;




    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void deneme() {
        System.out.println(this.getUsername());

        System.out.println("Test");
        List<Student> listStudent = getStudentService().getListStudent();
        System.out.println("Deneme");
    }

}
