package com.codegym.service.impl;

import com.codegym.model.aClass;
import com.codegym.repository.aClassRepository;
import com.codegym.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassServiceImpl implements ClassService {

    @Autowired
    private aClassRepository classRepository;

    @Override
    public Iterable<aClass> findAll() {
        return classRepository.findAll();
    }

    @Override
    public void save(aClass c) {

    }

    @Override
    public aClass findById(Long id) {
        return null;
    }

    @Override
    public aClass delete(Long id) {
        return null;
    }
}
