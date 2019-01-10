package com.example.demo1.controller;

import com.example.demo1.entity.Student;
import com.example.demo1.service.StudentService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pages")
public class StudentPagesController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getall")
    public String getAllstu(Model model){
        List<Student> list=studentService.getAllstu();
        model.addAttribute("stus",list);
        return "index";
    }

    @GetMapping("/findByID/{id}")
   public String findByID(@PathVariable("id") Integer ID,Model model ){
        Student student=studentService.queryStudent(ID);
        model.addAttribute("stu",student);
        return "studetail";
    }

    @GetMapping ("/update")
    public String updateStu(Model model,Student student){
        studentService.updateStudent(student);
        return "redirect:/pages/getall";
    }

    @GetMapping("/delstu/{id}")
    public String delstu(@PathVariable("id") Integer ID){
        studentService.deleteStudent(ID);
        return "redirect:/pages/getall";
    }

    @GetMapping("/add")
    public String addstu(Student student){
        studentService.addStudent(student);
        return "redirect:/pages/getall";
    }
}
