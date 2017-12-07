package com.sc3.spring.model;



/*
*@author mesuta
*@since 12/7/2017
*@version 1.0.0
 */

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "username")
    String username;
    @Column(name = "age")
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
