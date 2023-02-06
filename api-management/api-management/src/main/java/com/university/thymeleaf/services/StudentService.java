package com.university.thymeleaf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.university.thymeleaf.model.Student;
import com.university.thymeleaf.repository.StudentRepository;
@Service
public class StudentService {
 @Autowired
 private StudentRepository repository;
 public void save(Student student) {
  repository.save(student);
 }
}
