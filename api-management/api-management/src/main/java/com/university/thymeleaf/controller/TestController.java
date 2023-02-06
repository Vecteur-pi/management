package com.university.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.university.thymeleaf.model.Student;
import com.university.thymeleaf.services.StudentService;
@Controller
public class TestController {
 @Autowired
 private StudentService service;
 
 List<String> courses; 
 
 @ModelAttribute
 public void preLoad() {
  courses = new ArrayList<String>();
  courses.add("C");
  courses.add("CPP");
  courses.add("Java");
 }
 @RequestMapping(value = "/" , method = RequestMethod.GET)
 public String home(Model model, Student student) {
  model.addAttribute("courses", courses);
  return "register";
 }
 @RequestMapping(value = "/save",method = RequestMethod.POST)
 public String register(@ModelAttribute("student") Student student, Model model) {
  System.out.println("get coursess:::"+student.getCourse());
  service.save(student);
  return "welcome";
 }
}
