package com.codegym.formatter;

import com.codegym.model.aClass;
import com.codegym.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ClassFormatter implements Formatter<aClass> {

    private ClassService classService;

    @Autowired
    public ClassFormatter(ClassService classService) {
        this.classService = classService;
    }

    @Override
    public aClass parse(String text, Locale locale) throws ParseException {
        return classService.findById(Long.parseLong(text));
    }

    @Override
    public String print(aClass object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}