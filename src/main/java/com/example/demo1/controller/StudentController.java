package com.example.demo1.controller;

import com.example.demo1.entity.Student;
import com.example.demo1.repository.StudentRepository;
import com.example.demo1.service.StudentService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("stuco")
public class StudentController {

    @Autowired
    private StudentService studentService;
   // private StudentRepository studentRepository;

    @PostMapping("add")
    private Student addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @PostMapping("delete")//删除
    private void deleteStudent(Integer stuID){
       // JSONObject json=new JSONObject();//json数据封装
        studentService.deleteStudent(stuID);
        //json.put("code","delete success");
    }

    @PostMapping("update")
    private Student updateStudent(Student student)
    {
        return studentService.updateStudent(student);
    }

    @PostMapping("query")
    private Student queryStudent(Integer stuID)
    {
       return studentService.queryStudent(stuID);
    }
}
