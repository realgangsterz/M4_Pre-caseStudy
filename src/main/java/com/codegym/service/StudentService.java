package com.codegym.service;

import com.codegym.model.Student;

public interface StudentService {
    Iterable<Student> findAll();

    void save(Student student);

    Student findById(Long id);

    Student delete(Long id);
}
