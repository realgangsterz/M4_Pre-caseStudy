package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.model.aClass;
import com.codegym.service.ClassService;
import com.codegym.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassService classService;

    @ModelAttribute("classes")
public Iterable<aClass> classes(){
        return classService.findAll();
    }
    @GetMapping("")
    public ModelAndView getListStudent(){
        Iterable<Student> students = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("student/list");
        modelAndView.addObject("students",students);
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView getCreateStudentForm(){
        ModelAndView modelAndView = new ModelAndView("student/create");
        modelAndView.addObject("student",new Student());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView saveStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView("student/create");
        modelAndView.addObject("student",new Student());
        modelAndView.addObject("message","A new student was created !");
        return modelAndView;
    }
}
