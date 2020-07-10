package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private com.codegym.model.aClass aClass;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, int age, String address, com.codegym.model.aClass aClass) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.aClass = aClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public com.codegym.model.aClass getaClass() {
        return aClass;
    }

    public void setaClass(com.codegym.model.aClass aClass) {
        this.aClass = aClass;
    }
}
