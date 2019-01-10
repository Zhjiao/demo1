package com.example.demo1.service;

import com.example.demo1.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Integer stuID);
    Student queryStudent(Integer stuID);
    List<Student> getAllstu();

}
