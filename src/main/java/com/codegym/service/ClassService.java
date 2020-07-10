package com.codegym.service;

import com.codegym.model.aClass;

public interface ClassService {
    Iterable<aClass> findAll();

    void save(aClass c);

    aClass findById(Long id);

    aClass delete(Long id);
}
